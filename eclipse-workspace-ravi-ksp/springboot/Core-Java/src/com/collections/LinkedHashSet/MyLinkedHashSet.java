package com.collections.LinkedHashSet;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("x");
		lhs.add("y");
		lhs.add("x");
		lhs.add("z");

		System.out.println(lhs.size()); // LHS does not allows duplicates

		for (String se : lhs) {
			System.out.println(se);
		}
	}

}
