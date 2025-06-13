package com.java8.stream.functionalInterface;

public class MainUseOfFunctonalInterface {

	public static void main(String[] args) {

		// any method is call by using class or object, to avoid this dependency, this
		// is object oriented.
		// we can choose function interface,to avoid object oriented programing and we
		// can use functional programing

//now target is develop abstarct methods which is in functional interface and 
		// we want to call/use without class or object

		MyFunctionalInterface myFunctionalInterface = (int x, int y) -> {
			int total = x + y;
			System.out.println(total);
			return total;
		};
		
		//I i = new B();
		//i.m1(); //calling using interface
		
		myFunctionalInterface.sum(2, 3); //

	}

}
