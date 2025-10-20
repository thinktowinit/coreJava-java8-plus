package com.java8.stream;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class MyParallelSortingOnCustomer {
	public static void main(String[] args) {
		String arr[]= {"alpha","theta","beta","gamma","epsilon"};
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(s->System.out.println(s));
	}
}
