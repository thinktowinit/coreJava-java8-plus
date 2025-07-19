package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MyMethodReference {

	private static void getStringLength(String x) {
		System.out.println(x.length());
	}
	
	private void getStringLengthNonStatic(String x) {
		System.out.println(x.length());
	}

	public static void main(String[] args) {
		
		MyMethodReference myMethodReference= new MyMethodReference();

		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("abcgdrg");
		list.add("abcdggdfg");
		list.add("abtedhfghdfghc");
		
		//using lambda
	// list.stream().forEach(s -> MyMethodReference.getStringLength(s));

		// using method ref
		//2. Method reference to a static method of a class – Class::staticMethod
		list.stream().forEach(MyMethodReference::getStringLength);
		
		//1. Method reference to an instance method of an object – object::instanceMethod
		list.stream().forEach(myMethodReference::getStringLengthNonStatic);
		
		//3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
		list.stream().forEach(String::toUpperCase);
		
		//for parallel process
		list.stream().parallel().forEach(MyMethodReference::getStringLength);
		
		

		// using lambda expression ref
		list.stream().forEach(box -> MyMethodReference.getStringLength(box));

		// using basic
		for (String x : list) {
			MyMethodReference.getStringLength(x);
		}

	}

}
