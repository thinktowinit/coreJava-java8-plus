package com.collections.arraylistinitialization;

import java.util.ArrayList;

public class UsingAnonymousInnerClass {
	

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>() { 
			 {	
				add(2);
				add(4);
				add(6);
				add(8);
				
			}
			
			};
			System.out.println(al);
		
	}

}
