package com.FileWriteRead;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWrite {
	public static void main(String args[]) {

		writeStringInToFile();
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("C:\\Users\\ADMIN\\Documents\\Class-26\\forWriteData.txt");
			fout.write(65);

			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writeStringInToFile() {
		FileWriter fw = null;
		try {
			String str = "Sample data from  class";
			File newTextFile = new File("C:\\Users\\ADMIN\\Documents\\Class-26\\forWriteData2.txt");

			fw = new FileWriter(newTextFile);
			fw.write(str);//

			int k = 2 / 0; // arthemetic expetion
			System.out.println(k);
			fw.close();

		} catch (IOException iox) {
			// do stuff with exception
			iox.printStackTrace();
		} finally {
			try {
				System.out.println("==========finally");
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
