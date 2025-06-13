package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayToArrayListConvertion {

	public static void main(String[] args) {
		String [] s = {"w","e","l","c","o","m","e"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(al);
		
	}

}
