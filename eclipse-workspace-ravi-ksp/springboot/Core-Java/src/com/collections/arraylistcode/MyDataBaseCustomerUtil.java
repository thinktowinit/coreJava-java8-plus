package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.entity.Customer;
import com.enums.BloodGroup;

public class MyDataBaseCustomerUtil {
	/**
	 * @param listbox
	 * this method is used to get list of customers
	 * @return
	 */
	public static List<Customer> getListOfCustomers(List listbox) {
		return createCustomersAndAddToList(listbox);	
	}

	/**
	 * @param listbox
	 * this method is used to create customers and add to list
	 * @return
	 */
	private static List<Customer> createCustomersAndAddToList(List listbox) {
		try {
			Customer c1=new Customer();
			c1.setName("Supriya");
			c1.setCustomerId(1);
			c1.setGender("female");
			c1.setSalary(2200);
			c1.setAdmin(true);
			c1.setBloodGroup(BloodGroup.O_NEGATIE);
			c1.setBloodGroupPrice(3000);
			c1.setAge(22);
			Customer c2=new Customer();
			c2.setName("Darshan");
			c2.setCustomerId(2);
			c2.setGender("male");
			c2.setSalary(25000);
			c2.setAdmin(false);
			c2.setBloodGroup(BloodGroup.O_POSSITIE);
			c2.setBloodGroupPrice(2000);
			c2.setAge(20);
			Customer c3=new Customer();
			c3.setName("Sahithi");
			c3.setCustomerId(3);
			c3.setGender("female");
			c3.setSalary(12000);
			c3.setAdmin(true);
			c3.setBloodGroup(BloodGroup.O_NEGATIE);
			c3.setBloodGroupPrice(4000);
			c3.setAge(25);
			Customer c4=new Customer();
			c4.setName("Sathwik");
			c4.setCustomerId(4);
			c4.setGender("male");
			c4.setSalary(20000);
			c4.setAdmin(false);
			c4.setBloodGroup(BloodGroup.O_POSSITIE);
			c4.setBloodGroupPrice(5000);
			c4.setAge(30);
			Customer c5=new Customer();
			c5.setName("Geetha");
			c5.setCustomerId(5);
			c5.setGender("female");
			c5.setSalary(30000);
			c5.setAdmin(true);
			c5.setBloodGroup(BloodGroup.O_NEGATIE);
			c5.setBloodGroupPrice(6500);
			c5.setAge(24);
			listbox.add(c1);
			listbox.add(c2);
			listbox.add(c3);
			listbox.add(c4);
			listbox.add(c5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listbox;
	}
	/**
	 * @param listBox
	 * this method is used to get set of customers from the list of customers
	 * @return
	 */
	public static Set<Customer> getSetOfCustomers(List listBox) {
		Set<Customer> setOfCustomers=null;
		try {
			setOfCustomers=new HashSet<Customer>();
			List list=createCustomersAndAddToList(listBox);
			setOfCustomers.addAll(list);
			return setOfCustomers;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return setOfCustomers;	
	}
	/**
	 * @return
	 * this method is used to get sample map data
	 */
	public static Map<Integer, String> getSampleMapData() {
		Map<Integer, String> map=null;
		try {
			map = new HashMap<>();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * @return
	 * this method is used to get sample map data without null values
	 */
	public static Map<Integer, String> getSampleMapDataWithOutNull() {
		Map<Integer, String> map =null;
		try {
			map = new HashMap<>();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * @return
	 * this method is used to get tree map
	 */
	public static Map<Integer, String> getTreeMap() {
		Map<Integer, String> treeMap=null;
		try {
			treeMap = new TreeMap<>();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return treeMap;
	}

	/**
	 * @return
	 * this method is used to get hash map
	 */
	public static Map<Integer, String> getHashMap() {
		Map<Integer, String> hashMap =null;
		try {
			hashMap = new HashMap<>();
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hashMap;
	}

	/**
	 * @return
	 * this method is used to get list of strings
	 */
	public static List<String> getListOfStrings() {
		return new ArrayList<>(Arrays.asList("abc", "ab", null, "a"));
	}
}