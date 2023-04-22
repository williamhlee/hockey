package test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import hockey.ExcelReader;
import hockey.Person;
import hockey.Pick;

public class ExcelReaderTest {
/*
	expectedWinnersList.put("JJ", XX);
	expectedWinnersList.put("Seth", XX);
	expectedWinnersList.put("Pat", XX);
	expectedWinnersList.put("Jay", XX);
	expectedWinnersList.put("KevinC", XX);
	expectedWinnersList.put("Pickle", XX);
	expectedWinnersList.put("EricL", XX);
	expectedWinnersList.put("EricK", XX);
	expectedWinnersList.put("Terry", XX);
	expectedWinnersList.put("John", XX);
	expectedWinnersList.put("Vineel", XX);
	expectedWinnersList.put("KevinK", XX);
	expectedWinnersList.put("Ray", XX);
	expectedWinnersList.put("Greg", XX);
	expectedWinnersList.put("Paul", XX);
	expectedWinnersList.put("Matt", XX);
	expectedWinnersList.put("George", XX);
	expectedWinnersList.put("BenT", XX);
	expectedWinnersList.put("Chris", XX);
	expectedWinnersList.put("Susan", XX);
	expectedWinnersList.put("BenS", XX);
	expectedWinnersList.put("MaryBeth", XX);
	expectedWinnersList.put("Rich", XX);
	expectedWinnersList.put("Fitch", XX);
	expectedWinnersList.put("Don", XX);
	expectedWinnersList.put("Neal", XX);
	expectedWinnersList.put("ScottM", XX);
	expectedWinnersList.put("Jon", XX);
	expectedWinnersList.put("Lucas", XX);
	expectedWinnersList.put("Noah", XX);
	expectedWinnersList.put("ScottVdM", XX);
	expectedWinnersList.put("Adam", XX);
	expectedWinnersList.put("Mike", XX);
	expectedWinnersList.put("Tom", XX);
	expectedWinnersList.put("Barry", XX);
	expectedWinnersList.put("TNelson", XX);
	expectedWinnersList.put("Bill", XX);
	expectedWinnersList.put("Jeff", XX);
*/

	Map<String, Double> expectedWinnersList = new HashMap<>();

