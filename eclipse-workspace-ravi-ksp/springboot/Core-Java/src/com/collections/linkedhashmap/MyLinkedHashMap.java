package com.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		lhm.put(25, "ravi");
		lhm.put(24, "ramu");
		lhm.put(26, "bheema");
		lhm.put(23, "siva");
		
		System.out.println(lhm.keySet());
		
		System.out.println(lhm.values());
		
		System.out.println(lhm.entrySet());
		
		for(Map.Entry se : lhm.entrySet()) {
			System.out.println(se.getKey()+ " " + se.getValue());
		}
		
		System.out.println(lhm);
		
		lhm.remove(26);
		System.out.println(lhm);
		
	}

}
