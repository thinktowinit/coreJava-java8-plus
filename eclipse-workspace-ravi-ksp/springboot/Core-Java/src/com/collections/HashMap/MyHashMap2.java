package com.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap2 {
//requirement is create student names with roll numbers
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		
		map.put(122, "Rajesh122"); 
		map.put(222, "Rajesh"); 
		map.put(221, "Rajesh");
		map.put(null, "Rajesh");
		map.put(1234, null);
		map.put(12345666, null);
		
		
		//key roll number, value student name.
		
		//1233, "Rajesh"
		//3456, "Rajesh"
		
		System.out.println(map.size());
		System.out.println(map.get(122));
		System.out.println(map.get(1222));
		System.out.println(map.get(12345666));
		

	}

}
