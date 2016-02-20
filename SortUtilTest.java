/*SortUtil Class Junit tester, tests implementations of Mergesort and quicksort from SortUtil Class
 * 
 * Authors: Mohit Chaudhary, Moses Manning
 * 
 * Last Update: 2/18/16
 * 
 */

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
	public void testMergeSortBiggerN() {
		
		
		ArrayList<String> myarr = new ArrayList<String>(); 
		myarr.add("aword");
		myarr.add("hello");
		myarr.add("who");
		myarr.add("when");
		myarr.add("aworrd");
		myarr.add("helloo");
		myarr.add("whoe");
		myarr.add("cup");
		myarr.add("bird");
		myarr.add("capricorn");
		myarr.add("clue");
		myarr.add("crazy");
		myarr.add("billy");
		myarr.add("deal");
		myarr.add("bam");
		myarr.add("damn");
		myarr.add("fire");
		myarr.add("fried");
		myarr.add("brave");
		myarr.add("dave");
		myarr.add("sam");
		myarr.add("tram");
		myarr.add("poline");
		myarr.add("taste");
		myarr.add("zappos");
		myarr.add("zoooppos");
		myarr.add("the");
		myarr.add("chicken");
		myarr.add("whose");
		myarr.add("wants");
		myarr.add("it");
		myarr.add("no");
		myarr.add("beef");
		myarr.add("bro");
		
		
		ArrayList<String> arrtest = new ArrayList<String>();
		arrtest.add("aword");
		arrtest.add("aworrd");
		arrtest.add("bam");
		arrtest.add("beef");
		arrtest.add("billy");
		arrtest.add("bird");
		arrtest.add("brave");
		arrtest.add("bro");
		arrtest.add("capricorn");
		arrtest.add("chicken");
		arrtest.add("clue");
		arrtest.add("crazy");
		arrtest.add("cup");
		arrtest.add("damn");
		arrtest.add("dave");
		arrtest.add("deal");
		arrtest.add("fire");
		arrtest.add("fried");
		arrtest.add("hello");
		arrtest.add("helloo");
		arrtest.add("it");
		arrtest.add("no");
		arrtest.add("poline");
		arrtest.add("sam");
		arrtest.add("taste");
		arrtest.add("the");
		arrtest.add("tram");
		arrtest.add("wants");
		arrtest.add("when");
		arrtest.add("who");
		arrtest.add("whoe");
		arrtest.add("whose");
		arrtest.add("zappos");
		arrtest.add("zoooppos");
		
		SortUtil.mergesort(myarr, new AlgorithmComparator());
		assertEquals(myarr, arrtest);
		
		
		
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
		ArrayList<Integer> testCase = new ArrayList<>();

		testCase.add(1);
		testCase.add(2);
		testCase.add(3);
		testCase.add(4);
		testCase.add(5);
		testCase.add(6);

		assertEquals(testCase, SortUtil.generateBestCase(testCase.size()));
		
		
	}

	@Test
	public void testGenerateAverageCase() {
		ArrayList<Integer> testCase = new ArrayList<>();

		testCase.add(1);
		testCase.add(2);
		testCase.add(3);
		testCase.add(4);
		testCase.add(5);
		testCase.add(6);
		
		assertNotSame(testCase, SortUtil.generateAverageCase(testCase.size()));
		
	}

	@Test
	public void testGenerateWorstCase() {
		ArrayList<Integer> testCase = new ArrayList<>();

		testCase.add(6);
		testCase.add(5);
		testCase.add(4);
		testCase.add(3);
		testCase.add(2);
		testCase.add(1);
		
		assertEquals(testCase, SortUtil.generateWorstCase(testCase.size()));
		
	}

}
