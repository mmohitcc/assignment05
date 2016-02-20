/*SortUtil Class, implements Mergesort and quicksort
 * 
 * Authors: Mohit Chaudhary, Moses Manning
 * 
 * Last Update: 2/18/16
 * 
 */

package assignment05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class SortUtil {

	public static int InsertionPoint = 2500;
	
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
		ArrayList<T> temp = new ArrayList<T>();
		mergeSort(input, 0, input.size() - 1, cmp, temp);

	}

	public static <T> void mergeSort(ArrayList<T> input, int leftValue, int rightValue, Comparator<? super T> cmp,
			ArrayList<T> temp) {


		if (leftValue <= InsertionPoint) {
			insertionSort(input, cmp);
			return;
		}
		
		int middle = (leftValue + rightValue) / 2;

		mergeSort(input, leftValue, middle, cmp, temp);
		mergeSort(input, middle + 1, rightValue, cmp, temp);
		merge(input, leftValue, middle, rightValue, cmp, temp);

	}
	
	/*Merge method
	 * 
	 * sorts and merges the parts of the array list pased in, into the temporary arraylist passed in and 
	 * then puts the sorted portion back into the original array.
	 * 
	 */

	public static <T> void merge(ArrayList<T> input, int leftValue, int middle, int rightValue, Comparator<? super T> cmp, ArrayList<T> temp) {

		int l = leftValue;
		int r = middle + 1;
		int i = 0;

		while (l <= middle && r <= rightValue) {
			if (cmp.compare(input.get(l), input.get(r)) <= 0) {
				// temp.add(input.get(l++))
				temp.set(leftValue, input.get(l++));
			} else {
				// temp.add(input.get(r++))
				temp.set(l, input.get(r++));
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

	/*
	 * Insertion Sort
	 * uses insertion sort to sort the passed in array using the passed in comparator
	 * 
	 * 
	 */
	public static <T> void insertionSort(ArrayList<T> arr, Comparator<? super T> c) {
		T temp;
		for (int i = 1; i < arr.size(); i++) {
			int j = i;
			while (j > 0 && c.compare(arr.get(j - 1), arr.get(j)) > 0) {
				temp = arr.get(j);
				arr.set(j, arr.get(j - 1));
				arr.set(j - 1, temp);
				j--;
			}
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

	/* recusrive method for quicksort algorithm.
	 * sets pivot, and compares and sorts items in the passed in array;
	 * 
	 */
	public static <T> void quicksortRecursive(ArrayList<T> input, int left, int right, Comparator<? super T> cmp) {

		int i = left;
		int j = right;
		T temp;
		T pivot = input.get(pivotPickerMedian( left, right));
		
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
		
		ArrayList<Integer> orderedList = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			orderedList.add(i);
		}
		
		for (int j = 0; j < orderedList.size(); j++){
		
		}
		
		return orderedList;
	}

	/**
	 * This method generates and returns an ArrayList of integers 1 to size in
	 * permuted order (i,e., randomly ordered).
	 * 
	 * @param size
	 * @return
	 */
	public static ArrayList<Integer> generateAverageCase(int size) {
		ArrayList<Integer> randomList = new ArrayList<>();
		Random rand = new Random(100);
		for (int i = size; i > 0; i--) {
			randomList.add(rand.nextInt(size));
		}

		

		return randomList;
	}


	/**
	 * This method generates and returns an ArrayList of integers 1 to size in
	 * descending order.
	 * 
	 * @param size
	 * @return
	 */
	public static ArrayList<Integer> generateWorstCase(int size) {
		ArrayList<Integer> worstCaseList = new ArrayList<>();

		
		for (int i = size; i > 0; i--) {
			worstCaseList.add(i);
		}
		
		return worstCaseList;
	}
	
/*Pivot picker method, picks pivot based on median value
 * 	
 */
	public static int pivotPickerMedian(int left, int right) {
		return (left + right) / 2;
	}
	/*Pivot Picker, picks leftmost value as pivot
	 * 
	 */
	public static int pivotPickerFirst(int left) {
		return left;
	}
	/*Pivot Picker, picks Right most value
	 * 
	 */
	public static int pivotPickerLast(int last) { 
		return last;
	}
	
	
	}
