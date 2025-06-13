package com.collections.arraylistcode;

import java.util.ArrayList;

public class StringArrayToArrayListConvertionWithForLoop {

	public static void main(String[] args) {
		
		String[] s = { "w", "e", "l", "c", "o", "m", "e" };

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < s.length; i++) {
			al.add(s[i]);
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// or

		System.out.println(al);
	}

}
