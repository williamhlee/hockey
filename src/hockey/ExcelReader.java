package hockey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

//	private static final int LAST_COL = 101; //for 2019 this is CW
//	private static final int LAST_COL = 61; //for 2020 this is BJ
//	private static final int LAST_COL = 79; //for 2022 this is CB
	private int maxCol = 0; //for 2022 this is CB
	private static final int LAST_ROW = 15;
	private boolean seriesFinished[]= new boolean[16];
    private int[] nextSeriesArray = new int[] {0,9,9,10,10,11,11,12,12,13,13,14,14,15,15,0};

	private List<Person> allPicksList = new ArrayList<>();
//TODO implement allPicksListArray
	private Person allPicksListArray[];

	private Map<String, Double> winnersList = new HashMap<>();
    private Double[] winnersScore;

	private Set<String>[] uniqueWinnersRoundArray = new Set[16]; //Map<String, String>[16];

	private Person winner;
	private Person team1;
	private Person team2;
	private long numOfRuns = 0;
	private long numOfResluts = 0;
	private long resultBuffer = 0;
	private int highScore = 0;
	double highScoreCount = 0.0;
	int games = 0;
	double startTime = System.currentTimeMillis();

	String filePath;
	int score;
	double hits = 0.0;

	ExecutorService executor = Executors.newSingleThreadExecutor();

//	public Map<String, Person> getAllPicks() {
//		return allPicks;
//	}
//
//	public void setAllPicks(Map<String, Person> allPicks) {
//		this.allPicks = allPicks;
//	}

	public List<Person> getAllPicksList() {
		return allPicksList;
	}
	public void setAllPicksList(List<Person> allPicksList) {
		this.allPicksList = allPicksList;
	}

	public Map<String, Double> getWinnersList() {
		return winnersList;
	}

	public void setWinnersList(Map<String, Double> winnersList) {
		this.winnersList = winnersList;
	}

	public Double[] getWinnersScore() {
		return winnersScore;
	}

	public void setWinnersScore(Double[] winnersScore) {
		this.winnersScore = winnersScore;
	}

	public boolean[] getSeriesFinished() {
		return seriesFinished;
	}

	public void setSeriesFinished(boolean[] seriesFinished) {
		this.seriesFinished = seriesFinished;
	}

	public Person getWinner() {
		return winner;
	}

	public void setWinner(Person winner) {
		this.winner = winner;
	}

	public Person getTeam1() {
		return team1;
	}

	public void setTeam1(Person team1) {
		this.team1 = team1;
	}

	public Person getTeam2() {
		return team2;
	}

	public void setTeam2(Person team2) {
		this.team2 = team2;
	}

//	public Map<Integer, Map<String, String>> getUniqueWinnersRound() {
//		return uniqueWinnersRound;
//	}
//
//	public void setUniqueWinnersRound(Map<Integer, Map<String, String>> u) {
//		this.uniqueWinnersRound = u;
//	}

	public Set<String>[] getUniqueWinnersRoundArray() {
		return uniqueWinnersRoundArray;
	}

	public void setUniqueWinnersRoundArray(Set<String>[] u) {
		this.uniqueWinnersRoundArray = u;
	}

	public long getNumOfRuns() {
		return numOfRuns;
	}

	public long getNumOfResluts() {
		return numOfResluts;
	}

