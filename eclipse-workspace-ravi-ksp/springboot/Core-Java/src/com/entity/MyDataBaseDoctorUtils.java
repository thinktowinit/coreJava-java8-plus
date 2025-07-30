package com.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyDataBaseDoctorUtils {

	public final static String filePathFromStudentTableFromDb = "C:\\Users\\ADMIN\\Documents\\java11\\folder-1\\write-data.txt";
	public final static String filePatchFromTeacherTableFromDb = "C:\\Users\\ADMIN\\Documents\\java11\\folder-1\\write-data.txt";

	public static List<Doctor> getListOfDoctors(List listBox) {
		// TODO Auto-generated method stub

		return createDoctorAndAddToList(listBox);

	}

	private static List<Doctor> createDoctorAndAddToList(List listBox) {

		Doctor doctor1 = new Doctor();
		doctor1.setName("TTW");
		doctor1.setId(1);
		doctor1.setAdmin(true);
		doctor1.setSalary(22000);
		doctor1.setGender("Male");
		doctor1.setBloodGroup("oNegative");
		doctor1.setBloodGroupPrice(2000);
		doctor1.setAge(22);

		Doctor doctor2 = new Doctor();
		doctor2.setId(2);
		doctor2.setName("TTW");
		doctor2.setGender("Male");
		doctor2.setSalary(3300);
		doctor2.setAdmin(false);
		doctor2.setAge(23);

		Doctor doctor3 = new Doctor();
		doctor3.setName("Naveen Reddy");
		doctor3.setGender("Male");
		doctor3.setId(3);
		doctor3.setSalary(6600);
		doctor3.setAdmin(true);
		doctor3.setBloodGroup("oPossitie");
		doctor3.setBloodGroupPrice(2000);

		Doctor doctor4 = new Doctor();
		doctor4.setName("Abi"); // 7
		doctor4.setSalary(990);
		doctor4.setBloodGroupPrice(990);
		doctor4.setBloodGroup("oNegative");
		doctor4.setGender("Female");
		doctor4.setAge(25);
		doctor4.setId(4);
		doctor4.setAdmin(true);
		Doctor doctor5 = new Doctor();
		doctor5.setId(5);
		doctor5.setName("Nagesh Reddy5");
		doctor5.setGender("Male");
		doctor5.setSalary(6000);
		doctor5.setAdmin(true);

		Doctor doctor61 = new Doctor();
		doctor61.setId(5);
		doctor61.setName("Nagesh Reddy5");
		doctor61.setGender("Male");
		doctor61.setSalary(6000);
		doctor61.setAdmin(true);

		listBox.add(doctor3);
		listBox.add(doctor2);
		listBox.add(doctor1);
		listBox.add(doctor4);
		listBox.add(doctor5);
		listBox.add(doctor61);

		Doctor doctor6 = new Doctor();
		doctor6.setId(5);
		doctor6.setName("Abc Reddy5");
		doctor6.setGender("Transgender");
		doctor6.setSalary(6000);
		doctor6.setAdmin(true);
		doctor6.setAge(15);

		listBox.add(doctor6);

		return listBox;
	}

	public static Set<Doctor> getSetOfDoctor(List listBox) {
		Set<Doctor> setOfEmployees = new HashSet<>();
		List list = createDoctorAndAddToList(listBox); // 4
		setOfEmployees.addAll(list); // 4
		return setOfEmployees;

	}

	public static Map<Integer, String> getSampleMapData() {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();

		map.put(122, "Rajesh122");
		map.put(222, "Rajesh");
		map.put(221, "Rajesh");
		map.put(null, "Rajesh");
		map.put(null, "Rajesh 2nd null key");
		map.put(1234, null);
		map.put(12345666, null);
		map.put(14, "ramu");
		map.put(27, "somu");
		map.put(15, "ram");
		map.put(68, null);
		map.put(33, "ramu");
		map.put(14, "ag");
		map.put(46, "ah");
		map.put(16, "ha");
		map.put(31, "ykj");
		map.put(25, "sgah");
		map.put(11, "dhh");
		map.put(30, "hello");
		map.put(17, "well");
		map.put(2, "well");
		map.put(8, "well");
		return map;

	}

	public static Map<Integer, String> getSampleMapDataWithOutNull() {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();

		map.put(122, "Rajesh122");
		map.put(222, "Rajesh");
		map.put(221, "Rajesh");
		map.put(14, "ramu");
		map.put(27, "somu");
		map.put(15, "ram");
		map.put(68, null);
		map.put(33, "ramu");
		map.put(14, "ag");
		map.put(46, "ah");
		map.put(16, "ha");
		map.put(31, "ykj");
		map.put(25, "sgah");
		map.put(11, "dhh");
		map.put(30, "hello");
		map.put(17, "well");
		map.put(2, "well");
		map.put(8, "well");
		return map;

	}

	public static Map<Integer, String> getTreeMap() {
		// TODO Auto-generated method stub
		Map<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(122, "Rajesh122");
		treeMap.put(222, "Rajesh");
		treeMap.put(221, "Rajesh");
		treeMap.put(14, "ramu");
		treeMap.put(27, "somu");
		treeMap.put(15, "ram");
		treeMap.put(33, "ramu");
		treeMap.put(14, "ag");
		treeMap.put(46, "ah");
		treeMap.put(16, "ha");
		treeMap.put(31, "ykj");
		treeMap.put(25, "sgah");
		treeMap.put(11, "dhh");
		treeMap.put(30, "hello");
		treeMap.put(17, "well");
		treeMap.put(2, "well");
		treeMap.put(8, "well");

		return treeMap;

	}

	public static Map<Integer, String> getHashMap() {
		// TODO Auto-generated method stub
		Map<Integer, String> hashMap = new HashMap<>();

		hashMap.put(122, "Rajesh122");
		hashMap.put(222, "Rajesh");
		hashMap.put(221, "Rajesh");
		hashMap.put(14, "ramu");
		hashMap.put(27, "somu");
		hashMap.put(15, "Bam");
		hashMap.put(12345, null);
		hashMap.put(null, null);
		hashMap.put(33, "ramu");
		hashMap.put(14, "ag");
		hashMap.put(46, "ah");
		hashMap.put(16, "ha");
		hashMap.put(31, "ykj");
		hashMap.put(25, "sgah");
		hashMap.put(11, "dhh");
		hashMap.put(30, "hello");
		hashMap.put(17, "well");
		hashMap.put(2, "well");
		hashMap.put(8, "well");

		return hashMap;

	}

	public static List<String> getListOfStrings() {

		return new ArrayList<>(Arrays.asList("abc", "ab", null, "a"));

	}

}
