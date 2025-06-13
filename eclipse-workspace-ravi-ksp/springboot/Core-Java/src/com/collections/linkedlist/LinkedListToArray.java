package com.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("b");
		ll.add("h");	
		ll.add("e");
		ll.add("e");
		ll.add("m");
		ll.add("a");
		System.out.println("using java method");
		String [] s = ll.toArray(new String[ll.size()]);
		for(String se : s) {
			System.out.println(se);
		}
		
		System.out.println("using for loop");
		String [] t = new String [ll.size()] ;
		for (int i = 0; i < s.length; i++) {
			t[i]=ll.get(i);
		}
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		}
	}


