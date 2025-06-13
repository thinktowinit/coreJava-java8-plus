package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MyToArray {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("abcgdrg");
		list.add("abcdggdfg");
		list.add("abtedhfghdfghc");

		Object[] array = list.stream().toArray();
		System.out.println(array.length);
	}

}
