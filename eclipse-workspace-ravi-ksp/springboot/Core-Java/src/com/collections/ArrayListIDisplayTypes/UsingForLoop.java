package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingForLoop {
	ArrayList<String> al = new ArrayList<String> (Arrays.asList("x","y","z","bheema"));
	ArrayList<Integer> al1 = new ArrayList<Integer> (Arrays.asList(1,2,3,4,5,6));
	public void m1() {
		for (int i=0; i<al.size(); i++ ) {
			System.out.println(al.get(i));
		}
	}
		public void m2() {
			for(Integer k : al1) {
			System.out.println(k);
			} 
	}

	public static void main(String[] args) {
UsingForLoop usingForLoop = new UsingForLoop();
usingForLoop.m1();
usingForLoop.m2();
		
	}

}
