package com.java8.stream.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {

	public int sum(int a, int b); //not deeloped method

	default int multiplication() {

		return 2 * 5; //deeloped method
	}

}
