package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11WriteStringAndReadString {

	public static void main(String[] args) {
		// Initializing file Path with some conditions
		
		Path filePath = Paths.get("C:\\Users\\think\\OneDrive\\Documents\\Back-end\\Java-8\\Java-11", "write-data2.txt");

		try {
			// Write content to file
			Files.writeString(filePath, "Writing into a file using Java 11 feature\n", StandardOpenOption.APPEND);

			System.out.println("writing in to file success");
			// Verify file content
			String dataFromFile = Files.readString(filePath);
			System.out.println("reading from file success");
			System.out.println(dataFromFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
