package com.exceptions;

public class MyThrowsException {

	private void m1() throws ClassNotFoundException {

		// new MyClassNotFouindException(); //1st way
		// 2nd way to create object
		Class.forName("com.exceptions.MyClassNotFouindException222");// not use in project
		// should mention with package name
		System.out.println("============line1========================");

		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		MyThrowsException myThrowsException = new MyThrowsException();
		try {
			myThrowsException.m1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("============in catch block==================");
		}
		System.out.println("========================line2");

	}

	// exeption = //if error/unconditional exist

	// if class name exist
	// =====line1====
	// =====line2======

	// if class not not exist
//======in catch block========
	// ========================line2
}
