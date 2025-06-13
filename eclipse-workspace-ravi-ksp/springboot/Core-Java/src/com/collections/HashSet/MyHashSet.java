package com.collections.HashSet;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("h");
		hs.add("x");	
		hs.add("a");
		hs.add("y");
		
		System.out.println(hs.size()); // HS does not allow duplicates
		
		System.out.println(hs);
		
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(75);
		hs1.add(43);
		hs1.add(89);
		hs1.add(26);
		hs1.add(90);
		System.out.println(hs1); // Hash Set does not maintain any insertion order
	}

}
