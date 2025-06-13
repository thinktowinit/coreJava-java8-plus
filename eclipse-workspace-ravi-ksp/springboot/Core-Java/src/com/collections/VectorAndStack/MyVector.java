package com.collections.VectorAndStack;

import java.util.Vector;

public class MyVector {

	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		v.add("x");
		v.add("y");
		v.add("x");
		v.add("z");
		
		System.out.println(v.size());
		
		System.out.println(v);
		
		v.setElementAt("BB", 2);
		System.out.println(v);
	}
}
