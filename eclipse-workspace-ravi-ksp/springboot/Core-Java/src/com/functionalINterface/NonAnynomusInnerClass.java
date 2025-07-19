package com.functionalINterface;

//This is Non anonymous inner class example here, before java 8
public class NonAnynomusInnerClass implements MyFunctionalInterface {

	@Override
	public void sum() {
		System.out.println("NonAnynomusInnerClass====Hello from before Java 8!");		
	}
	
	public static void main(String[] args) {
		
		NonAnynomusInnerClass equalToAnynomusInnerClass= new NonAnynomusInnerClass();
		
		equalToAnynomusInnerClass.sum();
	}

}





//I greeting = new I() {
//    @Override
//    public void sum() {
//        System.out.println("Hello from before Java 8!");
//    }
//};
//
//greeting.sum();
