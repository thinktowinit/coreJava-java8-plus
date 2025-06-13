package com.collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "x");
		m.put(null, "y");
		m.put(2, null);
		m.put(3, null);

		System.out.println(m.size());

		Iterator<Entry<Integer, String>> it = m.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> se = it.next();
			System.out.println(se.getKey() + ", " + se.getValue());
		}

		System.out.println(m);

		System.out.println("           ");

		System.out.println("reading only keys from HashMap");
		
		System.out.println(m.keySet());

		Iterator<Entry<Integer, String>> itt = m.entrySet().iterator();
		while (itt.hasNext()) {
			Entry<Integer, String> see = itt.next();
			System.out.println(see.getKey());
		}

		System.out.println("           ");

		System.out.println("reading only values from HashMap");
		
		

		Iterator<Entry<Integer, String>> itt1 = m.entrySet().iterator();
		while (itt1.hasNext()) {
			Entry<Integer, String> see1 = itt1.next();
			System.out.println(see1.getValue());
		}

		System.out.println("           ");

		System.out.println("reading only keys from HashMap using for loop");

		for (Integer i : m.keySet()) {
			System.out.println("keys = " + i);
		}

		System.out.println("           ");

		System.out.println("reading only values from HashMap using for loop");

		for (String s : m.values()) {
			System.out.println("vlues = " + s);
		}
	}
}
