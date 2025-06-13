package com.IQ.IQ74and75and76and77;

public class SubClass extends MySuperClass {
	
	//74 answer
	//case-1
	//if super class have throws exception then 
	//sub class method throws child exception or same type exception or not throws any exception, but not parent type exception
	//not allowed super type exception in sub class
	
	
	////if super class not have throws exception then 
	//sub class should not throws checked exception
	
	//below error, bcz sub class method throws parent type exception of super class method throws
//	@Override
//	public void m2() throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//	
	
	public void m3() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void m1() throws Exception {
		// TODO Auto-generated method stub
      
	}
	
	
	public static void main(String[] args) {
		
	}

}
