package com.myPolymorphisam.methodOverriding;

public class MyMethodOverriding {
	
	public static void main(String[] args) {
		B b = new A();
		b.m1();
		b.m1(3);
		
		A a = new A();
		a.m1(2, 3); // compile time A class, run time A class, compile time poly
		
		B b1 = new A();
		b1.m1(2, 3); //// compile time B class, run time A class, run time poly
		
		
	}

}
