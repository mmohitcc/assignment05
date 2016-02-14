package assignment05;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.junit.Test;

public class SortUtilTest {
	
	private class AlgorithmComparator implements Comparator<String> {
		@Override
		public int compare(String leftString, String rightString){
			return leftString.compareTo(rightString);
		}
	}

	@Test
	public void testMergesort() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuicksort() {
		ArrayList<String> testCase = new ArrayList();
		
		testCase.add("a");
		testCase.add("c");
		testCase.add("d");
		testCase.add("t");
		testCase.add("h");
		testCase.add("b");
		
		ArrayList<String> testCaseCorrect = new ArrayList();
		testCaseCorrect.add("a");
		testCaseCorrect.add("b");
		testCaseCorrect.add("c");
		testCaseCorrect.add("d");
		testCaseCorrect.add("h");
		testCaseCorrect.add("t");
		
		
		SortUtil.quickTest(testCase, new AlgorithmComparator());
		assertEquals(testCaseCorrect, testCase);
	}

	@Test
	public void testGenerateBestCase() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateAverageCase() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateWorstCase() {
		fail("Not yet implemented");
	}
	
	
	

}
