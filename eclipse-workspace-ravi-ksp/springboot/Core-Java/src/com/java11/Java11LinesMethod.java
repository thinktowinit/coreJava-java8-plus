package com.java11;

import java.util.List;
import java.util.stream.Collectors;

public class Java11LinesMethod {
	public static void main(String args[]) {
		
		//This method is to return a collection of strings that are divided by line terminators.
		String str = "Geeks\nFor\nGeeks\nGeeks\nFor\nGeeks";
		List<String> listOfStrings = str.lines().collect(Collectors.toList());
		System.out.println(str.lines().collect(Collectors.toList()));
	}
}
