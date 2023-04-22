package hockey;
import java.io.IOException;
import java.util.Map.Entry;

public class ProjectorThreading {


	public static void main(String[] args) {
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("cores: " + cores);

		double startTime = System.currentTimeMillis();
		System.out.println("Start: " + (new java.util.Date()) );

		ExcelReader er = null;
		try {
//			er = new ExcelReader("C:\\Users\\Bill-PC\\Desktop\\NHL 2017 Playoffs-factor - Java.xlsm");
			er = new ExcelReader("C:\\Users\\Bill-PC\\Desktop\\2018 NHL All Picks-java.xlsx");

			er.readData();
			er.processSeries(1, 1, "");

			System.out.println("Done processing series: " + (System.currentTimeMillis() - startTime)/1000 + " seconds");
//    	    System.out.println("winnerTime processing series: " + er.getWinnerTime()/1000 + " seconds");
//    	    System.out.println("scoreTime processing series: " + er.getScoreTime()/1000 + " seconds");

			for (Entry<String, Double> wl : er.getWinnersList().entrySet()) {
//	        	System.out.println(wl.getKey() + "; " + wl.getValue() / er.getNumOfResluts() + "; " + er.getWinnersCount().get(wl.getKey()));
	        	System.out.println(wl.getKey() + "; " + wl.getValue() / er.getNumOfResluts() + "; " + wl.getValue());
        	}
//        	for (String name : winnersList.keySet()) {
//	        	System.out.println(name + "; " + winnersList.get(name) / numOfResluts + "; " + winnersCount.get(name));
//        	}

//        	for (Integer i = 1; i < 16; i++ ) {
//        		Map<String, String> uw = uniqueWinnersRound.get(i);
//        		for (String key : uw.keySet()) {
//            		System.out.println("round " + i + " " + key);
//            	}
//        	}

        	System.out.println("numOfRuns; " + er.getNumOfRuns());
        	System.out.println("numOfResluts; " + er.getNumOfResluts());

//			er = new ExcelReader("C:\\Bill\\NHL 2017 Playoffs-factor - Java.xlsm");
//			int i = er.getRowNumber();
//			System.out.println("read");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: " + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

	}

}
