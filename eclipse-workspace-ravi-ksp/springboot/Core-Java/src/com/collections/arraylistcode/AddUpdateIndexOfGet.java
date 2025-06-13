package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;

public class AddUpdateIndexOfGet {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,9,3,15,12));
		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList("w","e","l","c","o","m","e"));
		
		System.out.println(al.get(3));
		
		System.out.println(al.add(14));
		
		
		 al.add(2, 7);
		System.out.println(al);
		
		al1.add(0, "b");
		System.out.println(al1);
		
		al1.set(0, "c");
     	System.out.println(al1);
     	
     	System.out.println(al1.indexOf("e"));
     	
     	System.out.println(al1.lastIndexOf("e"));
     	
		
	}

}
