package com.collections.HashSet;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("x");
		hs.add("y");	
		hs.add("z");
		
		String [] s =hs.toArray(new String[hs.size()]);
		for(String se : s) {
			System.out.println(se);
		}
	}

}
