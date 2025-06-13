package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayListUsingEnumeration {
	
	ArrayList<String> al = new ArrayList<String>(Arrays.asList("w","e","l","c","o","m","e"));
	
	public void m1() {
		Enumeration<String> e =Collections.enumeration(al);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	
	public static void main(String[] args) {
		ArrayListUsingEnumeration arrayListUsingEnumeration = new ArrayListUsingEnumeration();
		arrayListUsingEnumeration.m1();
		
	}

}


