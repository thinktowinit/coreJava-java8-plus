package com.collections.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetToLinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("x");	
		hs.add("z");
		hs.add("y");
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(hs);
		System.out.println(lhs);
	}

}
