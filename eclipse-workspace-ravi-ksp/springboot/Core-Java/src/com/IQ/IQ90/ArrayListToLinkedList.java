package com.IQ.IQ90;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
	
public static void main(String[] args) {
		
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		
		LinkedList<Integer> linkedList = new LinkedList<>(arrayList1);
		System.out.println("Using formula adderd  in to another list = "+linkedList.size());
		
		
		
		
		LinkedList<Integer> linkedList2 = new LinkedList<>();
		System.out.println(linkedList2.size());
		
		
		//with out java formula
		arrayList1.forEach(element -> {
			linkedList2.add(element);
		});
		System.out.println("without formula adderd  in to another list = "+linkedList2.size());
	}

}
