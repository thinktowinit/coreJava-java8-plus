package com.exceptions;

public class MyStringIndexOutOfBoundException {

	static String y = "abc"; // "123"; = 123 //last index of character 2

	public static void main(String[] args) {
		System.out.println("================line1");
		System.out.println("================line2");
		System.out.println("================line3");

		try {
			char c1 = y.charAt(3); //usig 3 index
			System.out.println(c1);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("================line5");// even still error, I want to execute this
		System.out.println("================line6");
	}

}
