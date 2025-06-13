package com.myAccessModifiers.package2;

public class Class3 {

	
	protected void m1() {
		// TODO Auto-generated method stub
		System.out.println("use inside package only, outside package through inheritance");
	}
	
	protected void m2() {
		// TODO Auto-generated method stub
		System.out.println("use inside package only, outside package through inheritance");
	}

	public static void main(String[] args) {
		Class3 class3 = new Class3();
		class3.m1();
		
		Class4 class4 = new Class4();
		class4.m4();
	}
	
}
