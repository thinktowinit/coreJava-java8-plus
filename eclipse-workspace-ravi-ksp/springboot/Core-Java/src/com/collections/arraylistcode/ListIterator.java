package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIterator {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("w", "e", "l", "c", "o", "m", "e"));
		System.out.println(al1.size());

		java.util.ListIterator<String> li = al1.listIterator(al1.size());
		System.out.println(li.hasPrevious());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
