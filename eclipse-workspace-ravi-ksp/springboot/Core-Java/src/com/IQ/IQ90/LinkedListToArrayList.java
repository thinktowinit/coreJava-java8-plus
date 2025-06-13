package com.IQ.IQ90;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);

		ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
		System.out.println("Using formula adderd  in to another list = " + arrayList.size());

		ArrayList<Integer> arrayList2 = new ArrayList();
		System.out.println(arrayList2.size());

		// with out java formula
		linkedList.forEach(element -> {
			arrayList2.add(element);
		});
		System.out.println("without formula adderd  in to another list = " + arrayList2.size());

	}

}
