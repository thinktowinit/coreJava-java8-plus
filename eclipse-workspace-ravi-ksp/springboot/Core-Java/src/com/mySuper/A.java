package com.mySuper;

public class A extends B {

	// super class B
	// sub class/present class A

	int x = 2;

	private void m2() {
		// TODO Auto-generated method stub
		System.out.println("this/present class methods calling = " + this.callingMethods());
		System.out.println("Super class methods calling= " + super.callingMethods());
	}

	public String callingMethods() {
		return "from present class";
	}

	public void callingVariables() {
		System.out.println("this/present class variable = " + this.x);
		System.out.println("Super class variable= " + super.x);

	}

	public static void main(String[] args) {
		A a = new A();
		a.callingVariables();
		System.out.println("============================");
		a.m2();
	}

}
