package com.exceptions;

public class MyNullPointerExceptionWithFinally {

	public static void main(String[] args) {
		String x = null; //case -1
		x = "null"; //case-2
		System.out.println("================line1");
		System.out.println("================line2");
		System.out.println("================line3");

		try {
			int l = x.length();
			System.out.println(l);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("=========catch block=======line5");// even still error, I want to execute this
			System.out.println("=====catch block===========line6");
		}finally {
			try {
				System.out.println("mandatory logic, finally block executed");
			} catch (RuntimeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
