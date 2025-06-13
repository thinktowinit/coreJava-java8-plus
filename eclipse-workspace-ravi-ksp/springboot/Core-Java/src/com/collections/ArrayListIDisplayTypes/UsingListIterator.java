package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class UsingListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println("=====array list in forward direction");
		ListIterator<Integer> li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("=====array list in reverse direction");
		ListIterator<Integer> lit = al.listIterator(al.size());
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
