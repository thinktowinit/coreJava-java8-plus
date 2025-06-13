package com.myAccessModifiers.package2;

import com.myAccessModifiers.package1.Class2;

public class Class4 {

	void m4() {
		System.out.println("with in packahe only, not outside package, y bcz default method");
	}

	public static void main(String[] args) {
		Class2 class2 = new Class2();
		class2.m1();

		Class3 class3 = new Class3();
		class3.m1();
	}

}
