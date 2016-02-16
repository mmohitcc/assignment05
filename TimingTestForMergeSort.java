package assignment05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import assignment04.AnagramUtil;

public class TimingTestForMergeSort implements Comparable{

	private static final int ITER_COUNT = 1000;
	private static Comparator cmp;

	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		cmp = null;
		// you spin me round baby, right round
		long startTime = System.nanoTime();
		while (System.nanoTime() - startTime < 1000000000);
		for (int exp = 10; exp <= 25; exp++) { // This is used as the exponent
												// to calculate the size of the
												// set.
			int size = (int) Math.pow(2, exp); // or ..
			size = 1 << exp; // the two statements are equivalent, look into
								// bit-shifting if you're interested what is
								// going on here.

			// Do the experiment multiple times, and average out the results
			long totalTime = 0;
			for (int iter = 0; iter < ITER_COUNT; iter++) {
				// SET UP!

				ArrayList<String> input = new ArrayList<>();
				for (int i = 0; i < input.size(); i++) {
					input.add(randomString(5));
				}

				// TIME IT!
				long start = System.nanoTime();

				for (int i = 0; i < input.size() - 1; i++) {
				
				
				SortUtil.mergesort(input, cmp);
				
//					areAnagrams(anagramStrings.get(i), anagramStrings.get(i + 1));
				}

				long stop = System.nanoTime();
				totalTime += stop - start;
			}
			double averageTime = totalTime / (double) ITER_COUNT;
			System.out.println(size + "\t" + averageTime); // print to console
		}
	}

	// Create a random string [a-z] of specified length
	public static String randomString(int length) {
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());

		String retval = "";
		for (int i = 0; i < length; i++) {
			// ASCII values a-z,A-Z are contiguous (52 characters)
			retval += (char) ('a' + (rand.nextInt(26)));
		}
		return retval;
	}

	@Override
	public int compareTo(Object o) {
		int rightValue;
		int leftValue;
		ArrayList input;
		ArrayList temp;
		if (SortUtil.mergeSort(input, leftValue, rightValue, cmp, temp));
			return 1;
		else
			return -1;
	}
}
