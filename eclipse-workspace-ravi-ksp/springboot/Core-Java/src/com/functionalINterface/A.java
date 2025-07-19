package com.functionalINterface;

public class A implements MyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonAnynomusInnerClass equalToAnynomusInnerClass = new NonAnynomusInnerClass();

		equalToAnynomusInnerClass.sum();

		A a = new A();
		a.sum();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("=======from class A");

	}

}
