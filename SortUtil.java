package assignment05;

import java.util.ArrayList;
import java.util.Comparator;

<<<<<<< HEAD

=======
>>>>>>> origin/master
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
<<<<<<< HEAD
		
		
		
=======

	}

	public static <T> ArrayList<T> mergesortRecursive(ArrayList<T> input, Comparator<? super T> cmp) {

		ArrayList<T> less = new ArrayList<T>();
		ArrayList<T> greater = new ArrayList<T>();
		int mid = input.size() / 2;
		T pivot = input.get(mid);
		if (input.size() == 1) {
			return input;
		}

		for (int i = 0; i < mid; i++) {
			if (cmp.compare(input.get(i), pivot) <= 0) {
				less.add(input.get(i));
			} else {
				greater.add(input.get(i));
			}
		}

		return mMerge(mergesortRecursive(less, cmp), pivot, mergesortRecursive(greater, cmp));
	}
	
	private static <T> ArrayList<T> mMerge(ArrayList<T> lowerList, T pivot, ArrayList<T> upperList) {
		ArrayList<T> mergeList = new ArrayList<T>();

		for (int i = 0; i < lowerList.size(); i++) {
			mergeList.add(lowerList.get(i));
		}

		mergeList.add(pivot);

		for (int i = 0; i < upperList.size(); i++) {
			mergeList.add(upperList.get(i));
		}

		return mergeList;

>>>>>>> origin/master
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
<<<<<<< HEAD
		

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
=======
		ArrayList<T> arr2 = quickSortRecursive(arr, cmp);
		arr.add(arr.get(0));
		// arr = arr2;

	}

	public static <T> void quickTest(ArrayList<T> arr, Comparator<? super T> cmp) {
		arr = quickSortRecursive(arr, cmp);
	}

	public static <T> ArrayList<T> quickSortRecursive(ArrayList<T> input, Comparator<? super T> cmp) {

		if (input.size() <= 1) {
			return input;
		}

		int mid = input.size() / 2;

		T pivot = input.get(mid);

		ArrayList<T> less = new ArrayList();
		ArrayList<T> greater = new ArrayList();

		for (int i = 0; i < input.size(); i++) {
			if (cmp.compare(input.get(i), pivot) <= 0) {
				if (i == mid) {
					continue;
				}
				less.add(input.get(i));
			} else {
				greater.add(input.get(i));
>>>>>>> origin/master
			}
		}
<<<<<<< HEAD
		if(left < j) {
			quicksortRecursive(arrQ, left, j, cmp);
=======
		return qMerge(quickSortRecursive(less, cmp), pivot, quickSortRecursive(greater, cmp));
	}

	private static <T> ArrayList<T> qMerge(ArrayList<T> lowerList, T pivot, ArrayList<T> upperList) {
		ArrayList<T> mergeList = new ArrayList<T>();

		for (int i = 0; i < lowerList.size(); i++) {
			mergeList.add(lowerList.get(i));
>>>>>>> origin/master
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