package com.java11;

import java.nio.file.Files;
import java.nio.file.Path;

import com.collections.arraylistcode.MyDataBaseUtil;

public class Java11IsSameFile {

	public static void main(String[] args) {
		try {
			boolean isSameFile = Files.isSameFile(Path.of(MyDataBaseUtil.filePathFromStudentTableFromDb),
					Path.of(MyDataBaseUtil.filePatchFromTeacherTableFromDb));
			System.out.println(isSameFile);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
