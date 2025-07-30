package com.java9;

import java.util.Map;

public class MyUnmodifibleMap {

	public static void main(String[] args) {
		Map<Integer, String> unmodifibleMap = 
				Map
				.of(2, "",
				    3,"",
				    4,"");
		System.out.println("immuatble map "+unmodifibleMap);
		unmodifibleMap.put(5, null); //not allowed any modifications
		//Exception in thread "main" java.lang.UnsupportedOperationException
		
	}

}
