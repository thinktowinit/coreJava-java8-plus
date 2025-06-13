package com.collections.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToHashSet {

	public static void main(String[] args) {
		String [] s = {"b","h","e","e","m","a"};
		
		
		Set<String> hs = new HashSet<String>();
		Collections.addAll(hs, s);
		
		System.out.println(hs);
		
		// using tree set//
		
		TreeSet<String> ts = new TreeSet<>(hs);
		System.out.println(ts);
	}
}
