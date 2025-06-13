package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWhileLoop {
	
	ArrayList<String> al = new ArrayList<String>(Arrays.asList("j","a","v","a"));
	
	public void m1() {
		int k=0;
		while (k<al.size()) {
			System.out.println(al.get(k));
			k++;
		}
	}

	public static void main(String[] args) {
		ArrayListWhileLoop arrayListWhileLoop = new ArrayListWhileLoop();
		arrayListWhileLoop.m1();
	}

}
