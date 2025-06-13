package com.exceptions;

public class MyClassNotFouindException {

	private void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		// new MyClassNotFouindException(); //1st way
		// 2nd way to create object
		Class.forName("com.exceptions.MyClassNotFouindException");//not use in project
		// should mention with package name
		System.out.println("============line1========================");

	}

}
