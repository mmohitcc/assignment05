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
		ArrayList<T> arr2 = quickSortRecursive(arr,cmp);
		arr.add(arr.get(0));
		//arr = arr2;
		
	}
	
	public static <T> void quickTest(ArrayList<T> arr, Comparator<? super T> cmp) {
		arr = quickSortRecursive(arr, cmp);
	}

	public static <T> ArrayList<T> quickSortRecursive(ArrayList<T> arrayQ, Comparator<? super T> cmp) {

		if (arrayQ.size() <= 1) {
			return arrayQ;
		}

		int mid = arrayQ.size() / 2;

		T pivot = arrayQ.get(mid);

		ArrayList<T> arrLower = new ArrayList();
		ArrayList<T> arrUpper = new ArrayList();

		for (int i = 0; i < arrayQ.size(); i++) {
			if (cmp.compare(arrayQ.get(i), pivot) <= 0) {
				if (i == mid) {
					continue;
				}
				arrLower.add(arrayQ.get(i));
			} else {
				arrUpper.add(arrayQ.get(i));
			}

		}
		return merge(quickSortRecursive(arrLower, cmp), pivot, quickSortRecursive(arrUpper, cmp));
	}

	

	private static <T> ArrayList<T> merge(ArrayList<T> lowerList, T pivot, ArrayList<T> upperList) {
		ArrayList<T> mergeList = new ArrayList<T>();

		for (int i = 0; i < lowerList.size(); i++) {
			mergeList.add(lowerList.get(i));
		}

		mergeList.add(pivot);

		for (int i = 0; i < upperList.size(); i++) {
			mergeList.add(upperList.get(i));
		}

		return mergeList;

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
