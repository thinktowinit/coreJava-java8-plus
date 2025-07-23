package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyParallelSort {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();

		list.add("z");
		list.add("x");
		list.add("y");
		list.add("bbc");
		list.add("abc");
		list.add("c");

		   // Convert list to array
        String[] array = list.toArray(new String[0]);

        // Parallel sort ascending
        Arrays.parallelSort(array);
        
        
     // Convert array to list
        List<String> ascendingOrderLIst = Arrays.asList(array);
        ascendingOrderLIst.forEach(System.out::println);

        

	}

}
