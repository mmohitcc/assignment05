package assignment05;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.junit.Test;

public class SortUtilTest {

	private class AlgorithmComparator implements Comparator<String> {
		@Override
		public int compare(String leftString, String rightString) {
			return leftString.compareTo(rightString);
		}
	}

	@Test
	public void testMergesort() {
		ArrayList<String> testCase = new ArrayList<String>();

		testCase.add("a");
		testCase.add("c");
		testCase.add("d");
		testCase.add("t");
		testCase.add("h");
		testCase.add("b");

		ArrayList<String> testCaseCorrect = new ArrayList<String>();
		testCaseCorrect.add("a");
		testCaseCorrect.add("b");
		testCaseCorrect.add("c");
		testCaseCorrect.add("d");
		testCaseCorrect.add("h");
		testCaseCorrect.add("t");
		SortUtil.mergesort(testCase, new AlgorithmComparator());
		assertEquals(testCaseCorrect, testCase);
	}

	@Test
	public void testQuicksort() {
		ArrayList<String> testCase = new ArrayList<>();

		testCase.add("a");
		testCase.add("c");
		testCase.add("d");
		testCase.add("t");
		testCase.add("h");
		testCase.add("b");

		ArrayList<String> testCaseCorrect = new ArrayList<>();
		testCaseCorrect.add("a");
		testCaseCorrect.add("b");
		testCaseCorrect.add("c");
		testCaseCorrect.add("d");
		testCaseCorrect.add("h");
		testCaseCorrect.add("t");
		SortUtil.quicksort(testCase, new AlgorithmComparator());
		assertEquals(testCaseCorrect, testCase);

	}

	@Test
	public void testGenerateBestCase() {
		ArrayList<String> testCase = new ArrayList<>();

		testCase.add("1");
		testCase.add("2");
		testCase.add("3");
		testCase.add("4");
		testCase.add("5");
		testCase.add("6");
		System.out.print("Best Case (sorted)");
		System.out.println(SortUtil.generateBestCase((testCase.size())));
	}

	@Test
	public void testGenerateAverageCase() {
		ArrayList<String> testCase = new ArrayList<>();

		testCase.add("1");
		testCase.add("2");
		testCase.add("3");
		testCase.add("4");
		testCase.add("5");
		testCase.add("6");
		System.out.print("Average Case (Random)");
		System.out.println(SortUtil.generateAverageCase(testCase.size()));
	}

	@Test
	public void testGenerateWorstCase() {
		ArrayList<String> testCase = new ArrayList<>();

		testCase.add("1");
		testCase.add("2");
		testCase.add("3");
		testCase.add("4");
		testCase.add("5");
		testCase.add("6");
		System.out.print("Worst Case (Reversed)");
		System.out.println(SortUtil.generateWorstCase(testCase.size()));
	}

}
