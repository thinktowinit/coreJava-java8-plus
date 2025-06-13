package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoArrayLists {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>(
				Arrays.asList("w", "e", "l", "c", "o", "m", "e", " ", "to", "java"));

		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList("c", "to", "java"));

		ArrayList<String> ea = new ArrayList<String>();

		for (String t : al1) { //t=w
			String s = al2.contains(t) ? t+"-yes" : t+"-no";   
			ea.add(s);  //no no no yes no no
		}

		System.out.println(ea);
		
	}

}
