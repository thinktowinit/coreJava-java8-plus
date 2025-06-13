 package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;

public class FirstMethod {
	ArrayList<String> al = new ArrayList<String> ();
	public void m1 () {
		
		 al.add("b");
		 al.add("h");
		 al.add("e");
		 al.add("e");
		 al.add("m");
		 al.add("a");
		 System.out.println(al);
	}

	public static void main(String[] args) {
		FirstMethod firstMethod = new FirstMethod ();
		firstMethod.m1();
		 
	}

}
