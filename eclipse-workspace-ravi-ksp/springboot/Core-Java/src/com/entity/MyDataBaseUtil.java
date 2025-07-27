package com.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.enums.BloodGroup;

public class MyDataBaseUtil {
	public static List<Farmer> getListOfFarmers(List listBox) {
		return createFarmerAndAddToList(listBox);
	}

	private static List<Farmer> createFarmerAndAddToList(List listBox) {
		Farmer farmer1 = new Farmer();
		farmer1.setBloodGroup(BloodGroup.O_NEGATIE);
		farmer1.setId(1);
		farmer1.setName("kathi venkataRamudu");
		farmer1.setAge(53);
		farmer1.setGender("male");
		farmer1.setVillage("K.Sugumanchipalli");
		farmer1.setMobileNumber("9951323672");
		farmer1.setLandArea("1.5Acres");
		farmer1.setLandType("Fertile");
		farmer1.setCropType("Kharif");

		farmer1.setBloodGroupPrice(5000);
		farmer1.setAdmin(true);
		farmer1.setYearlyIncome(50000);
		farmer1.setLoanTaken(true);
		farmer1.setLoanAmount(50000.00);
		farmer1.setBankName("State Bank of India");
		farmer1.setAadharNumber("123412341234");
		farmer1.setRationCardNumber("AP1234567890");

		Farmer farmer2 = new Farmer();
		farmer2.setBloodGroup(BloodGroup.O_NEGATIE);
		farmer2.setId(2);
		farmer2.setName("kathi PeddaNarayana");
		farmer2.setAge(80);
		farmer2.setGender("male");
		farmer2.setVillage("K.Sugumanchipalli");
		farmer2.setMobileNumber("9951323672");
		farmer2.setLandArea("1.5Acres");
		farmer2.setLandType("Fertile");
		farmer2.setCropType("Kharif");
		farmer2.setYearlyIncome(60000);
		farmer2.setBloodGroupPrice(6000);
		farmer2.setAdmin(true);
		farmer2.setLoanTaken(true);
		farmer2.setLoanAmount(50000.00);
		farmer2.setBankName("State Bank of India");
		farmer2.setAadharNumber("123412341234");
		farmer2.setRationCardNumber("AP1234567890");

		Farmer farmer3 = new Farmer();
		farmer3.setId(3);
		farmer3.setName("kathi Obullamma");
		farmer3.setAge(72);
		farmer3.setGender("female");
		farmer3.setVillage("K.Sugumanchipalli");
		farmer3.setMobileNumber("9951323672");
		farmer3.setLandArea("1.5Acres");
		farmer3.setLandType("Fertile");
		farmer3.setCropType("Kharif");
		farmer3.setYearlyIncome(70000);
		farmer2.setBloodGroup(BloodGroup.O_NEGATIE);

		farmer3.setBloodGroupPrice(4000);
		farmer3.setAdmin(true);
		farmer3.setLoanTaken(true);
		farmer3.setLoanAmount(50000.00);
		farmer3.setBankName("State Bank of India");
		farmer3.setAadharNumber("123412341234");
		farmer3.setRationCardNumber("AP1234567890");

		Farmer farmer4 = new Farmer();
		farmer4.setBloodGroup(BloodGroup.O_NEGATIE);

		farmer4.setId(4);
		farmer4.setName("p.Obulesu");
		farmer4.setAge(53);
		farmer4.setGender("male");
		farmer4.setVillage("K.Sugumanchipalli");
		farmer4.setMobileNumber("9951323672");
		farmer4.setLandArea("1.5Acres");
		farmer4.setLandType("Fertile");
		farmer4.setCropType("Kharif");
		farmer4.setYearlyIncome(80000);
		farmer4.setBloodGroup(BloodGroup.O_POSSITIE);
		farmer4.setBloodGroupPrice(600);
		farmer4.setAdmin(true);
		farmer4.setLoanTaken(true);
		farmer4.setLoanAmount(50000.00);
		farmer4.setBankName("State Bank of India");
		farmer4.setAadharNumber("123412341234");
		farmer4.setRationCardNumber("AP1234567890");

		Farmer farmer5 = new Farmer();
		farmer5.setId(5);
		farmer5.setName("kathi VenkataRamudu");
		farmer5.setAge(53);
		farmer5.setGender("male");
		farmer5.setVillage("K.Sugumanchipalli");
		farmer5.setMobileNumber("9951323672");
		farmer5.setLandArea("1.5Acres");
		farmer5.setLandType("Fertile");
		farmer5.setCropType("Kharif");
		farmer5.setBloodGroup(BloodGroup.O_POSSITIE);
		farmer5.setBloodGroupPrice(100);
		farmer5.setYearlyIncome(90000);
		farmer5.setLoanTaken(true);
		farmer5.setLoanAmount(50000.00);
		farmer5.setBankName("State Bank of India");
		farmer5.setAadharNumber("123412341234");
		farmer5.setRationCardNumber("AP1234567890");

		Farmer farmer6 = new Farmer();
		farmer6.setId(6);
		farmer6.setName("Great Grand father");
		farmer6.setAge(53);
		farmer6.setGender("male");
		farmer6.setVillage("K.Sugumanchipalli");
		farmer6.setMobileNumber("9951323672");
		farmer6.setLandArea("1.5Acres");
		farmer6.setLandType("Fertile");
		farmer6.setCropType("Kharif");
		farmer6.setYearlyIncome(100000);
		farmer6.setBloodGroup(BloodGroup.O_POSSITIE);

		farmer6.setBloodGroupPrice(500);
		farmer6.setAdmin(true);
		farmer6.setLoanTaken(true);
		farmer6.setLoanAmount(50000.00);
		farmer6.setBankName("State Bank of India");
		farmer6.setAadharNumber("123412341234");
		farmer6.setRationCardNumber("AP1234567890");

		listBox.add(farmer6);
		listBox.add(farmer5);
		listBox.add(farmer4);
		listBox.add(farmer3);
		listBox.add(farmer2);
		listBox.add(farmer1);

		return listBox;
	}

