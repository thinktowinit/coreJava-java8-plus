package com.myAccessModifiers.package1;

import com.myAccessModifiers.package2.Class3;

public class Class2 extends Class3 {

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("use anywhere, y bcz public");
	}

	public static void main(String[] args) {
		Class2 class2 = new Class2();
		class2.m1();
		class2.m2();
	}

}