//	public double getWinnerTime() {
//		return winnerTime;
//	}
//
//	public double getScoreTime() {
//		return scoreTime;
//	}

    public ExcelReader(String filePath) throws InvalidFormatException, IOException {
        this(filePath, true);
    }

    public ExcelReader(String f, boolean ignoreFormula) {
    	filePath = f;
    }

    public void readData() throws InvalidFormatException, IOException  {
    	int pickValue = 0;

    	if (filePath.equalsIgnoreCase("")) {
    		return;
    	}
//		System.out.println("Start: " + (new java.util.Date()) );
    	String team = "";

        try {

            FileInputStream excelFile = new FileInputStream(new File(filePath));
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Cell currentCell;
            int round = 0;

            for (int col = 0; col < 1000; col++) {
            	currentCell = datatypeSheet.getRow(0).getCell(col);
            	if (currentCell == null || currentCell.getStringCellValue().compareTo("")==0 || col>1000) {
            		maxCol = col;
            		break;
            	}
            }

//TODO implement allPicksListArray
            allPicksListArray = new Person[((maxCol/2)-3)];
            winnersScore = new Double[((maxCol/2)-3)];

            for (int col = 0; col < (maxCol-1); col += 2) {
//            	System.out.println("Starting col " + col);
            	currentCell = datatypeSheet.getRow(0).getCell(col);
            	if (currentCell != null && currentCell.getStringCellValue().compareTo("")!=0) {
	            	Person person = new Person(currentCell.getStringCellValue());
	            	round = 0;
	            	for (int row = 1; row <= LAST_ROW; row++) {
//	                	System.out.println("Starting row " + row);
	                	currentCell = datatypeSheet.getRow(row).getCell(col);
//	                	if (currentCell != null && currentCell.getStringCellValue().compareTo("")!=0) {
	                		team = "";
	                		if (currentCell != null && currentCell.getCellTypeEnum() == CellType.STRING && currentCell.getStringCellValue().compareTo("")!=0) {
	                			team = currentCell.getStringCellValue().trim();
	                		}
	                		games = 0;
	                		if (datatypeSheet.getRow(row).getCell(col+1) != null && datatypeSheet.getRow(row).getCell(col+1).getCellTypeEnum() == CellType.NUMERIC) {
	                			games = (int) datatypeSheet.getRow(row).getCell(col+1).getNumericCellValue();
	                		}

	                    	round++;
//            				if (round<=8) {
//            					//round 1
//            					pickValue = 2;
//            				} else if (round<=12) {
//            					//round 2
//            					pickValue = 3;
//            				} else if (round<=14) {
//            					//round 3
//            					pickValue = 4;
//            				} else {
//            					//round 4
//            					pickValue = 5;
//            				}
	                    	Pick pick = new Pick(team, games, true, pickValue);
	                    	if ((person.getName().compareToIgnoreCase("Winner")!=0) && (person.getName().compareToIgnoreCase("team1")!=0) && (person.getName().compareToIgnoreCase("team2")!=0)) {
	                    		if (uniqueWinnersRoundArray[round] != null) {
	                    			Set<String> uniqueWinners = uniqueWinnersRoundArray[round];
		                    		if (!uniqueWinners.contains(team)) {
			                    		uniqueWinners.add(team);
			                    		uniqueWinnersRoundArray[round] = uniqueWinners;
			                    	}

		                    	} else {
		                    		Set<String> uniqueWinners = new HashSet<String>();
		                    		uniqueWinners.add(team);
		                    		uniqueWinnersRoundArray[round] = uniqueWinners;
		                    	}
	                    	}

//		                	System.out.println("processing row with a pick " + row);
		                	person.addPicks(round, pick);
		                	if (row != 0.0 && person.getName().compareToIgnoreCase("Winner")==0 && (pick.getTeam() != null && pick.getTeam().compareTo("") != 0)) {
		                		seriesFinished[round] = true;
		                	}
//	                	} else {
//	                    	Pick pick = new Pick("", 0, false, 0);
//		                	person.addPicks(round, pick);
//	                	}
//	                	System.out.println("Ending row " + row);
	                }
                	if (person.getName().compareToIgnoreCase("Winner")==0) {
//                		int value = 0;
//                        for (int i = person.getPicks().size(); i < 15; i++) {
//            				if (i<8) {
//            					//round 1
//            					value = 2;
//            				} else if (i<12) {
//            					//round 2
//            					value = 3;
//            				} else if (i<14) {
//            					//round 3
//            					value = 4;
//            				} else {
//            					//round 4
//            					value = 5;
//            				}
//
//	                    	Pick pick = new Pick("", 0, false, value);
//	                    	person.getPicks().put(i+1, pick);
//                        }
                		winner = person;
                	} else if (person.getName().compareToIgnoreCase("team1")==0) {
//                        for (int i = person.getPicks().size(); i < 15; i++) {
//	                    	Pick pick = new Pick("", 0, false, 0);
//	                    	person.getPicks().put(i+1, pick);
//                        }
                		team1 = person;
                	} else if (person.getName().compareToIgnoreCase("team2")==0) {
//                        for (int i = person.getPicks().size(); i < 15; i++) {
//	                    	Pick pick = new Pick("", 0, false, 0);
//	                    	person.getPicks().put(i+1, pick);
//                        }
                		team2 = person;
                	} else {
//                		allPicks.put(person.getName(), person);
                		allPicksList.add(person);
//TODO implement allPicksListArray
                		allPicksListArray[((col/2)-3)] = person;

                		winnersList.put(person.getName(), 0.0);
                		winnersScore[((col/2)-3)] = 0.0;
                	}
//		        	System.out.println(person);
//	                System.out.println(col);
            	}
//            	System.out.println("Ending col " + col);
            }

//            datatypeSheet.
            workbook.close();
            excelFile.close();
//			System.out.println("Done with Excel: " + (System.currentTimeMillis() - startTime)/1000 + " seconds");
//			System.out.println("allPicks: " + allPicks);
//			System.out.println("seriesFinished: " + seriesFinished);
//			System.out.println("team1: " + team1);
//			System.out.println("team2: " + team2);
//			System.out.println("uniqueWinnersRound: " + uniqueWinnersRound);
//			System.out.println("winner: " + winner);
//			System.out.println("winnersList: " + winnersList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void processSeries(int series, int factor, String teamResults) {

    	int ser;
    	int minGame;
    	int localFactor;
		String team;
//		int nextSeries = 0;

        for (ser = 1; ser <= 2; ser += 1) {
	        localFactor = factor;
	        if (seriesFinished[series]) {
	            ser = 3;
	            minGame = 7;
	        } else {

            	minGame = 0;
        		if (ser == 1) {
//	            	minGame = team1.getPicks().get(series).getGames();
//	            	team = team1.getPicks().get(series).getTeam();
//	            	winner.getPicks().get(series).setTeam(team);

	            	minGame = team1.getPicksArray()[series].getGames();
	            	team = team1.getPicksArray()[series].getTeam();
	            	winner.getPicksArray()[series].setTeam(team);
        		} else {
//	            	minGame = team2.getPicks().get(series).getGames();
//	            	team = team2.getPicks().get(series).getTeam();
//	            	winner.getPicks().get(series).setTeam(team);

	            	minGame = team2.getPicksArray()[series].getGames();
	            	team = team2.getPicksArray()[series].getTeam();
	            	winner.getPicksArray()[series].setTeam(team);
        		}

        		if ((series & 1) == 0) {
	            	if (nextSeriesArray[series] != 0) {
            			team2.getPicksArray()[nextSeriesArray[series]].setTeam(team);
	            		team2.getPicksArray()[nextSeriesArray[series]].setGames(4);

            			team2.getPicksArray()[nextSeriesArray[series]].setTeam(team);
	            		team2.getPicksArray()[nextSeriesArray[series]].setGames(4);
}
            	} else {
	            	if (nextSeriesArray[series] != 0) {
            			team1.getPicksArray()[nextSeriesArray[series]].setTeam(team);
	            		team1.getPicksArray()[nextSeriesArray[series]].setGames(4);

	            		team1.getPicksArray()[nextSeriesArray[series]].setTeam(team);
	            		team1.getPicksArray()[nextSeriesArray[series]].setGames(4);
	            	}
            	}

	            if (minGame == 0) {
	                minGame = 4;
	            }

	            //this is if no one picks the team at all
	            if (!uniqueWinnersRoundArray[series].contains(team)) {
	                if (localFactor == 1) {
	                    localFactor = 8 - minGame; //4
	                } else {
	                    localFactor = localFactor * (8 - minGame); //4
	                }
	                minGame = 7;
	            }

	        }

			//loop through the remaining games in the series for calculating the winner
	        for (int game = minGame; game <= 7; game++) {
	        	loopThroughTheRest(game, series, localFactor, teamResults);
	        }

        }

	}

	//loop through the remaining games in the series for calculating the winner
    private void loopThroughTheRest(int game ,int series, int localFactor, String teamResults) {

    	int localGame;
		String localTeamResults = "";

//        for (int game = minGame; game <= 7; game++) {
            if (!seriesFinished[series]) {
        		winner.getPicksArray()[series].setGames(game);
            }

            localGame = winner.getPicksArray()[series].getGames();

            if (series == 15) {
            	hits = 0.0;
        		highScore = scoreMethod();

        		for (Person n : allPicksList) {
    		        if (n.getPotentialPoints() == highScore) {
    		            hits = hits + 1;
    		            // This shows the winner based on a specific team winnig the cup
//    		            if (winner.getPicksArray()[series].getTeam().equals("St Louis")) {
//    		    			System.out.println("person; " + n.getName());
//    		            }
    		            //This shows a specific persons winning picks
//    		            if (n.getName().equals("Seth")) {
//    		    			System.out.println("person; " + n.getName() + "; highScore; " + ((1 / highScoreCount) * localFactor) + "; "  + winner);
//    		    		}

//		                winnersList.put(n.getName(), winnersList.get(n.getName()) + (1 / highScoreCount) * localFactor);
		                n.setTotalScore(n.getTotalScore() + (1 / highScoreCount) * localFactor);
                        localTeamResults = n.getName() + " ; " +  teamResults + " ; " + winner.getPicksArray()[series].getTeam() + " in " + localGame;
//    		            System.out.println("winner " + ((1 / highScoreCount) * localFactor) + "; " + localTeamResults);
        		        if ((hits - highScoreCount) >= 0.0) {
        		        	break;
        		        }
    		        }
            	}

                numOfRuns = numOfRuns + 1;
                numOfResluts = numOfResluts + localFactor;
                if (resultBuffer < numOfResluts) {
                	resultBuffer = resultBuffer + 100000000;
                }

            } else {
//            	if (teamResults.compareTo("")==0) {
            	if (teamResults.equals("")) {
            		localTeamResults = winner.getPicksArray()[series].getTeam() + " in " + localGame;
            	} else {
            		localTeamResults = teamResults + " ; " + winner.getPicksArray()[series].getTeam() + " in " + localGame;
            	}

            	//This show the progress of what series is being processed
				if (series <= 7) {
					System.out.println("Processing " + series + "; team " + winner.getPicksArray()[series].getTeam() + "; localGame " + localGame + "; at " + (new java.util.Date()));
				}

                processSeries(series + 1, localFactor, localTeamResults);
            }

    }

    private int scoreMethod() {
    	highScore = 0;
    	highScoreCount = 0.0;

		for (Person p : allPicksList) {
			score = p.score(winner);
			if (score > highScore) {
				highScore = score;
				highScoreCount = 1.0;
			} else if (score == highScore) {
				highScoreCount++;
			}
    	}

		return highScore;
    }
}
