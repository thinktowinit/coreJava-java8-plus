package com.collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("x");
		al.add("y");	
		al.add("z");
		
		System.out.println("using java method");
		
		LinkedList<String> ll = new LinkedList<>(al);
		
		System.out.println(ll);
		
		System.out.println("using for loop");
		
		LinkedList<String> ll2 = new LinkedList<>();
		
		for(String se : al) {
			ll2.add(se);
		}
		for(String se1: ll2) {
			System.out.println(se1);
		}
	}
}
