package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter {
	
	
	public BogoSorter() {	
	
	}
	
	public static void main(String[] args) {
		int[] a = {10, 1, 80, 5, 80, 5, 2, 1, 5, 7, 6, 9, 23, 29, 10, 24, 56};
		sort(a);
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm.
	

	static void sort(int[] array) {
		  for (int i = 0; i < array.length - 1; i++) {
		        if (array[i] > array[i + 1]) {
		            System.out.println("Not in order; swapping two random elements...");
		            Random r = new Random();
		            int randomkey1 = r.nextInt(array.length);
		            int randomkey2 = r.nextInt(array.length);
		            int key2 = array[randomkey2];
		            array[randomkey1] = key2;
		            key2 = array[randomkey1];
		            

		        }
		        else {
		        	System.out.println("Sorter completed; array is now in order.");
		        }
	}
	}
}
