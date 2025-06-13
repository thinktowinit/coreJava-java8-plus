package com.java11;

public class Java11StripTrailing {
	
	public static void main(String[] args) {

		String name = "Cyclone in chennai   ";

		System.out.println(name.length());

		String removedSpaceAfterOfString = name.stripTrailing();
		System.out.println(removedSpaceAfterOfString.length());

	}

}
