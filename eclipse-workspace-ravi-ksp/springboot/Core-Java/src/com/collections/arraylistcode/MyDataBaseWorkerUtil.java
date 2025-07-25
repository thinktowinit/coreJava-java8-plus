package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.entity.Worker;

public class MyDataBaseWorkerUtil {
	
	
	
	public static List<Worker> getListOfWorker(List listBox) {
		// TODO Auto-generated method stub

		return createWorkerAndAddToList(listBox);

	}

	private static List<Worker> createWorkerAndAddToList(List listBox) {
		// TODO Auto-generated method stub
		//Employee employee1 = new Employee();
		Worker worker1 = new Worker();
		worker1.setName("TTW");
		worker1.setId(1);
        worker1.setAdmin(true);
		worker1.setSalary(22000);
		worker1.setGender("Male");
		worker1.setBloodGroup("oNegative");
		worker1.setBloodGroupPrice(2000);
		worker1.setAge(22);

		Worker worker2 = new Worker();
		worker2.setId(2);
		worker2.setName("TTW");
		worker2.setGender("Male");
		worker2.setSalary(3300);
		worker2.setAdmin(false);
		worker2.setAge(23);

		Worker worker3 = new Worker();
		worker3.setName("Naveen Reddy");
		worker3.setGender("Male");
		worker3.setId(3);
		worker3.setSalary(6600);
		worker3.setAdmin(true);
		worker3.setBloodGroupPrice(2000);
		worker3.setBloodGroup("oPossitie");

		Worker worker4 = new Worker();
		worker4.setName("Abi"); // 7
		worker4.setSalary(990);
		worker4.setBloodGroupPrice(990);
		worker4.setBloodGroup("oNegative");
		worker4.setGender("Female");
		worker4.setAge(25);
		worker4.setId(4);
		worker4.setAdmin(true);
		
		Worker worker5 = new Worker();
		worker5.setId(5);
		worker5.setName("Nagesh Reddy5");
		worker5.setGender("Male");
		worker5.setSalary(6000);
		worker5.setAdmin(true);
		
		
		Worker worker6 = new Worker();
		worker6.setId(5);
		worker6.setName("Nagesh Reddy5");
		worker6.setGender("Male");
		worker6.setSalary(6000);
		worker6.setAdmin(true);

		listBox.add(worker3);
		listBox.add(worker2);
		listBox.add(worker1);
		listBox.add(worker4);
		listBox.add(worker5);
		listBox.add(worker6);
		
		Worker worker7 = new Worker();
		worker7.setId(5);
		worker7.setName("Abc Reddy5");
		worker7.setGender("Transgender");
		worker7.setSalary(6000);
		worker7.setAdmin(true);
		worker7.setAge(15);
		
		listBox.add(worker7);

		return listBox;
	}

	public static Set<Worker> getSetOfWorker(List listBox) {
		Set<Worker> setOfWorker = new HashSet<>();
		List list = createWorkerAndAddToList(listBox); // 4
		setOfWorker.addAll(list); // 4
		return setOfWorker;

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


	