	private void setStaticData(ExcelReader e) {

		Pick p;
		Person person;

		//set all picks
//		Map<String, Person> allPicks = new HashMap<>();
		List<Person> allPicksList = new ArrayList<>();
		person = new Person("Adam");
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Barry");
		p = new Pick("Tampa Bay", 4, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 5, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("BenS");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 5, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("BenT");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Bill");
		p = new Pick("New Jersey", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Chris");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 4, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Don");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("EricK");
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 4, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 4, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("EricL");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 4, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 5, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Fitch");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("George");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 4, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 5, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Anaheim", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Greg");
		p = new Pick("Tampa Bay", 4, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Jay");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Jeff");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("JJ");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 4, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 5, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("John");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 4, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Minnesota", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 5, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(13, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Jon");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("KevinC");
		p = new Pick("Tampa Bay", 4, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 5, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 5, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("KevinK");
		p = new Pick("New Jersey", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 4, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 5, false, 2);
		person.addPicks(8, p);
		p = new Pick("New Jersey", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(10, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("New Jersey", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Winnipeg", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("New Jersey", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Lucas");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("MaryBeth");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 5, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 5, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Matt");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Mike");
		p = new Pick("New Jersey", 7, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 4, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Neal");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 4, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 5, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Noah");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Pat");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(11, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Paul");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 5, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Anaheim", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Pickle");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 5, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Ray");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Rich");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Philadelphia", 7, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Philadelphia", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Philadelphia", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Winnipeg", 5, false, 2);
		person.addPicks(14, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("ScottM");
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Philadelphia", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Philadelphia", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Philadelphia", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Minnesota", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("ScottVdM");
		p = new Pick("New Jersey", 7, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 5, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Seth");
		p = new Pick("New Jersey", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 4, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 4, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 5, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 5, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("New Jersey", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(11, p);
		p = new Pick("Anaheim", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("New Jersey", 5, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("New Jersey", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Susan");
		p = new Pick("Tampa Bay", 4, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Columbus", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 5, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 5, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 7, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 4, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Terry");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 7, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 7, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 7, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 7, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("TNelson");
		p = new Pick("New Jersey", 7, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Philadelphia", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Winnipeg", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Vegas", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("Anaheim", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 5, false, 2);
		person.addPicks(9, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("Anaheim", 5, false, 2);
		person.addPicks(12, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Tom");
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(1, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 6, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 5, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 6, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 6, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(8, p);
		p = new Pick("Toronto", 6, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

		person = new Person("Vineel");
		p = new Pick("Tampa Bay", 4, false, 2);
		person.addPicks(1, p);
		p = new Pick("Boston", 6, false, 2);
		person.addPicks(2, p);
		p = new Pick("Washington", 5, false, 2);
		person.addPicks(3, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(4, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(5, p);
		p = new Pick("Minnesota", 7, false, 2);
		person.addPicks(6, p);
		p = new Pick("Los Angeles", 7, false, 2);
		person.addPicks(7, p);
		p = new Pick("San Jose", 5, false, 2);
		person.addPicks(8, p);
		p = new Pick("Tampa Bay", 5, false, 2);
		person.addPicks(9, p);
		p = new Pick("Pittsburgh", 6, false, 2);
		person.addPicks(10, p);
		p = new Pick("Nashville", 5, false, 2);
		person.addPicks(11, p);
		p = new Pick("San Jose", 6, false, 2);
		person.addPicks(12, p);
		p = new Pick("Tampa Bay", 6, false, 2);
		person.addPicks(13, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(14, p);
		p = new Pick("Nashville", 6, false, 2);
		person.addPicks(15, p);
//		allPicks.put(person.getName(), person);
		allPicksList.add(person);

//		e.setAllPicks(allPicks);
		e.setAllPicksList(allPicksList);

		//set unique winners per round
		Map<String, String> uniqueWinners;
		Map<Integer, Map<String, String>> uniqueWinnersRound = new HashMap<>();

		Set<String> uniqueWinnersSet = new HashSet<String>();
		Set<String>[] uniqueWinnersRoundArray = new Set[16]; //Map<String, String>[16];

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Tampa Bay");
		uniqueWinnersSet.add("New Jersey");
		uniqueWinnersRoundArray[1] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Toronto");
		uniqueWinnersSet.add("Boston");
		uniqueWinnersRoundArray[2] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Columbus");
		uniqueWinnersSet.add("Washington");
		uniqueWinnersRoundArray[3] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Philadelphia");
		uniqueWinnersSet.add("Pittsburgh");
		uniqueWinnersRoundArray[4] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Nashville");
		uniqueWinnersRoundArray[5] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Winnipeg");
		uniqueWinnersSet.add("Minnesota");
		uniqueWinnersRoundArray[6] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Vegas");
		uniqueWinnersSet.add("Los Angeles");
		uniqueWinnersRoundArray[7] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Anaheim");
		uniqueWinnersSet.add("San Jose");
		uniqueWinnersRoundArray[8] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Tampa Bay");
		uniqueWinnersSet.add("Toronto");
		uniqueWinnersSet.add("New Jersey");
		uniqueWinnersSet.add("Boston");
		uniqueWinnersRoundArray[9] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Washington");
		uniqueWinnersSet.add("Philadelphia");
		uniqueWinnersSet.add("Pittsburgh");
		uniqueWinnersRoundArray[10] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Winnipeg");
		uniqueWinnersSet.add("Nashville");
		uniqueWinnersSet.add("Minnesota");
		uniqueWinnersRoundArray[11] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Vegas");
		uniqueWinnersSet.add("Anaheim");
		uniqueWinnersSet.add("Los Angeles");
		uniqueWinnersSet.add("San Jose");
		uniqueWinnersRoundArray[12] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Tampa Bay");
		uniqueWinnersSet.add("Washington");
		uniqueWinnersSet.add("Toronto");
		uniqueWinnersSet.add("New Jersey");
		uniqueWinnersSet.add("Philadelphia");
		uniqueWinnersSet.add("Pittsburgh");
		uniqueWinnersSet.add("Boston");
		uniqueWinnersRoundArray[13] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Vegas");
		uniqueWinnersSet.add("Winnipeg");
		uniqueWinnersSet.add("Nashville");
		uniqueWinnersSet.add("Minnesota");
		uniqueWinnersSet.add("San Jose");
		uniqueWinnersRoundArray[14] = uniqueWinnersSet;

		uniqueWinnersSet = new HashSet<String>();
		uniqueWinnersSet.add("Vegas");
		uniqueWinnersSet.add("Winnipeg");
		uniqueWinnersSet.add("Tampa Bay");
		uniqueWinnersSet.add("Nashville");
		uniqueWinnersSet.add("Minnesota");
		uniqueWinnersSet.add("Washington");
		uniqueWinnersSet.add("San Jose");
		uniqueWinnersSet.add("New Jersey");
		uniqueWinnersSet.add("Pittsburgh");
		uniqueWinnersSet.add("Boston");
		uniqueWinnersRoundArray[15] = uniqueWinnersSet;

//		e.setUniqueWinnersRound(uniqueWinnersRound);
		e.setUniqueWinnersRoundArray(uniqueWinnersRoundArray);

//		Map<String, Double> winnersCount = new HashMap<>();
//		winnersCount.put("JJ", 0.0);
//		winnersCount.put("Seth", 0.0);
//		winnersCount.put("Pat", 0.0);
//		winnersCount.put("Jay", 0.0);
//		winnersCount.put("KevinC", 0.0);
//		winnersCount.put("Pickle", 0.0);
//		winnersCount.put("EricL", 0.0);
//		winnersCount.put("EricK", 0.0);
//		winnersCount.put("Terry", 0.0);
//		winnersCount.put("John", 0.0);
//		winnersCount.put("Vineel", 0.0);
//		winnersCount.put("KevinK", 0.0);
//		winnersCount.put("Ray", 0.0);
//		winnersCount.put("Greg", 0.0);
//		winnersCount.put("Paul", 0.0);
//		winnersCount.put("Matt", 0.0);
//		winnersCount.put("George", 0.0);
//		winnersCount.put("BenT", 0.0);
//		winnersCount.put("Chris", 0.0);
//		winnersCount.put("Susan", 0.0);
//		winnersCount.put("BenS", 0.0);
//		winnersCount.put("MaryBeth", 0.0);
//		winnersCount.put("Rich", 0.0);
//		winnersCount.put("Fitch", 0.0);
//		winnersCount.put("Don", 0.0);
//		winnersCount.put("Neal", 0.0);
//		winnersCount.put("ScottM", 0.0);
//		winnersCount.put("Jon", 0.0);
//		winnersCount.put("Lucas", 0.0);
//		winnersCount.put("Noah", 0.0);
//		winnersCount.put("ScottVdM", 0.0);
//		winnersCount.put("Adam", 0.0);
//		winnersCount.put("Mike", 0.0);
//		winnersCount.put("Tom", 0.0);
//		winnersCount.put("Barry", 0.0);
//		winnersCount.put("TNelson", 0.0);
//		winnersCount.put("Bill", 0.0);
//		winnersCount.put("Jeff", 0.0);
//		e.setWinnersCount(winnersCount);

		Map<String, Double> winnersList = new HashMap<>();
		winnersList.put("JJ", 0.0);
		winnersList.put("Seth", 0.0);
		winnersList.put("Pat", 0.0);
		winnersList.put("Jay", 0.0);
		winnersList.put("KevinC", 0.0);
		winnersList.put("Pickle", 0.0);
		winnersList.put("EricL", 0.0);
		winnersList.put("EricK", 0.0);
		winnersList.put("Terry", 0.0);
		winnersList.put("John", 0.0);
		winnersList.put("Vineel", 0.0);
		winnersList.put("KevinK", 0.0);
		winnersList.put("Ray", 0.0);
		winnersList.put("Greg", 0.0);
		winnersList.put("Paul", 0.0);
		winnersList.put("Matt", 0.0);
		winnersList.put("George", 0.0);
		winnersList.put("BenT", 0.0);
		winnersList.put("Chris", 0.0);
		winnersList.put("Susan", 0.0);
		winnersList.put("BenS", 0.0);
		winnersList.put("MaryBeth", 0.0);
		winnersList.put("Rich", 0.0);
		winnersList.put("Fitch", 0.0);
		winnersList.put("Don", 0.0);
		winnersList.put("Neal", 0.0);
		winnersList.put("ScottM", 0.0);
		winnersList.put("Jon", 0.0);
		winnersList.put("Lucas", 0.0);
		winnersList.put("Noah", 0.0);
		winnersList.put("ScottVdM", 0.0);
		winnersList.put("Adam", 0.0);
		winnersList.put("Mike", 0.0);
		winnersList.put("Tom", 0.0);
		winnersList.put("Barry", 0.0);
		winnersList.put("TNelson", 0.0);
		winnersList.put("Bill", 0.0);
		winnersList.put("Jeff", 0.0);
		e.setWinnersList(winnersList);
	}

	private void setRounds1to8CompleteData(ExcelReader e) {
		Pick p;
		Person person;

		Person team1 = new Person("team1");
    	p = new Pick("Tampa Bay", 5, false, 2);
    	team1.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
    	team1.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
    	team1.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
    	team1.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
    	team1.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
    	team1.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
    	team1.addPicks(7, p);
    	p = new Pick("Anaheim", 7, false, 2);
    	team1.addPicks(8, p);

    	p = new Pick("Tampa Bay", 4, false, 3);
    	team1.addPicks(9, p);
    	p = new Pick("Washington", 4, false, 3);
    	team1.addPicks(10, p);
    	p = new Pick("Nashville", 4, false, 3);
    	team1.addPicks(11, p);
    	p = new Pick("Vegas", 4, false, 3);
    	team1.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team1.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team1.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team1.addPicks(15, p);
		e.setTeam1(team1);

		Person team2 = new Person("team2");
    	p = new Pick("New Jersey", 7, false, 2);
    	team2.addPicks(1, p);
    	p = new Pick("Toronto", 7, false, 2);
    	team2.addPicks(2, p);
    	p = new Pick("Columbus", 7, false, 2);
    	team2.addPicks(3, p);
    	p = new Pick("Philadelphia", 7, false, 2);
    	team2.addPicks(4, p);
    	p = new Pick("Colorado", 7, false, 2);
    	team2.addPicks(5, p);
    	p = new Pick("Minnesota", 7, false, 2);
    	team2.addPicks(6, p);
    	p = new Pick("Los Angeles", 7, false, 2);
    	team2.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
    	team2.addPicks(8, p);

    	p = new Pick("Boston", 4, false, 3);
    	team2.addPicks(9, p);
    	p = new Pick("Pittsburgh", 4, false, 3);
    	team2.addPicks(10, p);
    	p = new Pick("Winnipeg", 4, false, 3);
    	team2.addPicks(11, p);
    	p = new Pick("San Jose", 4, false, 3);
    	team2.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team2.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team2.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team2.addPicks(15, p);
		e.setTeam2(team2);

		Person winner = new Person("Winner");
    	p = new Pick("Tampa Bay", 5, false, 2);
		winner.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
		winner.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
		winner.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
		winner.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
		winner.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
		winner.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
		winner.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
		winner.addPicks(8, p);

    	p = new Pick("", 0, false, 3);
		winner.addPicks(9, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(11, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
		winner.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
		winner.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
		winner.addPicks(15, p);
		e.setWinner(winner);

		boolean[] seriesFinished= {false, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false};
		e.setSeriesFinished(seriesFinished);

		//set expected results
		expectedWinnersList.clear();
		expectedWinnersList.put("JJ", 181576.28333343167);
		expectedWinnersList.put("Seth", 0.0);
		expectedWinnersList.put("Pat", 990.866666666671);
		expectedWinnersList.put("Jay", 23338.67142857147);
		expectedWinnersList.put("KevinC", 50255.45000000232);
		expectedWinnersList.put("Pickle", 37537.388095237846);
		expectedWinnersList.put("EricL", 248277.90476193844);
		expectedWinnersList.put("EricK", 64102.616666672955);
		expectedWinnersList.put("Terry", 134661.57142853693);
		expectedWinnersList.put("John", 1052.7);
		expectedWinnersList.put("Vineel", 882.1500000000036);
		expectedWinnersList.put("KevinK", 0.0);
		expectedWinnersList.put("Ray", 4045.0500000000475);
		expectedWinnersList.put("Greg", 85210.66666666561);
		expectedWinnersList.put("Paul", 0.0);
		expectedWinnersList.put("Matt", 219775.16666668718);
		expectedWinnersList.put("George", 8696.171428571362);
		expectedWinnersList.put("BenT", 187105.16666666296);
		expectedWinnersList.put("Chris", 0.0);
		expectedWinnersList.put("Susan", 0.0);
		expectedWinnersList.put("BenS", 99512.82142856503);
		expectedWinnersList.put("MaryBeth", 201159.23333335904);
		expectedWinnersList.put("Rich", 312.59999999999826);
		expectedWinnersList.put("Fitch", 395.48809523809405);
		expectedWinnersList.put("Don", 180924.0166666739);
		expectedWinnersList.put("Neal", 0.0);
		expectedWinnersList.put("ScottM", 0.0);
		expectedWinnersList.put("Jon", 127315.91666666194);
		expectedWinnersList.put("Lucas", 34241.33333333225);
		expectedWinnersList.put("Noah", 86155.76666666465);
		expectedWinnersList.put("ScottVdM", 27886.666666665922);
		expectedWinnersList.put("Adam", 0.0);
		expectedWinnersList.put("Mike", 0.0);
		expectedWinnersList.put("Tom", 8994.883333333248);
		expectedWinnersList.put("Barry", 4257.083333333358);
		expectedWinnersList.put("TNelson", 0.0);
		expectedWinnersList.put("Bill", 78469.70000000062);
		expectedWinnersList.put("Jeff", 18.666666666666668);
	}

	@Test
	public void testRounds1to8Complete() {
		ExcelReader er = null;
		try {
			er = new ExcelReader("");
			//setup the data
			setStaticData(er);
			setRounds1to8CompleteData(er);
			er.processSeries(1, 1, "");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: "); // + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

//		assertThat(actual, is(equalTo(expected)));
		assertEquals(2097152, er.getNumOfResluts());
		assertEquals(2097152, er.getNumOfRuns());
		assertEquals(expectedWinnersList, er.getWinnersList());

//		fail("Not yet implemented");
	}

	private void setRounds1to9CompleteData(ExcelReader e) {
		Pick p;
		Person person;

		Person team1 = new Person("team1");
    	p = new Pick("Tampa Bay", 5, false, 2);
    	team1.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
    	team1.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
    	team1.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
    	team1.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
    	team1.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
    	team1.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
    	team1.addPicks(7, p);
    	p = new Pick("Anaheim", 7, false, 2);
    	team1.addPicks(8, p);

    	p = new Pick("Tampa Bay", 6, false, 3);
    	team1.addPicks(9, p);
    	p = new Pick("Washington", 4, false, 3);
    	team1.addPicks(10, p);
    	p = new Pick("Nashville", 4, false, 3);
    	team1.addPicks(11, p);
    	p = new Pick("Vegas", 4, false, 3);
    	team1.addPicks(12, p);

    	p = new Pick("Tampa Bay", 4, false, 4);
    	team1.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team1.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team1.addPicks(15, p);
		e.setTeam1(team1);

		Person team2 = new Person("team2");
    	p = new Pick("New Jersey", 7, false, 2);
    	team2.addPicks(1, p);
    	p = new Pick("Toronto", 7, false, 2);
    	team2.addPicks(2, p);
    	p = new Pick("Columbus", 7, false, 2);
    	team2.addPicks(3, p);
    	p = new Pick("Philadelphia", 7, false, 2);
    	team2.addPicks(4, p);
    	p = new Pick("Colorado", 7, false, 2);
    	team2.addPicks(5, p);
    	p = new Pick("Minnesota", 7, false, 2);
    	team2.addPicks(6, p);
    	p = new Pick("Los Angeles", 7, false, 2);
    	team2.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
    	team2.addPicks(8, p);

    	p = new Pick("Boston", 4, false, 3);
    	team2.addPicks(9, p);
    	p = new Pick("Pittsburgh", 4, false, 3);
    	team2.addPicks(10, p);
    	p = new Pick("Winnipeg", 4, false, 3);
    	team2.addPicks(11, p);
    	p = new Pick("San Jose", 4, false, 3);
    	team2.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team2.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team2.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team2.addPicks(15, p);
		e.setTeam2(team2);

		Person winner = new Person("Winner");
    	p = new Pick("Tampa Bay", 5, false, 2);
		winner.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
		winner.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
		winner.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
		winner.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
		winner.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
		winner.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
		winner.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
		winner.addPicks(8, p);

    	p = new Pick("Tampa Bay", 6, false, 3);
		winner.addPicks(9, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(11, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
		winner.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
		winner.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
		winner.addPicks(15, p);
		e.setWinner(winner);

		boolean seriesFinished[]= {false, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false};
		e.setSeriesFinished(seriesFinished);

		//set expected results
		expectedWinnersList.clear();
		expectedWinnersList.put("JJ", 43665.416666667246);
		expectedWinnersList.put("Seth", 0.0);
		expectedWinnersList.put("Pat", 410.8833333333332);
		expectedWinnersList.put("Jay", 3225.633333333346);
		expectedWinnersList.put("KevinC", 14390.583333333554);
		expectedWinnersList.put("Pickle", 4652.133333333348);
		expectedWinnersList.put("EricL", 25874.999999999804);
		expectedWinnersList.put("EricK", 9664.583333333228);
		expectedWinnersList.put("Terry", 14079.216666666925);
		expectedWinnersList.put("John", 64.0);
		expectedWinnersList.put("Vineel", 13.750000000000004);
		expectedWinnersList.put("KevinK", 0.0);
		expectedWinnersList.put("Ray", 939.9666666666691);
		expectedWinnersList.put("Greg", 23471.33333333317);
		expectedWinnersList.put("Paul", 0.0);
		expectedWinnersList.put("Matt", 0.0);
		expectedWinnersList.put("George", 0.0);
		expectedWinnersList.put("BenT", 30942.33333333327);
		expectedWinnersList.put("Chris", 0.0);
		expectedWinnersList.put("Susan", 0.0);
		expectedWinnersList.put("BenS", 10.833333333333336);
		expectedWinnersList.put("MaryBeth", 47825.8333333345);
		expectedWinnersList.put("Rich", 0.0);
		expectedWinnersList.put("Fitch", 0.0);
		expectedWinnersList.put("Don", 18542.0);
		expectedWinnersList.put("Neal", 0.0);
		expectedWinnersList.put("ScottM", 0.0);
		expectedWinnersList.put("Jon", 11925.583333333332);
		expectedWinnersList.put("Lucas", 128.0);
		expectedWinnersList.put("Noah", 8851.916666666633);
		expectedWinnersList.put("ScottVdM", 780.5000000000002);
		expectedWinnersList.put("Adam", 0.0);
		expectedWinnersList.put("Mike", 0.0);
		expectedWinnersList.put("Tom", 141.58333333333317);
		expectedWinnersList.put("Barry", 1156.4166666666667);
		expectedWinnersList.put("TNelson", 0.0);
		expectedWinnersList.put("Bill", 1386.5000000000007);
		expectedWinnersList.put("Jeff", 0.0);
	}

	@Test
	public void testRounds1to9Complete() {
		ExcelReader er = null;
		try {
			er = new ExcelReader("");
			//setup the data
			setStaticData(er);
			setRounds1to9CompleteData(er);
			er.processSeries(1, 1, "");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: "); // + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

//		assertThat(actual, is(equalTo(expected)));
		assertEquals(262144, er.getNumOfResluts());
		assertEquals(262144, er.getNumOfRuns());
		assertEquals(expectedWinnersList, er.getWinnersList());

//		fail("Not yet implemented");
	}

	private void setRounds1to8and10CompleteData(ExcelReader e) {
		Pick p;
		Person person;

		Person team1 = new Person("team1");
    	p = new Pick("Tampa Bay", 5, false, 2);
    	team1.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
    	team1.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
    	team1.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
    	team1.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
    	team1.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
    	team1.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
    	team1.addPicks(7, p);
    	p = new Pick("Anaheim", 7, false, 2);
    	team1.addPicks(8, p);

    	p = new Pick("Tampa Bay", 4, false, 3);
    	team1.addPicks(9, p);
    	p = new Pick("Washington", 6, false, 3);
    	team1.addPicks(10, p);
    	p = new Pick("Nashville", 4, false, 3);
    	team1.addPicks(11, p);
    	p = new Pick("Vegas", 4, false, 3);
    	team1.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team1.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team1.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team1.addPicks(15, p);
		e.setTeam1(team1);

		Person team2 = new Person("team2");
    	p = new Pick("New Jersey", 7, false, 2);
    	team2.addPicks(1, p);
    	p = new Pick("Toronto", 7, false, 2);
    	team2.addPicks(2, p);
    	p = new Pick("Columbus", 7, false, 2);
    	team2.addPicks(3, p);
    	p = new Pick("Philadelphia", 7, false, 2);
    	team2.addPicks(4, p);
    	p = new Pick("Colorado", 7, false, 2);
    	team2.addPicks(5, p);
    	p = new Pick("Minnesota", 7, false, 2);
    	team2.addPicks(6, p);
    	p = new Pick("Los Angeles", 7, false, 2);
    	team2.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
    	team2.addPicks(8, p);

    	p = new Pick("Boston", 4, false, 3);
    	team2.addPicks(9, p);
    	p = new Pick("Pittsburgh", 7, false, 3);
    	team2.addPicks(10, p);
    	p = new Pick("Winnipeg", 4, false, 3);
    	team2.addPicks(11, p);
    	p = new Pick("San Jose", 4, false, 3);
    	team2.addPicks(12, p);

    	p = new Pick("Washington", 4, false, 4);
    	team2.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team2.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team2.addPicks(15, p);
		e.setTeam2(team2);

		Person winner = new Person("Winner");
    	p = new Pick("Tampa Bay", 5, false, 2);
		winner.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
		winner.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
		winner.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
		winner.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
		winner.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
		winner.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
		winner.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
		winner.addPicks(8, p);

    	p = new Pick("", 0, false, 3);
		winner.addPicks(9, p);
    	p = new Pick("Washington", 6, false, 3);
		winner.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(11, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
		winner.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
		winner.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
		winner.addPicks(15, p);
		e.setWinner(winner);

		boolean seriesFinished[]= {false, true, true, true, true, true, true, true, true, false, true, false, false, false, false, false};
		e.setSeriesFinished(seriesFinished);

		//set expected results
		expectedWinnersList.clear();
		expectedWinnersList.put("JJ", 14067.450000001101);
		expectedWinnersList.put("Seth", 0.0);
		expectedWinnersList.put("Pat", 0.0);
		expectedWinnersList.put("Jay", 0.0);
		expectedWinnersList.put("KevinC", 8469.08333333332);
		expectedWinnersList.put("Pickle", 0.0);
		expectedWinnersList.put("EricL", 2251.4999999999836);
		expectedWinnersList.put("EricK", 0.0);
		expectedWinnersList.put("Terry", 37855.95000000049);
		expectedWinnersList.put("John", 0.0);
		expectedWinnersList.put("Vineel", 0.0);
		expectedWinnersList.put("KevinK", 0.0);
		expectedWinnersList.put("Ray", 0.0);
		expectedWinnersList.put("Greg", 2878.500000000007);
		expectedWinnersList.put("Paul", 0.0);
		expectedWinnersList.put("Matt", 25092.08333333286);
		expectedWinnersList.put("George", 0.6666666666666666);
		expectedWinnersList.put("BenT", 50840.91666666719);
		expectedWinnersList.put("Chris", 0.0);
		expectedWinnersList.put("Susan", 0.0);
		expectedWinnersList.put("BenS", 6826.499999999967);
		expectedWinnersList.put("MaryBeth", 38127.50000000088);
		expectedWinnersList.put("Rich", 21.9999999999999930);
		expectedWinnersList.put("Fitch", 0.0);
		expectedWinnersList.put("Don", 46922.533333334024);
		expectedWinnersList.put("Neal", 0.0);
		expectedWinnersList.put("ScottM", 0.0);
		expectedWinnersList.put("Jon", 8992.583333333305);
		expectedWinnersList.put("Lucas", 9358.666666666604);
		expectedWinnersList.put("Noah", 0.0);
		expectedWinnersList.put("ScottVdM", 25.94999999999998);
		expectedWinnersList.put("Adam", 0.0);
		expectedWinnersList.put("Mike", 0.0);
		expectedWinnersList.put("Tom", 0.0);
		expectedWinnersList.put("Barry", 17.833333333333332);
		expectedWinnersList.put("TNelson", 0.0);
		expectedWinnersList.put("Bill", 10394.28333333337);
		expectedWinnersList.put("Jeff", 0.0);
	}

	@Test
	public void testRounds1to8and10Complete() {
		ExcelReader er = null;
		try {
			er = new ExcelReader("");
			//setup the data
			setStaticData(er);
			setRounds1to8and10CompleteData(er);
			er.processSeries(1, 1, "");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: "); // + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

//		assertThat(actual, is(equalTo(expected)));
		assertEquals(262144, er.getNumOfResluts());
		assertEquals(262144, er.getNumOfRuns());
		assertEquals(expectedWinnersList, er.getWinnersList());

//		fail("Not yet implemented");
	}

	private void setRounds1to10CompleteData(ExcelReader e) {
		Pick p;
		Person person;

		Person team1 = new Person("team1");
    	p = new Pick("Tampa Bay", 5, false, 2);
    	team1.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
    	team1.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
    	team1.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
    	team1.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
    	team1.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
    	team1.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
    	team1.addPicks(7, p);
    	p = new Pick("Anaheim", 7, false, 2);
    	team1.addPicks(8, p);

    	p = new Pick("Tampa Bay", 6, false, 3);
    	team1.addPicks(9, p);
    	p = new Pick("Washington", 6, false, 3);
    	team1.addPicks(10, p);
    	p = new Pick("Nashville", 4, false, 3);
    	team1.addPicks(11, p);
    	p = new Pick("Vegas", 4, false, 3);
    	team1.addPicks(12, p);

    	p = new Pick("Tampa Bay", 4, false, 4);
    	team1.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team1.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team1.addPicks(15, p);
		e.setTeam1(team1);

		Person team2 = new Person("team2");
    	p = new Pick("New Jersey", 7, false, 2);
    	team2.addPicks(1, p);
    	p = new Pick("Toronto", 7, false, 2);
    	team2.addPicks(2, p);
    	p = new Pick("Columbus", 7, false, 2);
    	team2.addPicks(3, p);
    	p = new Pick("Philadelphia", 7, false, 2);
    	team2.addPicks(4, p);
    	p = new Pick("Colorado", 7, false, 2);
    	team2.addPicks(5, p);
    	p = new Pick("Minnesota", 7, false, 2);
    	team2.addPicks(6, p);
    	p = new Pick("Los Angeles", 7, false, 2);
    	team2.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
    	team2.addPicks(8, p);

    	p = new Pick("Boston", 7, false, 3);
    	team2.addPicks(9, p);
    	p = new Pick("Pittsburgh", 7, false, 3);
    	team2.addPicks(10, p);
    	p = new Pick("Winnipeg", 4, false, 3);
    	team2.addPicks(11, p);
    	p = new Pick("San Jose", 4, false, 3);
    	team2.addPicks(12, p);

    	p = new Pick("Washington", 4, false, 4);
    	team2.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team2.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team2.addPicks(15, p);
		e.setTeam2(team2);

		Person winner = new Person("Winner");
    	p = new Pick("Tampa Bay", 5, false, 2);
		winner.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
		winner.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
		winner.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
		winner.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
		winner.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
		winner.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
		winner.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
		winner.addPicks(8, p);

    	p = new Pick("Tampa Bay", 6, false, 3);
		winner.addPicks(9, p);
    	p = new Pick("Washington", 6, false, 3);
		winner.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(11, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
		winner.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
		winner.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
		winner.addPicks(15, p);
		e.setWinner(winner);

		boolean seriesFinished[]= {false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false};
		e.setSeriesFinished(seriesFinished);

		//set expected results
		expectedWinnersList.clear();
 		expectedWinnersList.put("JJ", 3817.8333333333385);
		expectedWinnersList.put("Seth", 0.0);
		expectedWinnersList.put("Pat", 0.0);
		expectedWinnersList.put("Jay", 0.0);
		expectedWinnersList.put("KevinC", 2159.499999999998);
		expectedWinnersList.put("Pickle", 0.0);
		expectedWinnersList.put("EricL", 0.0);
		expectedWinnersList.put("EricK", 0.0);
		expectedWinnersList.put("Terry", 3295.8333333333558);
		expectedWinnersList.put("John", 0.0);
		expectedWinnersList.put("Vineel", 0.0);
		expectedWinnersList.put("KevinK", 0.0);
		expectedWinnersList.put("Ray", 0.0);
		expectedWinnersList.put("Greg", 1235.166666666665);
		expectedWinnersList.put("Paul", 0.0);
		expectedWinnersList.put("Matt", 0.0);
		expectedWinnersList.put("George", 0.0);
		expectedWinnersList.put("BenT", 8797.499999999993);
		expectedWinnersList.put("Chris", 0.0);
		expectedWinnersList.put("Susan", 0.0);
		expectedWinnersList.put("BenS", 0.0);
		expectedWinnersList.put("MaryBeth", 8449.49999999999);
		expectedWinnersList.put("Rich", 0.0);
		expectedWinnersList.put("Fitch", 0.0);
		expectedWinnersList.put("Don", 4854.0);
		expectedWinnersList.put("Neal", 0.0);
		expectedWinnersList.put("ScottM", 0.0);
		expectedWinnersList.put("Jon", 5.5);
		expectedWinnersList.put("Lucas", 32.0);
		expectedWinnersList.put("Noah", 0.0);
		expectedWinnersList.put("ScottVdM", 0.0);
		expectedWinnersList.put("Adam", 0.0);
		expectedWinnersList.put("Mike", 0.0);
		expectedWinnersList.put("Tom", 0.0);
		expectedWinnersList.put("Barry", 14.166666666666668);
		expectedWinnersList.put("TNelson", 0.0);
		expectedWinnersList.put("Bill", 107.00000000000003);
		expectedWinnersList.put("Jeff", 0.0);
	}

	@Test
	public void testRounds1to10Complete() {
		ExcelReader er = null;
		try {
			er = new ExcelReader("");
			//setup the data
			setStaticData(er);
			setRounds1to10CompleteData(er);
			er.processSeries(1, 1, "");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: "); // + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

//		assertThat(actual, is(equalTo(expected)));
		assertEquals(32768, er.getNumOfResluts());
		assertEquals(32768, er.getNumOfRuns());
		assertEquals(expectedWinnersList, er.getWinnersList());

//		fail("Not yet implemented");
	}

	private void setRounds1to8and10and12ColoradoCompleteData(ExcelReader e) {
		Pick p;
		Person person;

		Person team1 = new Person("team1");
    	p = new Pick("Tampa Bay", 5, false, 2);
    	team1.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
    	team1.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
    	team1.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
    	team1.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
    	team1.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
    	team1.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
    	team1.addPicks(7, p);
    	p = new Pick("Anaheim", 7, false, 2);
    	team1.addPicks(8, p);

    	p = new Pick("Tampa Bay", 4, false, 3);
    	team1.addPicks(9, p);
    	p = new Pick("Washington", 6, false, 3);
    	team1.addPicks(10, p);
    	p = new Pick("Colorado", 4, false, 3);
    	team1.addPicks(11, p);
    	p = new Pick("Vegas", 4, false, 3);
    	team1.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team1.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team1.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team1.addPicks(15, p);
		e.setTeam1(team1);

		Person team2 = new Person("team2");
    	p = new Pick("New Jersey", 7, false, 2);
    	team2.addPicks(1, p);
    	p = new Pick("Toronto", 7, false, 2);
    	team2.addPicks(2, p);
    	p = new Pick("Columbus", 7, false, 2);
    	team2.addPicks(3, p);
    	p = new Pick("Philadelphia", 7, false, 2);
    	team2.addPicks(4, p);
    	p = new Pick("Colorado", 7, false, 2);
    	team2.addPicks(5, p);
    	p = new Pick("Minnesota", 7, false, 2);
    	team2.addPicks(6, p);
    	p = new Pick("Los Angeles", 7, false, 2);
    	team2.addPicks(7, p);
    	p = new Pick("San Jose", 5, false, 2);
    	team2.addPicks(8, p);

    	p = new Pick("Boston", 4, false, 3);
    	team2.addPicks(9, p);
    	p = new Pick("Pittsburgh", 7, false, 3);
    	team2.addPicks(10, p);
    	p = new Pick("Winnipeg", 4, false, 3);
    	team2.addPicks(11, p);
    	p = new Pick("San Jose", 4, false, 3);
    	team2.addPicks(12, p);

    	p = new Pick("Washington", 4, false, 4);
    	team2.addPicks(13, p);
    	p = new Pick("San Jose", 4, false, 4);
    	team2.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team2.addPicks(15, p);
		e.setTeam2(team2);

		Person winner = new Person("Winner");
    	p = new Pick("Tampa Bay", 5, false, 2);
		winner.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
		winner.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
		winner.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
		winner.addPicks(4, p);
    	p = new Pick("Colorado", 6, false, 2);
		winner.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
		winner.addPicks(6, p);
    	p = new Pick("Vegas", 5, false, 2);
		winner.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
		winner.addPicks(8, p);

    	p = new Pick("", 0, false, 3);
		winner.addPicks(9, p);
    	p = new Pick("Washington", 6, false, 3);
		winner.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(11, p);
    	p = new Pick("San Jose", 5, false, 3);
		winner.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
		winner.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
		winner.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
		winner.addPicks(15, p);
		e.setWinner(winner);

		boolean seriesFinished[]= {false, true, true, true, true, true, true, true, true, false, true, false, true, false, false, false};
		e.setSeriesFinished(seriesFinished);

		//set expected results
		expectedWinnersList.put("JJ", 1024.0);
		expectedWinnersList.put("Seth", 0.0);
		expectedWinnersList.put("Pat", 0.0);
		expectedWinnersList.put("Jay", 0.0);
		expectedWinnersList.put("KevinC", 0.0);
		expectedWinnersList.put("Pickle", 0.0);
		expectedWinnersList.put("EricL", 0.0);
		expectedWinnersList.put("EricK", 0.0);
		expectedWinnersList.put("Terry", 0.0);
		expectedWinnersList.put("John", 0.0);
		expectedWinnersList.put("Vineel", 0.0);
		expectedWinnersList.put("KevinK", 0.0);
		expectedWinnersList.put("Ray", 0.0);
		expectedWinnersList.put("Greg", 0.0);
		expectedWinnersList.put("Paul", 0.0);
		expectedWinnersList.put("Matt", 6126.0);
		expectedWinnersList.put("George", 0.0);
		expectedWinnersList.put("BenT", 11327.083333333494);
		expectedWinnersList.put("Chris", 0.0);
		expectedWinnersList.put("Susan", 0.0);
		expectedWinnersList.put("BenS", 269.5);
		expectedWinnersList.put("MaryBeth", 9994.250000000327);
		expectedWinnersList.put("Rich", 0.0);
		expectedWinnersList.put("Fitch", 0.0);
		expectedWinnersList.put("Don", 0.0);
		expectedWinnersList.put("Neal", 0.0);
		expectedWinnersList.put("ScottM", 0.0);
		expectedWinnersList.put("Jon", 1118.000000000001);
		expectedWinnersList.put("Lucas", 892.5833333333424);
		expectedWinnersList.put("Noah", 0.0);
		expectedWinnersList.put("ScottVdM", 0.0);
		expectedWinnersList.put("Adam", 0.0);
		expectedWinnersList.put("Mike", 0.0);
		expectedWinnersList.put("Tom", 0.0);
		expectedWinnersList.put("Barry", 0.0);
		expectedWinnersList.put("TNelson", 0.0);
		expectedWinnersList.put("Bill", 2016.5833333333333);
		expectedWinnersList.put("Jeff", 0.0);
	}

	@Test
	public void testRounds1to8and10and12ColoradoComplete() {
		ExcelReader er = null;
		try {
			er = new ExcelReader("");
			//setup the data
			setStaticData(er);
			setRounds1to8and10and12ColoradoCompleteData(er);
			er.processSeries(1, 1, "");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: "); // + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

//		assertThat(actual, is(equalTo(expected)));
		assertEquals(32768, er.getNumOfResluts());
		assertEquals(18752, er.getNumOfRuns());
		assertEquals(expectedWinnersList, er.getWinnersList());

//		fail("Not yet implemented");
	}

	private void setRounds1to8ColoradoCompleteData(ExcelReader e) {
		Pick p;
		Person person;

		Person team1 = new Person("team1");
    	p = new Pick("Tampa Bay", 5, false, 2);
    	team1.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
    	team1.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
    	team1.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
    	team1.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
    	team1.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
    	team1.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
    	team1.addPicks(7, p);
    	p = new Pick("Anaheim", 7, false, 2);
    	team1.addPicks(8, p);

    	p = new Pick("Tampa Bay", 4, false, 3);
    	team1.addPicks(9, p);
    	p = new Pick("Washington", 4, false, 3);
    	team1.addPicks(10, p);
    	p = new Pick("Colorado", 4, false, 3);
    	team1.addPicks(11, p);
    	p = new Pick("Vegas", 4, false, 3);
    	team1.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team1.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team1.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team1.addPicks(15, p);
		e.setTeam1(team1);

		Person team2 = new Person("team2");
    	p = new Pick("New Jersey", 7, false, 2);
    	team2.addPicks(1, p);
    	p = new Pick("Toronto", 7, false, 2);
    	team2.addPicks(2, p);
    	p = new Pick("Columbus", 7, false, 2);
    	team2.addPicks(3, p);
    	p = new Pick("Philadelphia", 7, false, 2);
    	team2.addPicks(4, p);
    	p = new Pick("Colorado", 7, false, 2);
    	team2.addPicks(5, p);
    	p = new Pick("Minnesota", 7, false, 2);
    	team2.addPicks(6, p);
    	p = new Pick("Los Angeles", 7, false, 2);
    	team2.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
    	team2.addPicks(8, p);

    	p = new Pick("Boston", 4, false, 3);
    	team2.addPicks(9, p);
    	p = new Pick("Pittsburgh", 4, false, 3);
    	team2.addPicks(10, p);
    	p = new Pick("Winnipeg", 4, false, 3);
    	team2.addPicks(11, p);
    	p = new Pick("San Jose", 4, false, 3);
    	team2.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team2.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team2.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team2.addPicks(15, p);
		e.setTeam2(team2);

		Person winner = new Person("Winner");
    	p = new Pick("Tampa Bay", 5, false, 2);
		winner.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
		winner.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
		winner.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
		winner.addPicks(4, p);
    	p = new Pick("Colorado", 6, false, 2);
		winner.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
		winner.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
		winner.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
		winner.addPicks(8, p);

    	p = new Pick("", 0, false, 3);
		winner.addPicks(9, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(11, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
		winner.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
		winner.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
		winner.addPicks(15, p);
		e.setWinner(winner);

		boolean seriesFinished[]= {false, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false};
		e.setSeriesFinished(seriesFinished);

		//set expected results
		expectedWinnersList.clear();
		expectedWinnersList.put("JJ", 204946.23333340726);
		expectedWinnersList.put("Seth", 0.0);
		expectedWinnersList.put("Pat", 0.0);
		expectedWinnersList.put("Jay", 0.0);
		expectedWinnersList.put("KevinC", 54322.9666666684);
		expectedWinnersList.put("Pickle", 872.0166666666737);
		expectedWinnersList.put("EricL", 355425.0833333155);
		expectedWinnersList.put("EricK", 73527.33333333519);
		expectedWinnersList.put("Terry", 109643.09999996754);
		expectedWinnersList.put("John", 2297.5666666666552);
		expectedWinnersList.put("Vineel", 247.75000000000114);
		expectedWinnersList.put("KevinK", 0.0);
		expectedWinnersList.put("Ray", 160.0);
		expectedWinnersList.put("Greg", 98234.98333333094);
		expectedWinnersList.put("Paul", 0.0);
		expectedWinnersList.put("Matt", 294318.6666666766);
		expectedWinnersList.put("George", 6618.2499999999745);
		expectedWinnersList.put("BenT", 222515.5000000159);
		expectedWinnersList.put("Chris", 0.0);
		expectedWinnersList.put("Susan", 0.0);
		expectedWinnersList.put("BenS", 28642.499999999924);
		expectedWinnersList.put("MaryBeth", 185312.91666668915);
		expectedWinnersList.put("Rich", 881.6666666666787);
		expectedWinnersList.put("Fitch", 0.0);
		expectedWinnersList.put("Don", 162217.0000000001);
		expectedWinnersList.put("Neal", 0.0);
		expectedWinnersList.put("ScottM", 0.0);
		expectedWinnersList.put("Jon", 85018.41666666424);
		expectedWinnersList.put("Lucas", 34948.999999998676);
		expectedWinnersList.put("Noah", 103276.76666665725);
		expectedWinnersList.put("ScottVdM", 15392.100000000784);
		expectedWinnersList.put("Adam", 0.0);
		expectedWinnersList.put("Mike", 0.0);
		expectedWinnersList.put("Tom", 3542.83333333335);
		expectedWinnersList.put("Barry", 791.6000000000016);
		expectedWinnersList.put("TNelson", 0.0);
		expectedWinnersList.put("Bill", 53997.75000000118);
		expectedWinnersList.put("Jeff", 0.0);
	}

	@Test
	public void testRounds1to8ColoradoComplete() {
		ExcelReader er = null;
		try {
			er = new ExcelReader("");
			//setup the data
			setStaticData(er);
			setRounds1to8ColoradoCompleteData(er);
			er.processSeries(1, 1, "");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: "); // + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

		assertEquals(2097152, er.getNumOfResluts());
		assertEquals(1200128, er.getNumOfRuns());
		assertEquals(expectedWinnersList, er.getWinnersList());

//		fail("Not yet implemented");
	}

	private void setRounds1234x6789xx12xxxCompleteData(ExcelReader e) {
		Pick p;
		Person person;

		Person team1 = new Person("team1");
    	p = new Pick("Tampa Bay", 5, false, 2);
    	team1.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
    	team1.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
    	team1.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
    	team1.addPicks(4, p);
    	p = new Pick("Nashville", 6, false, 2);
    	team1.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
    	team1.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
    	team1.addPicks(7, p);
    	p = new Pick("Anaheim", 7, false, 2);
    	team1.addPicks(8, p);

    	p = new Pick("Tampa Bay", 4, false, 3);
    	team1.addPicks(9, p);
    	p = new Pick("Washington", 4, false, 3);
    	team1.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
    	team1.addPicks(11, p);
    	p = new Pick("Vegas", 4, false, 3);
    	team1.addPicks(12, p);

    	p = new Pick("Tampa Bay", 4, false, 4);
    	team1.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
    	team1.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team1.addPicks(15, p);
		e.setTeam1(team1);

		Person team2 = new Person("team2");
    	p = new Pick("New Jersey", 7, false, 2);
    	team2.addPicks(1, p);
    	p = new Pick("Toronto", 7, false, 2);
    	team2.addPicks(2, p);
    	p = new Pick("Columbus", 7, false, 2);
    	team2.addPicks(3, p);
    	p = new Pick("Philadelphia", 7, false, 2);
    	team2.addPicks(4, p);
    	p = new Pick("Colorado", 7, false, 2);
    	team2.addPicks(5, p);
    	p = new Pick("Minnesota", 7, false, 2);
    	team2.addPicks(6, p);
    	p = new Pick("Los Angeles", 7, false, 2);
    	team2.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
    	team2.addPicks(8, p);

    	p = new Pick("Boston", 4, false, 3);
    	team2.addPicks(9, p);
    	p = new Pick("Pittsburgh", 4, false, 3);
    	team2.addPicks(10, p);
    	p = new Pick("Winnipeg", 4, false, 3);
    	team2.addPicks(11, p);
    	p = new Pick("San Jose", 6, false, 3);
    	team2.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
    	team2.addPicks(13, p);
    	p = new Pick("San Jose", 4, false, 4);
    	team2.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
    	team2.addPicks(15, p);
		e.setTeam2(team2);

		Person winner = new Person("Winner");
    	p = new Pick("Tampa Bay", 5, false, 2);
		winner.addPicks(1, p);
    	p = new Pick("Boston", 7, false, 2);
		winner.addPicks(2, p);
    	p = new Pick("Washington", 6, false, 2);
		winner.addPicks(3, p);
    	p = new Pick("Pittsburgh", 6, false, 2);
		winner.addPicks(4, p);
    	p = new Pick("", 0, false, 2);
		winner.addPicks(5, p);
    	p = new Pick("Winnipeg", 5, false, 2);
		winner.addPicks(6, p);
    	p = new Pick("Vegas", 4, false, 2);
		winner.addPicks(7, p);
    	p = new Pick("San Jose", 4, false, 2);
		winner.addPicks(8, p);

    	p = new Pick("Tampa Bay", 5, false, 3);
		winner.addPicks(9, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(10, p);
    	p = new Pick("", 0, false, 3);
		winner.addPicks(11, p);
    	p = new Pick("San Jose", 6, false, 3);
		winner.addPicks(12, p);

    	p = new Pick("", 0, false, 4);
		winner.addPicks(13, p);
    	p = new Pick("", 0, false, 4);
		winner.addPicks(14, p);

    	p = new Pick("", 0, false, 5);
		winner.addPicks(15, p);
		e.setWinner(winner);

		boolean[] seriesFinished= {false, true, true, true, true, false, true, true, true, true, false, false, true, false, false, false};
		e.setSeriesFinished(seriesFinished);

		//set expected results
		expectedWinnersList.clear();
		expectedWinnersList.put("JJ", 11270.250000000031);
		expectedWinnersList.put("Seth", 0.0);
		expectedWinnersList.put("Pat", 72.00000000000007);
		expectedWinnersList.put("Jay", 228.3333333333337);
		expectedWinnersList.put("KevinC", 0.0);
		expectedWinnersList.put("Pickle", 8.0);
		expectedWinnersList.put("EricL", 6036.833333333327);
		expectedWinnersList.put("EricK", 9190.99999999982);
		expectedWinnersList.put("Terry", 0.0);
		expectedWinnersList.put("John", 0.0);
		expectedWinnersList.put("Vineel", 1209.9999999999973);
		expectedWinnersList.put("KevinK", 0.0);
		expectedWinnersList.put("Ray", 0.0);
		expectedWinnersList.put("Greg", 6346.25);
		expectedWinnersList.put("Paul", 0.0);
		expectedWinnersList.put("Matt", 0.0);
		expectedWinnersList.put("George", 0.0);
		expectedWinnersList.put("BenT", 256.0);
		expectedWinnersList.put("Chris", 0.0);
		expectedWinnersList.put("Susan", 0.0);
		expectedWinnersList.put("BenS", 1.0);
		expectedWinnersList.put("MaryBeth", 28542.499999999138);
		expectedWinnersList.put("Rich", 0.0);
		expectedWinnersList.put("Fitch", 0.0);
		expectedWinnersList.put("Don", 0.0);
		expectedWinnersList.put("Neal", 0.0);
		expectedWinnersList.put("ScottM", 0.0);
		expectedWinnersList.put("Jon", 5897.833333333285);
		expectedWinnersList.put("Lucas", 20331.499999999916);
		expectedWinnersList.put("Noah", 6683.499999999963);
		expectedWinnersList.put("ScottVdM", 0.0);
		expectedWinnersList.put("Adam", 0.0);
		expectedWinnersList.put("Mike", 0.0);
		expectedWinnersList.put("Tom", 21.999999999999993);
		expectedWinnersList.put("Barry", 192.0);
		expectedWinnersList.put("TNelson", 0.0);
		expectedWinnersList.put("Bill", 2014.9999999999877);
		expectedWinnersList.put("Jeff", 0.0);
	}

	@Test
	public void testRounds1234x6789xx12xxxComplete() {
		ExcelReader er = null;
		try {
			er = new ExcelReader("");
			//setup the data
			setStaticData(er);
			setRounds1234x6789xx12xxxCompleteData(er);
			er.processSeries(1, 1, "");

		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("time it took: "); // + (System.currentTimeMillis() - startTime)/1000 + " seconds");
		}

		assertEquals(98304, er.getNumOfResluts());
		assertEquals(84288, er.getNumOfRuns());
		assertEquals(expectedWinnersList, er.getWinnersList());

//		fail("Not yet implemented");
	}
}
