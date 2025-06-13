package com.collections.ArrayListIDisplayTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingForEach {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("w", "e", "l", "c", "o", "m", "e"));

		al.forEach(t -> System.out.println(t));

		// another method

		al.forEach(t -> {
			if (t.equals("w")) {
				System.out.println(t);
			}
		}

		);
	}

}
