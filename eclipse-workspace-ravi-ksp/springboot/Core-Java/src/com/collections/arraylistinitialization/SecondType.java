package com.collections.arraylistinitialization;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondType {

	public static void main(String[] args) {
		ArrayList<Float> al = new ArrayList<Float>(Arrays.asList(2.5f,5.3f,6.8f,6.3f));
		System.out.println(al);
	}

}
