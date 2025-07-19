package com.functionalINterface;

//before java 8,  how to DEVELOP functional interface abstract method
public class BeforeJava8 {

	public static void main(String[] args) {

		// anynomus class
		// You're creating an anonymous inner class that implements the interface
		MyFunctionalInterface greeting = new MyFunctionalInterface() {

			@Override
			public void sum() {
				System.out.println("Hello from before Java 8!");
			}
			
		};

		greeting.sum();

	}

}
