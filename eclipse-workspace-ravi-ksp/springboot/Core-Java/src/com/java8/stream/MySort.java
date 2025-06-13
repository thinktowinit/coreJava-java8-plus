package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MySort {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("x");
		list.add("y");
		list.add("abc");
		list.add("abc");

		List<String> assendingOrder = list.stream().sorted().collect(Collectors.toList());
		assendingOrder.forEach(System.out::println);
		System.out.println("=================below is desendig order");

		List<String> decendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		decendingOrder.forEach(System.out::println);
	}

}
