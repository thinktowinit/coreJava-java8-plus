package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingJava8 {

	ArrayList<String> al = new ArrayList<String>(Arrays.asList("b", "h", "e", "e", "m", "a"));

	public void m1() {
		al.forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingJava8 usingJava8 = new UsingJava8();
		usingJava8.m1();
	}

}
