package com.myAccessModifiers.package1;

public class Class1 {

	private void m1() {
		// TODO Auto-generated method stub
		System.out.println("with in class only, y bcz priate");
	}

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		class1.m1();
		
		Class2 class2 = new Class2();
		class2.m1();
	}

}
