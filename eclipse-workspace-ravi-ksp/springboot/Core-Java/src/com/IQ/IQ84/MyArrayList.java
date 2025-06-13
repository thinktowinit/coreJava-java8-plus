package com.IQ.IQ84;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyArrayList {
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list  = new ArrayList<>();
		//I i = new A();
		
		
		//create arraylist and add elemets
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(6);
		
		//suppose I have basic array, have 1,3,6 elements
		ArrayList<Integer> arrayListFromArray = new ArrayList<>(Arrays.asList(1,3,6));
		
		//or
		Integer[] basicArray = {1,3,6};
		ArrayList<Integer> arrayListFromArray2 = new ArrayList<>(Arrays.asList(basicArray));
		
		//if we want to add same value  n times, example 10 times here
		
		ArrayList<String> listUsingCopies = new ArrayList<>(Collections.nCopies(10, "Java"));
		
		
		System.out.println("from anonymous inner class = "+NAMES);
		System.out.println(listUsingCopies);
		System.out.println(listUsingCopies.size());
		
		
		
	
		
		
		
	}
	
	//method - 3
	private static final List<String> NAMES = new ArrayList() {{
        add("John");
        
    }};

    
    //
}
