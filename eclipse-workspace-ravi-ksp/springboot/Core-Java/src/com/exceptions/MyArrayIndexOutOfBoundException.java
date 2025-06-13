package com.exceptions;

public class MyArrayIndexOutOfBoundException {

	static int[] h = { 1, 2, 3, 4 }; // index starts at 0, last index 3

	public static void main(String[] args) {
		System.out.println("================line1");
		System.out.println("================line2");
		System.out.println("================line3");

		try {
			int j = h[4]; //using index 4
			System.out.println(j);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("================line5");// even still error, I want to execute this
		System.out.println("================line6");
	}

}
