package com.collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("b");
		ll.add("h");	
		ll.add("e");
		ll.add("e");
		ll.add("m");
		ll.add("a");
		
		System.out.println("using java method");
		
		ArrayList<String> al = new ArrayList<>(ll);
		System.out.println(al);
		
		System.out.println("using for loop");
		ArrayList<String> al2 = new ArrayList<>();
		
		for(String se : ll ) {
			al2.add(se);
		}
		
		for(String se1: al2) {
			System.out.println(se1);
		}
	}

}
