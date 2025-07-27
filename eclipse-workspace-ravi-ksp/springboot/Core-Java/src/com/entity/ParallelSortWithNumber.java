package com.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelSortWithNumber {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(56);
		list.add(10);
		list.add(15);
		list.add(30);
		list.add(5);
		list.add(20);

		// Convert list to array
		Integer[] array = list.toArray(new Integer[0]);

		// Parallel sort ascending
		Arrays.parallelSort(array);

		// Convert array to list
		List<Integer> ascendingOrderLIst = Arrays.asList(array);
		ascendingOrderLIst.forEach(System.out::println);

	}

}
