package com.java11;

public class Java11Strip {

	public static void main(String[] args) {

		String name = "   Cyclone in chennai   ";

		System.out.println(name.length());

		String removedSpaceBeforeAndAfterOfString = name.strip();
		System.out.println(removedSpaceBeforeAndAfterOfString.length());

	}

}