	/**
	 * Converts a list of raw input objects into a unique set of Farmer objects
	 * 
	 * @param listBox A list of raw input objects required to create Farmer
	 *                instances. This list is passed to the
	 *                createFarmerAndAddToList() method.
	 *
	 * @return A Set of Farmer objects created from the input list. Returns an empty
	 *         set if the input list is invalid or an error occurs.
	 * 
	 */
	public static Set<Farmer> getSetOfFarmers(List listBox) {
		Set<Farmer> setOfFarmers = new HashSet<>();
		try {
			List<Farmer> farmerList = createFarmerAndAddToList(listBox);
			if (farmerList != null) {
				setOfFarmers.addAll(farmerList);
			}
		} catch (Exception e) {
			System.err.println("Error while creating set of farmers: " + e.getMessage());
		}
		return setOfFarmers; // Always returns empty set instead of null
	}

	/**
	 * Creates and returns a sample Map containing Integer keys and String values.
	 * 
	 * - Demonstrates behavior with null keys and null values. - Contains duplicate
	 * values and a duplicate key (key 14 is overwritten).
	 *
	 * @return Map<Integer, String> - A sample map with hardcoded key-value pairs.
	 *         Returns null if an exception occurs.
	 */
	public static Map<Integer, String> getSampleMapDataWithNullKeyAndNullValues() {
		try {
			Map<Integer, String> map = new HashMap<>();

			map.put(122, "Rajesh122");
			map.put(222, "Rajesh");
			map.put(221, "Rajesh");
			map.put(null, "Rajesh");
			map.put(null, "Rajesh 2nd null key"); // Overwrites previous null key
			map.put(1234, null);
			map.put(12345666, null);
			map.put(14, "ramu");
			map.put(27, "somu");
			map.put(15, "ram");
			map.put(68, null);
			map.put(33, "ramu");
			map.put(14, "ag"); // Overwrites key 14 again
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
			System.out.println("Exception occurred while creating sample map data: " + e.getMessage());
		}
		return null;
	}

