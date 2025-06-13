package com.exceptions;

public class MyNumberFormatException {

	static String y = "abc"; // "123"; = 123

	public static void main(String[] args) {
		System.out.println("================line1");
		System.out.println("================line2");
		System.out.println("================line3");

		try {
			int c = Integer.parseInt(y); // for conert string to interger.
			System.out.println(c);

		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("================line5");// even still error, I want to execute this
		System.out.println("================line6");
	}

}
