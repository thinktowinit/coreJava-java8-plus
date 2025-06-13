package com.autoboxingUnboxing;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer price = new Integer(55); //
		int x = price;
		//above is unboxing
		System.out.println(x);
		
		
		//below is autoboxing
		int y=10;
		Integer k = y;
		System.out.println(k);

	}

}
