package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToStringArrayConvertUsingForLoop {

	public static void main(String[] args) {
		
		String[] names = {"A", "B", "C"};
		
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(names));
		
		List<String> listOfNames2 = Arrays.asList(names);
		
		//above code for formulas only
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("w", "e", "l", "c", "o", "m", "e"));
		String[] s = new String[al.size()];

		for (int i = 0; i < al.size(); i++) {
			s[i] = al.get(i);
		}
		
		for (int k = 0; k < s.length; k++) {
			System.out.println(s[k]);
		}

	}
}
