package assignment05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class SortUtil {

	/**
	 * This method performs a mergesort on the generic ArrayList given as input.
	 * 
	 * Your mergesort implementation must switch over to insertion sort when the
	 * size of the sublist to be sorted meets a certain threshold (i.e., becomes
	 * small enough)
	 * 
	 * 
	 * Make this threshold value a private static variable that you can easily
	 * change.
	 * 
	 * @param input
	 * @param cmp
	 */
	public static <T> void mergesort(ArrayList<T> input, Comparator<? super T> cmp) {

		mergeSort(input, 0, input.size() - 1, cmp);

	}

	public static <T> void mergeSort(ArrayList<T> input, int leftValue, int rightValue, Comparator<? super T> cmp) {
		// If the left value is greater than or equal to the right return the
		// method
		if (leftValue >= rightValue) {
			return;
		}

		int middle = (leftValue + rightValue) / 2;

		mergeSort(input, leftValue, middle, cmp);
		mergeSort(input, middle + 1, rightValue, cmp);
		merge(input, leftValue, middle, rightValue, cmp);
		

	}
	
	public static <T> void merge(ArrayList<T> input, int leftValue, int middle, int rightValue, Comparator<? super T> cmp) {
		
		ArrayList<T> temp = new ArrayList<T>();
		int l = leftValue;
		int r = middle + 1;
		int i = 0;

		while (l <= middle && r <= rightValue) {
			if (cmp.compare(input.get(l), input.get(r)) <= 0) {
				temp.add(input.get(l++));
			} else {
				temp.add(input.get(r++));
			}
		}
		while (l <= middle) {
			temp.add(input.get(l++));
		}
		while (r <= rightValue) {
			temp.add(input.get(r++));
		}
		i = leftValue;
		for (int j = 0; j < temp.size(); j++) {
			input.set(i++, temp.get(j));
		}
		
		
	}
	
	
	
	
	
	
	

	/**
	 * This method performs a quicksort on the generic ArrayList given as input.
	 * 
	 * You must implement three different strategies for determining the pivot.
	 * Your quicksort implementation should be able to easily switch among these
	 * strategies.
	 * 
	 * You will perform experiments to determine which pivot strategy works best
	 * 
	 * @param input
	 * @param cmp
	 */
	public static <T> void quicksort(ArrayList<T> input, Comparator<? super T> cmp) {

		int leftValue = 0;
		int rightValue = input.size() - 1;
		quicksortRecursive(input, leftValue, rightValue, cmp);

	}

	public static <T> void quicksortRecursive(ArrayList<T> input, int left, int right, Comparator<? super T> cmp) {

		int i = left;
		int j = right;
		T temp;
		T pivot = input.get((left + right) / 2);

		while (i <= j) {

			while (cmp.compare(input.get(i), pivot) < 0) {
				i++;

			}
			while (cmp.compare(input.get(j), pivot) > 0) {
				j--;

			}
			if (i <= j) {

				temp = input.get(i);
				input.set(i, input.get(j));
				input.set(j, temp);
				i++;
				j--;

			}
		}

		if (left < j) {

			quicksortRecursive(input, left, j, cmp);
		}
		if (i < right) {

			quicksortRecursive(input, i, right, cmp);
		}
	}

	/**
	 * This method generates and returns an ArrayList of integers 1 to size in
	 * ascending order.
	 * 
	 * @param size
	 * @return
	 */
	public static ArrayList<Integer> generateBestCase(int size) {

		return null;
	}

	/**
	 * This method generates and returns an ArrayList of integers 1 to size in
	 * permuted order (i,e., randomly ordered).
	 * 
	 * @param size
	 * @return
	 */
	public static ArrayList<Integer> generateAverageCase(int size) {
		ArrayList<Integer> orderedList = new ArrayList<>();
		
		for (int i = size; i > 0; i--){
			orderedList.add(i);
		}
		
		Collections.shuffle(orderedList);
		
		
		return orderedList;
		}
	
		
		
		
//		import java.util.Random;
//
//		public class Shuffle<T> {
//
//		    private final Random rnd;
//
//		    public Shuffle() {
//		        rnd = new Random();
//		    }
//
//		    /**
//		     * Fisher–Yates shuffle.
//		     */
//		    public void shuffle(T[] ar) {
//		        for (int i = ar.length - 1; i > 0; i--) {
//		            int index = rnd.nextInt(i + 1);
//		            T a = ar[index];
//		            ar[index] = ar[i];
//		            ar[i] = a;
//		        }
//		    }
//		}
	

	/**
	 * This method generates and returns an ArrayList of integers 1 to size in
	 * descending order.
	 * 
	 * @param size
	 * @return
	 */
	public static ArrayList<Integer> generateWorstCase(int size) {
		return null;
	}

}