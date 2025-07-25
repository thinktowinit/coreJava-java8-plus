package com.util.story2.java;

import java.util.Arrays;

public class ParallelSortExample {
	
	    public static void main(String[] args) {
	        // Integer array
	        int[] numbers = {42, 3, 17, 8, 99, 12};
	        // String array
	        String[] names = {"Zara", "Amit", "John", "Brian", "Charlie"};

	        // Before sorting
	        System.out.println("Before sorting integers: " + Arrays.toString(numbers));
	        System.out.println("Before sorting strings: " + Arrays.toString(names));

	        // Parallel sort
	        Arrays.parallelSort(numbers);
	        Arrays.parallelSort(names);

	        // After sorting
	        System.out.println("After parallel sorting integers: " + Arrays.toString(numbers));
	        System.out.println("After parallel sorting strings: " + Arrays.toString(names));
	    }
	}



