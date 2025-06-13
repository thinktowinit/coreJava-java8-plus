package com.exceptions;

public class MyArthemeticException {

	static int x = 0;
	static int y = 10;

	public static void main(String[] args) {

		System.out.println("================line1");
		System.out.println("================line2");
		System.out.println("================line3");
		try {
			int k = x / y; // 0;
			System.out.println(k);
			int m = y / x;
			System.out.println(m);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("=============in catch block===========================");
			e.printStackTrace();
			System.out.println("=======================================");
			System.out.println(e.getMessage());
			System.out.println("===============catch block close========================");
		}

		
		System.out.println("================line5");// even still error, I want to execute this
		System.out.println("================line6");
	}

}
