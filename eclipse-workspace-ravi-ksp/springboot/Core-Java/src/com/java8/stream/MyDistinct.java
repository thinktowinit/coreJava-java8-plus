package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyDistinct {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("abc");
		list.add("x");
		list.add("y");

		List<String> distinctItems = list.stream().distinct().collect(Collectors.toList());
		distinctItems.forEach(System.out::println);
	}

}
