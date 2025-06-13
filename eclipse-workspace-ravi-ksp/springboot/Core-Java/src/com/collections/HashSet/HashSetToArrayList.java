package com.collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("x");
		hs.add("y");	
		hs.add("z");
		
		ArrayList<String> al = new ArrayList<>(hs);
		System.out.println(al);
	}

}
