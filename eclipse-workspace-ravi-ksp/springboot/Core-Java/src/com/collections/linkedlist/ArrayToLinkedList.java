package com.collections.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		String [] s = {"b","h","e","e","m","a"};
		
		System.out.println("using java method");
		
		LinkedList<String> ll = new LinkedList<>(Arrays.asList(s));
		System.out.println(ll);
		
		System.out.println("using for loop");
		LinkedList<String> ll2 = new LinkedList<String>();
		
		for (int i = 0; i < s.length; i++) {
			ll2.add(s[i]);
		}
		
		System.out.println(ll2);
		
		//or we can display using for loop also as below//
		
		for (int i = 0; i <ll2.size(); i++) {
			System.out.println(ll2.get(i));
		}
	}
}
