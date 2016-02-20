/**
 * Class to perform timing experiments of areAnagrams() and getLargestAnagramGroup()
 * methods from the class AnagramUtil
 * 
 * @author Mohit Chaudhary, Moses Manning
 * Last Modified: Feb. 18, 2016
 */
package assignment05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class TimingTestForMergeSort {
	
	
	private static Random rand;
	private static final int ITER_COUNT = 100;
	private static ArrayList<ArrayList> mergearr = new ArrayList<ArrayList>();
	
	
	
	
	public static void mergeTimerAverage(){
		long startTime = System.nanoTime();
		ArrayList<Integer> intTest = new ArrayList<Integer>();
		Comparator<Integer> cmp = intComparator(); 
		
		System.out.println();
		while (System.nanoTime() - startTime < 1000000000);
		
		try(FileWriter fw = new FileWriter(new File("getLargestAnagramGroup_experiment.tsv"))) { //open up a file writer so we can write to file.
			for(int exp = 1; exp < 20 ; exp++) { // This is used as the exponent to calculate the size of the set.
				int size = (int) Math.pow(2, exp);
				long totalTime = 0;
				for (int iter = 0; iter < ITER_COUNT; iter++) {
					// TIME IT!
					//intTest = SortUtil.generateAverageCase(size);
					long start = System.nanoTime();
					SortUtil.mergesort(mergearr.get(exp), cmp);
					long stop = System.nanoTime();
					totalTime += stop - start;
				}
				
				double averageTime = totalTime / (double)ITER_COUNT;
				System.out.println(exp + "\t" + averageTime); // print to console
				fw.write(exp + "\t" + averageTime + "\n"); // write to file.
				// Increase size of testing array
				//intTest = SortUtil.generateAverageCase(exp);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void mergeTimerBest(){
		long startTime = System.nanoTime();
		ArrayList<Integer> intTest = new ArrayList<Integer>();
		Comparator<Integer> cmp = intComparator(); 
		
		System.out.println();
		while (System.nanoTime() - startTime < 1000000000);
		
		try(FileWriter fw = new FileWriter(new File("getLargestAnagramGroup_experiment.tsv"))) { //open up a file writer so we can write to file.
			for(int exp = 1; exp <= 25 ; exp++) { // This is used as the exponent to calculate the size of the set.
				int size = (int) Math.pow(2, exp);
				long totalTime = 0;
				for (int iter = 0; iter < ITER_COUNT; iter++) {
					// TIME IT!
					intTest = SortUtil.generateBestCase(size);
					long start = System.nanoTime();
					SortUtil.mergesort(intTest, cmp);
					long stop = System.nanoTime();
					totalTime += stop - start;
				}
				
				double averageTime = totalTime / (double)ITER_COUNT;
				System.out.println(intTest.size() + "\t" + averageTime); // print to console
				fw.write(intTest.size() + "\t" + averageTime + "\n"); // write to file.
				// Increase size of testing array
				intTest = SortUtil.generateBestCase(exp);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void mergeTimerWorst(){
		long startTime = System.nanoTime();
		ArrayList<Integer> intTest = new ArrayList<Integer>();
		Comparator<Integer> cmp = intComparator(); 
		
		System.out.println();
		while (System.nanoTime() - startTime < 1000000000);
		
		try(FileWriter fw = new FileWriter(new File("getLargestAnagramGroup_experiment.tsv"))) { //open up a file writer so we can write to file.
			for(int exp = 1; exp <= 25 ; exp++) { // This is used as the exponent to calculate the size of the set.
				int size = (int) Math.pow(2, exp);
				long totalTime = 0;
				for (int iter = 0; iter < ITER_COUNT; iter++) {
					// TIME IT!
					intTest = SortUtil.generateWorstCase(size);
					long start = System.nanoTime();
					SortUtil.mergesort(intTest, cmp);
					long stop = System.nanoTime();
					totalTime += stop - start;
				}
				
				double averageTime = totalTime / (double)ITER_COUNT;
				System.out.println(intTest.size() + "\t" + averageTime); // print to console
				fw.write(intTest.size() + "\t" + averageTime + "\n"); // write to file.
				// Increase size of testing array
				intTest = SortUtil.generateWorstCase(exp);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void quicksortTimerAvg(){
		long startTime = System.nanoTime();
		ArrayList<Integer> intTest = new ArrayList<Integer>();
		Comparator<Integer> cmp = intComparator(); 
		
		System.out.println();
		while (System.nanoTime() - startTime < 1000000000);
		
		try(FileWriter fw = new FileWriter(new File("getLargestAnagramGroup_experiment.tsv"))) { //open up a file writer so we can write to file.
			for(int exp = 1; exp < 22 ; exp++) { // This is used as the exponent to calculate the size of the set.
				int size = (int) Math.pow(2, exp);
				long totalTime = 0;
				for (int iter = 0; iter < ITER_COUNT; iter++) {
					// TIME IT!
					//intTest = SortUtil.generateAverageCase(size);
					long start = System.nanoTime();
					SortUtil.quicksort(mergearr.get(exp), cmp);
					long stop = System.nanoTime();
					totalTime += stop - start;
				}
				
				double averageTime = totalTime / (double)ITER_COUNT;
				System.out.println(Math.pow(2, exp) + "\t" + averageTime); // print to console
				fw.write(intTest.size() + "\t" + averageTime + "\n"); // write to file.
				// Increase size of testing array
				//intTest = SortUtil.generateAverageCase(exp);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void quicksortTimerBest(){
		long startTime = System.nanoTime();
		ArrayList<Integer> intTest = new ArrayList<Integer>();
		Comparator<Integer> cmp = intComparator(); 
		
		System.out.println();
		while (System.nanoTime() - startTime < 1000000000);
		
		try(FileWriter fw = new FileWriter(new File("getLargestAnagramGroup_experiment.tsv"))) { //open up a file writer so we can write to file.
			for(int exp = 1; exp <= 25 ; exp++) { // This is used as the exponent to calculate the size of the set.
				int size = (int) Math.pow(2, exp);
				long totalTime = 0;
				for (int iter = 0; iter < ITER_COUNT; iter++) {
					// TIME IT!
					intTest = SortUtil.generateBestCase(size);
					long start = System.nanoTime();
					SortUtil.quicksort(intTest, cmp);
					long stop = System.nanoTime();
					totalTime += stop - start;
				}
				
				double averageTime = totalTime / (double)ITER_COUNT;
				System.out.println(intTest.size() + "\t" + averageTime); // print to console
				fw.write(intTest.size() + "\t" + averageTime + "\n"); // write to file.
				// Increase size of testing array
				intTest = SortUtil.generateBestCase(exp);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void quicksortTimerWorst(){
		long startTime = System.nanoTime();
		ArrayList<Integer> intTest = new ArrayList<Integer>();
		Comparator<Integer> cmp = intComparator(); 
		
		System.out.println();
		while (System.nanoTime() - startTime < 1000000000);
		
		try(FileWriter fw = new FileWriter(new File("getLargestAnagramGroup_experiment.tsv"))) { //open up a file writer so we can write to file.
			for(int exp = 1; exp <= 25 ; exp++) { // This is used as the exponent to calculate the size of the set.
				int size = (int) Math.pow(2, exp);
				long totalTime = 0;
				for (int iter = 0; iter < ITER_COUNT; iter++) {
					// TIME IT!
					intTest = SortUtil.generateWorstCase(size);
					long start = System.nanoTime();
					SortUtil.quicksort(intTest, cmp);
					long stop = System.nanoTime();
					totalTime += stop - start;
				}
				
				double averageTime = totalTime / (double)ITER_COUNT;
				System.out.println(intTest.size() + "\t" + averageTime); // print to console
				fw.write(intTest.size() + "\t" + averageTime + "\n"); // write to file.
				// Increase size of testing array
				intTest = SortUtil.generateWorstCase(exp);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void mergeNoInsert(){
		long startTime = System.nanoTime();
		ArrayList<Integer> intTest = new ArrayList<Integer>();
		Comparator<Integer> cmp = intComparator(); 
		
		System.out.println();
		while (System.nanoTime() - startTime < 1000000000);
		
		try(FileWriter fw = new FileWriter(new File("getLargestAnagramGroup_experiment.tsv"))) { //open up a file writer so we can write to file.
			for(int exp = 1; exp <= 25 ; exp++) { // This is used as the exponent to calculate the size of the set.
				int size = (int) Math.pow(2, exp);
				long totalTime = 0;
				for (int iter = 0; iter < ITER_COUNT; iter++) {
					// TIME IT!
					intTest = SortUtil.generateAverageCase(size);
					long start = System.nanoTime();
					SortUtil.mergesort(intTest, cmp);
					long stop = System.nanoTime();
					totalTime += stop - start;
				}
				
				double averageTime = totalTime / (double)ITER_COUNT;
				System.out.println(intTest.size() + "\t" + averageTime); // print to console
				fw.write(intTest.size() + "\t" + averageTime + "\n"); // write to file.
				// Increase size of testing array
				intTest = SortUtil.generateAverageCase(exp);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public static void setArr() {
		for(int i = 1 ; i <= 22; i++) {
			mergearr.add(SortUtil.generateAverageCase((int) Math.pow(2, i)));
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Set up the random number generator for the randomString function
		rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		setArr();
		//setting up a constant permuted arrayList filled with Random arraylists
		
		
		mergeTimerAverage();
		mergeTimerWorst();
		mergeTimerBest();
		mergeTimerAverage();
		quicksortTimerAvg();
		quicksortTimerWorst();
		mergeNoInsert();
		
	
		
	}
	
	protected static Comparator<Integer> intComparator() {
		TimingTestForMergeSort g = new TimingTestForMergeSort();
		Comparator<Integer> s = g.new intComparator();
		return s;
	}
		
	protected class intComparator implements Comparator<Integer> {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1 > o2) return 1;
			if(o1 < o2) return -1;
			return 0;
		}
	}
	
}


