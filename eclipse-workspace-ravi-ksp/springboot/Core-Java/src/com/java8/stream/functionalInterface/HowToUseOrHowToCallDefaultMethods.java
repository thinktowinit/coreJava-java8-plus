package com.java8.stream.functionalInterface;

public class HowToUseOrHowToCallDefaultMethods implements MyFunctionalInterface {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	int x = 2;

	public static void main(String[] args) {

		HowToUseOrHowToCallDefaultMethods useFunctionalInterface = new HowToUseOrHowToCallDefaultMethods();

		useFunctionalInterface.m2();
		useFunctionalInterface.sum(2,3);

	}

	private void m2() {
		// TODO Auto-generated method stub
		// super is indicate to super class object, so not allowed in static methods.
		MyFunctionalInterface.super.multiplication();
		System.out.println(this.x);

		// this key word indicates current class object

	}

}
