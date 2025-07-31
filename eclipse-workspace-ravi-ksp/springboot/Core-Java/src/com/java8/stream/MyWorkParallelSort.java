package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyWorkParallelSort {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(6);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(11);
		list.add(21);



		   // Convert list to array
	    
		Integer[] integerArray = list.toArray(new Integer[0]);

	    // Parallel sort ascending
	    Arrays.parallelSort(integerArray);
	    
	    
	 // Convert array to list
	    List<Integer> ascendingOrderLIst = Arrays.asList(integerArray);
                
                
	    ascendingOrderLIst.forEach(System.out::println);

	    

	}

		
	}
	
	


