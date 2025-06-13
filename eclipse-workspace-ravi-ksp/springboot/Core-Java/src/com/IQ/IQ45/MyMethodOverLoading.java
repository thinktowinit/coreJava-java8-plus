package com.IQ.IQ45;

public class MyMethodOverLoading {

	
	private void m1() {
		// TODO Auto-generated method stub
System.out.println("zero params");
	}
	
	private void m1(int x) {
		// TODO Auto-generated method stub
		System.out.println("single params, int param");
		String y = x+"";
		System.out.println("gien interget = "+x+", length = "+y.length());
	}
	////different type of parametrs
	private void m1(String x) {
		// TODO Auto-generated method stub
		System.out.println("single params, String param");
		if(x != null) {
		System.out.println("given string is = "+x+", string length = "+x.length());
		}else{
			System.out.println("given string is = "+x+", string length is zero");
		}

	}
	//different number of parameters
	private void m1(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("2 params, int, int param");

	}
	
	private void m1(String x, int y) {
		// TODO Auto-generated method stub
		System.out.println("2 params, string, int param");

	}
	//different order of parameters
	private void m1(int x, String y) {
		// TODO Auto-generated method stub
		System.out.println("2 params, int, String param");
	}
	
	//method name same
	//different number of parameters
	//different type of parametrs
	//different order of parameters  
	//in same calss
	
	
	public static void main(String[] args) {
		MyMethodOverLoading myMethodOverLoading = new MyMethodOverLoading();
		myMethodOverLoading.m1();
		myMethodOverLoading.m1(1234);
		//myMethodOverLoading.m1("2  ");
		myMethodOverLoading.m1("1234"); //4 size
		myMethodOverLoading.m1(2, 3);
		myMethodOverLoading.m1(2, "3");
		myMethodOverLoading.m1("3", 2);
	}
}


