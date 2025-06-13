package com.java11;

public class Java11StripLeading {

	public static void main(String[] args) {

		String name = "   Cyclone in chennai";

		System.out.println(name.length());

		String removedSpaceBeforeOfString = name.stripLeading();
		System.out.println(removedSpaceBeforeOfString.length());

	}

}
