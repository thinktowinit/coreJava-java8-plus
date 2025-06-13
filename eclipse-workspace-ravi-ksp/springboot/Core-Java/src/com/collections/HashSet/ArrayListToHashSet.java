package com.collections.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashSet {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("x");
		al.add("y");	
		al.add("z");
		
		HashSet<String> hs = new HashSet<>(al);
		System.out.println(hs);
		
	}

}
