package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11WriteStringAndReadString {

	public static void main(String[] args) {
		// Initializing file Path with some conditions
		
		Path filePath = Paths.get("C:\\Users\\ADMIN\\Documents\\java11", "write-data2.txt");

		try {
			// Write content to file
			Files.writeString(filePath, "Writing in to a file using java11 feature", StandardOpenOption.APPEND);

			// Verify file content
			String content = Files.readString(filePath);

			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
