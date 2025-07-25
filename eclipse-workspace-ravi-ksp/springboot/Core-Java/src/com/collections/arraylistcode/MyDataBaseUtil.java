package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.employee.Employee;

public class MyDataBaseUtil {

	public final static String filePathFromStudentTableFromDb = "C:\\Users\\ADMIN\\Documents\\java11\\folder-1\\write-data.txt";
	public final static String filePatchFromTeacherTableFromDb = "C:\\Users\\ADMIN\\Documents\\java11\\folder-1\\write-data.txt";

	public static List<Employee> getListOfEmployees(List listBox) {
		// TODO Auto-generated method stub

		return createEmployeeAndAddToList(listBox);

	}

	private static List<Employee> createEmployeeAndAddToList(List listBox) {

		Employee employee1 = new Employee();
		employee1.setName("TTW");
		employee1.setId(1);
		employee1.setAdmin(true);
		employee1.setSalary(22000);
		employee1.setGender("Male");
		employee1.setBloodGroup("oNegative");
		employee1.setBloodGroupPrice(2000);
		employee1.setAge(22);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("TTW");
		employee2.setGender("Male");
		employee2.setSalary(3300);
		employee2.setAdmin(false);
		employee2.setAge(23);

		Employee employee3 = new Employee();
		employee3.setName("Naveen Reddy");
		employee3.setGender("Male");
		employee3.setId(3);
		employee3.setSalary(6600);
		employee3.setAdmin(true);
		employee3.setBloodGroup("oPossitie");
		employee3.setBloodGroupPrice(2000);

		Employee employee4 = new Employee();
		employee4.setName("Abi"); // 7
		employee4.setSalary(990);
		employee4.setBloodGroupPrice(990);
		employee4.setBloodGroup("oNegative");
		employee4.setGender("Female");
		employee4.setAge(25);
		employee4.setId(4);
		employee4.setAdmin(true);
		Employee employee5 = new Employee();
		employee5.setId(5);
		employee5.setName("Nagesh Reddy5");
		employee5.setGender("Male");
		employee5.setSalary(6000);
		employee5.setAdmin(true);
		
		
		Employee employee61 = new Employee();
		employee61.setId(5);
		//employee6.setName("Nagesh Reddy5");
		employee61.setGender("Male");
		employee61.setSalary(6000);
		employee61.setAdmin(true);

		listBox.add(employee3);
		listBox.add(employee2);
		listBox.add(employee1);
		listBox.add(employee4);
		listBox.add(employee5);
		listBox.add(employee61);
		
		Employee employee6 = new Employee();
		employee6.setId(5);
		employee6.setName("Abc Reddy5");
		employee6.setGender("Transgender");
		employee6.setSalary(6000);
		employee6.setAdmin(true);
		employee6.setAge(15);
		
		listBox.add(employee6);

		return listBox;
	}

	public static Set<Employee> getSetOfEmployees(List listBox) {
		Set<Employee> setOfEmployees = new HashSet<>();
		List list = createEmployeeAndAddToList(listBox); // 4
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
