package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MyStringUtilsCollectionUtils {

	public static void main(String[] args) {

	}

	private void m1() {
		// TODO Auto-generated method stub

		String x = null;

		if (x != null && !x.equals("")) {
//valid string value
		}

	}
	
	//import org.apache.commons.lang3.StringUtils;
	private void m2() {
		  String s1 = null;
	        String s2 = "";
	        String s3 = "   ";  
	        String s4 = "Hello";

	        System.out.println("Using isEmpty():");
//	        System.out.println("s1: " + StringUtils.isEmpty(s1)); // true
//	        System.out.println("s2: " + StringUtils.isEmpty(s2)); // true
//	        System.out.println("s3: " + StringUtils.isEmpty(s3)); // false
//	        System.out.println("s4: " + StringUtils.isEmpty(s4)); // false

	        System.out.println("\nUsing isBlank():");
//	        System.out.println("s1: " + StringUtils.isBlank(s1)); // true
//	        System.out.println("s2: " + StringUtils.isBlank(s2)); // true
//	        System.out.println("s3: " + StringUtils.isBlank(s3)); // true
//	        System.out.println("s4: " + StringUtils.isBlank(s4)); // false

	}
	
	private void myStringUtlsNotBlank() {
		  String s1 = null;
	        String s2 = "";
	        String s3 = "   ";
	        String s4 = "Hello";

//	        System.out.println("s1 is not blank? " + StringUtils.isNotBlank(s1)); // false
//	        System.out.println("s2 is not blank? " + StringUtils.isNotBlank(s2)); // false
//	        System.out.println("s3 is not blank? " + StringUtils.isNotBlank(s3)); // false
//	        System.out.println("s4 is not blank? " + StringUtils.isNotBlank(s4)); // true

	}
	
	
	private void m3() {
		// TODO Auto-generated method stub
		
		  List<String> list1 = null;
	        List<String> list2 = new ArrayList<>();
	        List<String> list3 = List.of("A", "B");

	       if(list1 != null && list1.size() > 0) {
	    	   
	    	   
	       }

	}
	
	//import org.apache.commons.collections4.CollectionUtils;
	private void m4() {
		// TODO Auto-generated method stub
		
		  List<String> list1 = null;
	        List<String> list2 = new ArrayList<>();
	        List<String> list3 = List.of("A", "B");
	        
//	        if(!CollectionUtils.isEmpty(list1)) {
//		    	   
//		    	 //list have data  
//		       }
	        
//	        if (CollectionUtils.isNotEmpty(list)) {
//	            // do something
//	        }

//	        System.out.println("list1 is empty? " + CollectionUtils.isEmpty(list1)); // true
//	        System.out.println("list2 is empty? " + CollectionUtils.isEmpty(list2)); // true
//	        System.out.println("list3 is empty? " + CollectionUtils.isEmpty(list3)); // false

	}

}
