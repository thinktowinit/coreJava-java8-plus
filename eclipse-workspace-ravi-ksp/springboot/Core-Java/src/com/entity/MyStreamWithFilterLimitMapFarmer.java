package com.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.enums.BloodGroup;

public class MyStreamWithFilterLimitMapFarmer {
	//private static final String O_NEGATIE = "ONegative";


	public static void main(String[] args) {
		List<Farmer> list = com.entity.MyDataBaseUtil.getListOfFarmers(new ArrayList<>());
		getFarmerIdWhoseYearlyIncomeGreaterThan30000();
		getFarmerDetailsWhoIsAdminAndYearlyIncomeGreaterThan30000();
		getFarmerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000();
		getFarmerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000();
		

	}

	/**
	 * Prints the IDs of farmers whose yearly income is greater than 30,000.
	 *
	 * - Retrieves a list of Farmer objects from the database utility method. -
	 * Filters the list to include only those with yearly income > 30,000. -
	 * Extracts and prints the IDs of the matching farmers.
	 *
	 * This method does not return anything; it prints output to the console. In
	 * case of an error, an appropriate message is printed.
	 */
	private static void getFarmerIdWhoseYearlyIncomeGreaterThan30000() {
		try {
			List<Farmer> list = com.entity.MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			System.out.println("getFarmerIdWhoseYearlyIncomeGreaterThan30000 ============");

			list.stream().filter(farmer -> farmer.getYearlyIncome() > 30000).map(Farmer::getId)
					.collect(Collectors.toList()).forEach(System.out::println);

		} catch (Exception e) {
			System.out.println("Error while filtering farmers with income > 30000: " + e.getMessage());
		}
	}

	/**
	 * Prints the ID, Name, and Yearly Income of farmers who are admins and have a
	 * yearly income greater than 6000.
	 *
	 * - Retrieves a list of Farmer objects from the database utility method. -
	 * Filters for farmers with isAdmin = true and yearlyIncome > 30000. - Extracts
	 * and prints ID, Name, and Yearly Income.
	 *
	 * This method is for logging purposes and does not return any value. If any
	 * exception occurs, it will be caught and printed.
	 */
	private static void getFarmerDetailsWhoIsAdminAndYearlyIncomeGreaterThan30000() {
		try {
			List<Farmer> list = com.entity.MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			System.out.println("getFarmerDetailsWhoIsAdminAndYearlyIncomeGreaterThan30000 ============");

			list.stream().filter(farmer -> farmer.isAdmin() && farmer.getYearlyIncome() > 30000).map(farmer -> "ID: "
					+ farmer.getId() + ", Name: " + farmer.getName() + ", Income: ₹" + farmer.getYearlyIncome())
					.forEach(System.out::println);

		} catch (Exception e) {
			System.out.println("Error while filtering admin farmers with income > 30000: " + e.getMessage());
		}
	}

	/**
	 * Prints the IDs of farmers whose blood group is "O Negative" 
	 * and whose blood group price is less than 30000.
	 *
	 * - Retrieves a list of Farmer objects from the database.
	 * - Filters the list where:
	 *     - blood group is not null
	 *     - blood group equals "O Negative" (case-insensitive)
	 *     - blood group price is less than 10000
	 * - Extracts and prints the farmer IDs.
	 *
	 * This method is for logging and debugging. It does not return any value.
	 * If any exception occurs, it will be caught and printed.
	 */
	
	private static void getFarmerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000() {
	    try {
	        List<Farmer> list = com.entity.MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

	        System.out.println("getFarmerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000===========");

	        List<Integer> listOfFarmerIds = list.stream()
	            .filter(farmer -> farmer.getBloodGroup() == BloodGroup.	O_NEGATIE &&
	                              farmer.getBloodGroupPrice() < 10000)
	            .map(Farmer::getId)
	            .collect(Collectors.toList());

	        listOfFarmerIds.forEach(System.out::println);

	    } catch (Exception e) {
	        System.out.println("Error while filtering farmers by O Negative and blood price < 10000: " + e.getMessage());
	    }
	}

	
	
	
	/**
	 * This method fetches a list of farmers and filters those who:
	 * - Have Blood Group as O_NEGATIVE (Enum-based comparison)
	 * - Have blood group price less than 10000
	 *
	 * It prints the ID and Name of matching farmers to the console.
	 *
	 * Input: 
	 *   - The method internally calls MyDataBaseUtil.getListOfFarmers() which returns a list of Farmer objects.
	 *
	 * Output:
	 *   - No return value.
	 *   - Prints formatted string of ID and Name of farmers who match the conditions.
	 *
	 * Example Output:
	 *   ID: 101, Name: Ramesh
	 *   ID: 104, Name: Sita
	 */
	private static void getFarmerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000() {
	    try {
	        List<Farmer> list = com.entity.MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

	        System.out.println("getFarmerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000===========");

	        List<String> result = list.stream()
	            .filter(farmer -> farmer.getBloodGroup() == BloodGroup.	O_NEGATIE &&
	                              farmer.getBloodGroupPrice() < 10000)
	            .map(farmer -> "ID: " + farmer.getId() + ", Name: " + farmer.getName())
	            .collect(Collectors.toList());

	        result.forEach(System.out::println);

	    } catch (Exception e) {
	        System.out.println("Error while filtering farmers by O Negative and blood price < 10000: " + e.getMessage());
	    }
	}

}
