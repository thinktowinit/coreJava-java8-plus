package com.IQ.IQ74and75and76and77;

public class Question77 {
	
	
	public static void main(String[] args) {
		m1();
	}
	private static void m1() {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			System.out.println("try block");
			System.exit(1); //finally also not executed
			//for 79 //first child exception, then after parent exception
		}catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//for mandatory logic
			System.out.println("executed all times with exception or without exception");
		}

	}
	
	

}
