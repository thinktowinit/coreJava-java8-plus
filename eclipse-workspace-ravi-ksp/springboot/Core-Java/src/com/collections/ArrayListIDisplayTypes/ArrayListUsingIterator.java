package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListUsingIterator {

	ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(6, 7, 8, 9, 10, 6));

	public void m1() {
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public static void main(String[] args) {
		ArrayListUsingIterator arrayListUsingIterator = new ArrayListUsingIterator();
		arrayListUsingIterator.m1();
	}

}
