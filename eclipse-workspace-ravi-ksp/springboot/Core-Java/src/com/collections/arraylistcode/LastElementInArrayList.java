package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElementInArrayList {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("w", "e", "l", "c", "o", "m", "e"));

		System.out.println(al1.get(al1.size() - 1));

		// 6)get Nth element from last in AL?
		// 6)get 4th element from last in AL?

		// 4th element= 3rd index
		// nth element = n-1 index

        //1st one from last, index = al1.size()-1
		// nth one from last, index = al1.size() - n

		System.out.println(al1.get(al1.size() - 4));
		// 6)get 5th element from last in AL?
		int k = 5;
		System.out.println(al1.get(al1.size() - k));
		// 7)get nth element from first in AL?
		// 5th
		int n = 5;
		System.out.println(al1.get(n - 1));

	}

}
