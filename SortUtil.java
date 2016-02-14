package assignment05;

import java.util.ArrayList;
import java.util.Comparator;



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
	 * @param arrayM
	 * @param cmp
	 */
	public static <T> void mergesort(ArrayList<T> arrayM, Comparator<? super T> cmp) {
		
		
		
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
	 * @param arr
	 * @param cmp
	 */
	public static <T> void quicksort(ArrayList<T> arr, Comparator<? super T> cmp) {
		

		int leftValue = 0;
		int rightValue = arr.size() -1;
		quicksortRecursive(arr, leftValue, rightValue, cmp);
		
		}
	
	public static <T> void quicksortRecursive(ArrayList<T> arrQ, int left, int right, Comparator<? super T> cmp) {
		
		int i = left;
		int j = right;
		T temp;
		T pivot = arrQ.get((left+right)/2);
		
		while (i <= j) {
			while (cmp.compare(arrQ.get(i), pivot) < 0) {
				i++;
			}
			while (cmp.compare(arrQ.get(j), pivot) > 0) {
				j--;
			}
			if(i <= j) {
				temp = arrQ.get(i);
				arrQ.set(i,arrQ.get(j));
				arrQ.set(j, temp);
				i++;
				j--;
			}
		}
		if(left < j) {
			quicksortRecursive(arrQ, left, j, cmp);
		}
		if(i < right) {
			quicksortRecursive(arrQ, i, right, cmp);
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
		return null;
	}

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