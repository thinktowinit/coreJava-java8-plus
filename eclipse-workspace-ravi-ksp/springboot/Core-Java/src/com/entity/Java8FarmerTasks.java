package com.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Java8FarmerTasks {

	public static void main(String[] args) {

		getDifferentFarmerNames();
		getDifferentFarmerIncomes();
		getIncreasedFarmerIncomesBy10k();
		getFarmersWithExperienceGreaterThan1Year();
		GetFirstFarmerNamewhoseYearlyIncomeisgreaterthan1000();

	}

	/**
	 * This method is used to get different farmer names from the database.
	 */
	private static void getDifferentFarmerNames() {
		try {
			List<Farmer> listOfFarmers = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			if (listOfFarmers == null || listOfFarmers.isEmpty()) {
				System.out.println("=============== No farmer records found in the database.===========");
				return;
			}

			List<String> listOfNames = listOfFarmers.stream().map(Farmer::getName) // extract name
					.filter(Objects::nonNull) // filter null names
					.distinct() // keep unique names
					.collect(Collectors.toList()); // collect to list

			System.out.println("==========Successfully retrieved unique farmer names:");
			listOfNames.forEach(System.out::println);
		} catch (Exception e) {
			System.err.println("==========Failed to fetch farmer names due to an error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to get different farmer yearly incomes from the database.
	 */
	private static void getDifferentFarmerIncomes() {
		try {
			List<Farmer> listOfFarmers = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			if (listOfFarmers == null || listOfFarmers.isEmpty()) {
				System.out.println(" =========No farmer records found in the database===============.");
				return;
			}

			List<Double> incomeList = listOfFarmers.stream().map(Farmer::getYearlyIncome) // extract income
					.filter(Objects::nonNull) // ignore null incomes
					.distinct() // remove duplicates
					.collect(Collectors.toList()); // collect to list

			System.out.println("===========Successfully retrieved unique farmer yearly incomes:");
			incomeList.forEach(System.out::println);

		} catch (Exception e) {
			System.err.println("=============Failed to fetch farmer incomes due to error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to get farmer salaries after increasing every salary by
	 * 10,000.
	 */
	private static void getIncreasedFarmerIncomesBy10k() {
		try {
			List<Farmer> listOfFarmers = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			if (listOfFarmers == null || listOfFarmers.isEmpty()) {
				System.out.println("===================No farmer records found in the database.============");
				return;
			}

			List<Double> updatedIncomeList = listOfFarmers.stream().map(Farmer::getYearlyIncome) // Get existing income
					.filter(Objects::nonNull) // Avoid null incomes
					.map(income -> income + 10000) // Add 10,000 to each income
					.distinct() // Optional: remove duplicates
					.collect(Collectors.toList()); // Collect to list

			System.out.println("============= Increased farmer incomes by ₹10,000:");
			updatedIncomeList.forEach(System.out::println); // Using method reference

		} catch (Exception e) {
			System.err.println("====================Error while increasing farmer incomes: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * This method fetches a maximum of 3 farmers whose experience is greater than 1
	 * year.
	 */

	private static void getFarmersWithExperienceGreaterThan1Year() {
		try {
			List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());
			if (list == null || list.isEmpty()) {
				System.out.println("=============== No farmers found in the database.");
				return;
			}

			System.out.println("================== All Farmers with their Experience:");
			list.forEach(f -> System.out.println(f.getName() + " - Experience: " + f.getExperience() + " years"));

			List<Farmer> experienced = list.stream().filter(f -> f.getExperience() > 1).limit(3).toList();

			if (experienced.isEmpty()) {
				System.out.println("================ No experienced farmers found (experience > 1 year).");
			} else {
				System.out.println(
						"===================== Successfully fetched experienced farmers (experience > 1 year):");
				experienced.forEach(System.out::println);
			}

		} catch (Exception e) {
			System.out.println(
					"====================== Error occurred while fetching experienced farmers: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static void GetFirstFarmerNamewhoseYearlyIncomeisgreaterthan1000() {
		List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());
		
		
	}
}