	/**
	 * Creates and returns a sample Map of Integer keys and String values, excluding
	 * null keys and mostly avoiding null values (one null value exists for key 68).
	 *
	 * @return Map<Integer, String> - A sample map with hardcoded key-value pairs.
	 *         Returns null if any exception occurs.
	 */
	public static Map<Integer, String> getSampleMapDataWithOutNull() {
		try {
			Map<Integer, String> map = new HashMap<>();

			map.put(122, "Rajesh122");
			map.put(222, "Rajesh");
			map.put(221, "Rajesh");
			map.put(14, "ramu");
			map.put(27, "somu");
			map.put(15, "ram");
			map.put(68, null); // Note: This is still a null value
			map.put(33, "ramu");
			map.put(14, "ag"); // Overwrites key 14 with "ag"
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
			System.out.println("Exception occurred while creating map data without nulls: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Creates and returns a TreeMap with Integer keys and String values.
	 *
	 * - Keys are sorted in natural ascending order because TreeMap maintains order.
	 * - Duplicate keys will overwrite previous values (e.g., key 14 is
	 * overwritten). - No null keys are allowed in TreeMap (will throw
	 * NullPointerException).
	 *
	 * @return TreeMap<Integer, String> - A sorted map of sample key-value pairs.
	 *         Returns null if any exception occurs.
	 */
	public static Map<Integer, String> getTreeMap() {
		try {
			Map<Integer, String> treeMap = new TreeMap<>();

			treeMap.put(122, "Rajesh122");
			treeMap.put(222, "Rajesh");
			treeMap.put(221, "Rajesh");
			treeMap.put(14, "ramu");
			treeMap.put(27, "somu");
			treeMap.put(15, "ram");
			treeMap.put(33, "ramu");
			treeMap.put(14, "ag"); // Overwrites previous value for key 14
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
			System.out.println("Exception occurred while creating TreeMap: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Creates and returns a HashMap with Integer keys and String values.
	 *
	 * - Demonstrates behavior of HashMap with null keys and null values. - Keys are
	 * not sorted; insertion order is not guaranteed. - Allows one null key and
	 * multiple null values. - Duplicate keys will overwrite previous values (e.g.,
	 * key 14).
	 *
	 * @return Map<Integer, String> - A HashMap containing sample key-value pairs.
	 *         Returns null if an exception occurs during map creation.
	 */
	public static Map<Integer, String> getHashMap() {
		try {
			Map<Integer, String> hashMap = new HashMap<>();

			hashMap.put(122, "Rajesh122");
			hashMap.put(222, "Rajesh");
			hashMap.put(221, "Rajesh");
			hashMap.put(14, "ramu");
			hashMap.put(27, "somu");
			hashMap.put(15, "Bam");
			hashMap.put(10, "Bulb");
			hashMap.put(12345, null); // null value
			hashMap.put(null, null); // one null key allowed
			hashMap.put(33, "ramu");
			hashMap.put(14, "ag"); // overwrites previous value at key 14
			hashMap.put(46, "ah");
			hashMap.put(102, "akhila");
			hashMap.put(16, "ha");
			hashMap.put(31, "ykj");
			hashMap.put(25, "sgah");
			hashMap.put(11, "dhh");
			hashMap.put(30, "hello");
			hashMap.put(17, "well");
			hashMap.put(2, "well");
			hashMap.put(8, "well");
			hashMap.put(1, "wellcome");

			return hashMap;
		} catch (Exception e) {
			System.out.println("Exception occurred while creating HashMap: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Creates and returns a List of Strings with some sample data including null.
	 *
	 * - The list contains string elements like "abc", "ab", "a", and a null value.
	 * - Useful for testing null handling and list operations.
	 *
	 * @return List<String> - A list of strings including a null element. Returns
	 *         null if an exception occurs during list creation.
	 */
	public static List<String> getListOfStrings() {
		try {
			return new ArrayList<>(Arrays.asList("abc", "ab", null, "a"));
		} catch (Exception e) {
			System.out.println("Exception occurred while creating list of strings: " + e.getMessage());
			return null;
		}
	}

}