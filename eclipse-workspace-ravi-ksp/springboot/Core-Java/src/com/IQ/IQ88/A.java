package com.IQ.IQ88;

import java.util.ArrayList;

public class A {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
		
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(4);
		arrayList2.add(5);
		arrayList2.add(6);
		
		arrayList1.addAll(arrayList2);
		
		System.out.println(arrayList1);
		
		arrayList1.forEach(System.out::println);
		
	}

}
