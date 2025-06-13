package com.collections.linkedlist;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("x");
		ll.add("y");	
		ll.add("z");
		ll.add("a");
		
		System.out.println(ll.size());
		
		System.out.println(ll);
	}
	

}
