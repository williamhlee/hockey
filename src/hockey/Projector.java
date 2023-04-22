package hockey;
import java.io.IOException;

public class Projector {


	public static void main(String[] args) {
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("cores: " + cores);

		double startTime = System.currentTimeMillis();
		System.out.println("Start: " + (new java.util.Date()) );

		ExcelReader er = null;
		try {
//			er = new ExcelReader("C:\\Users\\Bill-PC\\Desktop\\NHL 2017 Playoffs-factor - Java.xlsm");
//			er = new ExcelReader("C:\\Users\\Bill-PC\\Desktop\\2018 NHL All Picks-java.xlsx");
//			er = new ExcelReader("C:\\dev\\Hockey\\2019 NHL All Picks-java.xlsx");
//			er = new ExcelReader("C:\\dev\\Hockey\\2020 NHL All Picks-java.xlsx");
//			er = new ExcelReader("C:\\dev\\Hockey\\2021 NHL All Picks-java.xlsx");
//			er = new ExcelReader("C:\\dev\\Hockey\\2022 NHL All Picks-java.xlsx");
//			er = new ExcelReader("C:\\dev\\Hockey\\2022 NHL All Picks-java-test.xlsx");
			er = new ExcelReader("C:\\dev\\Hockey\\2023 NHL All Picks-java.xlsx");

			er.readData();
			er.processSeries(1, 1, "");

			System.out.println("Done processing series: " + (System.currentTimeMillis() - startTime)/1000 + " seconds");

//			TreeMap<String, Double> sm = new TreeMap<>(er.getWinnersList());
//			for (Entry<String, Double> wl : sm.entrySet()) {
//	        	System.out.println(wl.getKey() + "; " + wl.getValue() / er.getNumOfResluts() + "; " + wl.getValue());
//        	}

			for (Person p : er.getAllPicksList()) {
	        	System.out.println(p.getName() + "; " + p.getTotalScore() / er.getNumOfResluts() + "; " + p.getTotalScore());
        	}

        	System.out.println("numOfRuns; " + er.getNumOfRuns());
        	System.out.println("numOfResluts; " + er.getNumOfResluts());

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: " + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

	}

}
