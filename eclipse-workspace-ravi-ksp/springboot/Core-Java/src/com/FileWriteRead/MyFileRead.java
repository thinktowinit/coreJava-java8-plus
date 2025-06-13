package com.FileWriteRead;

import java.io.FileInputStream;
import java.io.IOException;

public class MyFileRead {
	public static void main(String args[]) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("C:\\Users\\ADMIN\\Documents\\Class-26\\forWriteData2.txt");

			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//in real time we can create a file send that file to mail with attachment
}
