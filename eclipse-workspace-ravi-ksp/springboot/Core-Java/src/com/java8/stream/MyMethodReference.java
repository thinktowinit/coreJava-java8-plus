package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MyMethodReference {

	private static void getStringLength(String x) {
		System.out.println(x.length());

	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("abcgdrg");
		list.add("abcdggdfg");
		list.add("abtedhfghdfghc");

		// using method ref
		list.stream().forEach(MyMethodReference::getStringLength);

		// using lambda expression ref
		list.stream().forEach(box -> MyMethodReference.getStringLength(box));

		// using basic
		for (String x : list) {
			MyMethodReference.getStringLength(x);
		}

	}

}
