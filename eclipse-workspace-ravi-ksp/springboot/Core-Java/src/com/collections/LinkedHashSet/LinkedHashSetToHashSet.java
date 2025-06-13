package com.collections.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetToHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();

		lhs.add("x");
		lhs.add("y");
		lhs.add("x");
		lhs.add("z");
		
		HashSet<String> hs = new HashSet<>(lhs);
		
		System.out.println(hs.size());
		
		System.out.println(hs);
	}

}
