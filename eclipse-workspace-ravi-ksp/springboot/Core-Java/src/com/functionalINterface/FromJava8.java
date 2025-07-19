package com.functionalINterface;

public class FromJava8 {
		
		
		 public static void main(String[] args) {
			 
			 
		    MyFunctionalInterface greeting = () -> System.out.println("Hello from Java 8");
		        
		        greeting.sum();
		        
		        MyFunctionalInterfaceWithParams f = (a, b) -> a+b;
		        
		       System.out.println(f.sum(2, 3));
		    }
		        
		     //below is before java8   
		        
//		        MyFunctionalInterface greeting = new MyFunctionalInterface() {
//
//					@Override
//					public void sum() {
//						System.out.println("Hello from before Java 8!");
//					}
//					
//				};
//
//				greeting.sum();
		        
		        
		    }
	




