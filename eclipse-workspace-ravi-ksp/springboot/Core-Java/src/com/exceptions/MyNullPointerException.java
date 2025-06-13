package com.exceptions;

public class MyNullPointerException {

	public static void main(String[] args) {
		String x = null;
		System.out.println("================line1");
		System.out.println("================line2");
		System.out.println("================line3");

		try {
			int l = x.length();
			System.out.println(l);

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("================line5");// even still error, I want to execute this
		System.out.println("================line6");
	}

}
