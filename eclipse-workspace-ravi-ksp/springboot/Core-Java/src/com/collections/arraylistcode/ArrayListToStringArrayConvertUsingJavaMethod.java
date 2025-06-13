package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArrayConvertUsingJavaMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("w", "e", "l", "c", "o", "m", "e"));

		String[] s = al.toArray(new String[al.size()]);

		for (String s1 : s) {
			System.out.println(s1);
		}
	}

}
