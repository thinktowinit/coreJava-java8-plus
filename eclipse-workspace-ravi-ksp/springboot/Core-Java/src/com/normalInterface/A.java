package com.normalInterface;

public class A implements I {

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("=====");
	}
	
	public static void main(String[] args) {
		I i = new A();
		i.sum();
		i.sub();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("===subtract");
	}
	

}
