package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A {
	
	public void m1() {
		System.out.println("array list");
	}
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();
		
		Map<Integer, String> map = new HashMap<>();
		
		List<String> aList = new ArrayList<String>();
		
		System.out.println(aList.size());
		System.out.println(aList.isEmpty());
		
		aList.add("a");
		System.out.println(aList.size());
		
		System.out.println(aList.isEmpty());
		
		aList.add("a");                       // it will allow duplicates
		System.out.println(aList.size());
		
		aList.remove("a");                        
		System.out.println(aList.size()); 
		
		aList.add("a1");
		aList.add("1");
		System.out.println(aList.size());
		
		aList.add(1,"a");
		
		System.out.println(aList);
		
		
		
	}

}
