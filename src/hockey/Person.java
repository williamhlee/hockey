package hockey;

public class Person {

	private String name = "";
	Pick picksArray[] = new Pick[16];

	private long potentialPoints = 0;
	private Double totalScore = 0.0;

	public Double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}

	public Person(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Map<Integer, Pick> getPicks() {
//		return picks;
//	}

	public Pick[] getPicksArray() {
		return picksArray;
	}

	public long getPotentialPoints() {
		return potentialPoints;
	}

	public void setPotentialPoints(int potentialPoints) {
		this.potentialPoints = potentialPoints;
	}

	public void addPicks(int round, Pick p) {
		picksArray[round] = p;
	}

	public int score(Person winner) {
		int score = 0;
		int j = 0;
		boolean correctPick = false;

		for (int i = 1; i<16; i++) {
			j=i;
			correctPick = false;
//			if (picks.get(i).getTeam().equals(winner.getPicks().get(i).getTeam())) {
			if (picksArray[i].getTeam().equals(winner.getPicksArray()[i].getTeam())) {
				correctPick = true;

// This is for when the reshuffle after the first round
//			} else if ((i==9) && (picks.get(i).getTeam().compareTo(winner.getPicks().get(i+1).getTeam())==0)) {
//				j=i+1;
//				correctPick = true;
//			} else if ((i==10) && (picks.get(i).getTeam().compareTo(winner.getPicks().get(i-1).getTeam())==0)) {
//				j=i-1;
//				correctPick = true;
//			} else if ((i==11) && (picks.get(i).getTeam().compareTo(winner.getPicks().get(i+1).getTeam())==0)) {
//				j=i+1;
//				correctPick = true;
//			} else if ((i==12) && (picks.get(i).getTeam().compareTo(winner.getPicks().get(i-1).getTeam())==0)) {
//				j=i-1;
//				correctPick = true;

//This was for 2021 when they reshuffled the final 4
//			} else if ((i==13) && (picks.get(i).getTeam().compareTo(winner.getPicks().get(i+1).getTeam())==0)) {
//				j=i+1;
//				correctPick = true;
//			} else if ((i==14) && (picks.get(i).getTeam().compareTo(winner.getPicks().get(i-1).getTeam())==0)) {
//				j=i-1;
//				correctPick = true;
			}
			if (correctPick) {
				if (i<9) {
					//round 1
					score = score + 2;
				} else if (i<13) {
					//round 2
					score = score + 3;
				} else if (i<15) {
					//round 3
					score = score + 4;
				} else {
					//round 4
					score = score + 5;
				}
//				if (picks.get(i).getGames() == (winner.getPicks().get(j).getGames())) {
				if (picksArray[i].getGames() == (winner.getPicksArray()[j].getGames())) {
					score = score + 1;
				}
			}
		}
		potentialPoints = score;
		return score;
	}

	@Override
	public String toString() {
		String result = name;

//        for (int round = 1; round <= picks.size(); round += 1) {
//        	result = result + " round=" + round + " " + picks.get(round).toString() + ";";
//        }
        for (int round = 1; round <= 15; round += 1) {
        	result = result + " round=" + round + " " + picksArray[round].toString() + ";";
        }

		return result;
	}
}
