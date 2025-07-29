package com.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import com.enums.BloodGroup;

public class MyStreamWithFilterLimitMapFarmer {
	
	private static final String METHOD_TITLE = "getFarmerDetailsWhoIsAdminAndYearlyIncomeGreaterThan30000 ============";
	private static final String OUTPUT_FORMAT = "ID: %d, Name: %s, Income: ₹%.2f";
	private static final String ERROR_MSG = "Getting Error while filtering admin farmers with income > 30000: ";
	private static final String SUCCESS_MSG = "======[SUCCESS] First farmer name whose yearly income > 1000: ";
	private static final String ERROR_MSG1 = "==========[ERROR] No farmer found or error occurred while fetching farmer name.";


	public static void main(String[] args) {
		List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());
		TaskOneMethods();
		TaskTwoMethods();

		
		
		 LocalDate joiningDate = LocalDate.now().minusYears(4).minusMonths(2).minusDays(10);
			Farmer farmer = new Farmer();
			farmer.setName("UnKnown Person");
			farmer.setJoiningDate(LocalDateTime.of(2024, 6, 28, 6, 55, 23));
			calculateFarmerExperienceBasedOnJoiningDateAndTodayDate(farmer);

			getFarmerJoiningDateFormatted();
			getFarmerJoiningDateCustomFormatted();
			getFarmerJoiningDateCustomPattern();
         
         
         int[] farmerIds = {105, 101, 108, 103, 102, 106};
         System.out.println("===========Performing Parallel Sorting==========");
         System.out.println("Before Parallel Sort (IDs): " + Arrays.toString(farmerIds));
         Arrays.parallelSort(farmerIds); 
         System.out.println("After Parallel Sort (IDs): " + Arrays.toString(farmerIds));
         
         System.out.println();

         String[] farmerNames = {"Ravi", "Anil", "Bhanu", "Suresh", "Kiran"};
         System.out.println("Before Parallel Sort (Names): " + Arrays.toString(farmerNames));
         Arrays.parallelSort(farmerNames);
         System.out.println("After Parallel Sort (Names): " + Arrays.toString(farmerNames));
    

	}
	

	private static void TaskTwoMethods() {
		System.out.println("=============Task2 methods=================");
		getDifferentFarmerNames();
		getDifferentFarmerIncomes();
		getIncreasedFarmerIncomesBy10k();
		getFarmersWithExperienceGreaterThan1Year();
		GetFirstFarmerNamewhoseYearlyIncomeisgreaterthan1000();
		GetFarmersIDAndYearlyIncome();
		GetFarmersIDAndYearlyIncomeSortingBasedOnKey();
		GetFarmerIDandYearlyIncomeAndApplySortingBasedOnValue();
		GetFarmersNameAndYearlyIncomeAndApplySortingBasedOnName();
	}


	
	private static void TaskOneMethods() {
		System.out.println("==============Task1 methods=============");
		List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());
        getListOfFarmerNamesWhoseYearlyIncomeDividedBy3AndGetMax3Farmers(list);
		getFarmerIdWhoseYearlyIncomeGreaterThan30000();
		getFarmerNamesWhoIsAdminAndHisYearlyIncomeGreaterThan6000();
		getFarmerDetailsWhoIsAdminAndYearlyIncomeGreaterThan30000();
		getFarmerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000();
		getFarmerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan10000();
	}
	
	



		/**
		 * @param farmers
		 * 
		 * Task1.1. This is used for writing getListOfFarmerNamesWhoseYearlyIncomeDividedBy3AndGetMax3Farmers
		 */
		private static void getListOfFarmerNamesWhoseYearlyIncomeDividedBy3AndGetMax3Farmers(List<Farmer> farmers) {
		    try {

		        System.out.println("==== Farmers whose yearly income is divisible by 3 ====");

		        List<String> listOfFarmerNames = farmers.stream()
		                .filter(farmer -> farmer.getYearlyIncome() % 3 == 0)
		                .limit(3)
		                .map(Farmer::getName)
		                .collect(Collectors.toList());

		        listOfFarmerNames.forEach(System.out::println);

		        System.out.println("Successfully fetched up to 3 farmers with yearly income divisible by 3.");
		    } catch (Exception e) {
		        System.err.println(" Error occurred while fetching farmer names: " + e.getMessage());
		        e.printStackTrace();
		    }
		}

		/**
		 *Task1.2 Prints the names of farmers who are admins and have a yearly income greater than 6000.
		 */
		private static void getFarmerNamesWhoIsAdminAndHisYearlyIncomeGreaterThan6000() {
			try {
				Optional.ofNullable(MyDataBaseUtil.getListOfFarmers(new ArrayList<>()))
					.filter(list -> !list.isEmpty())
					.map(list -> list.stream()
						.filter(farmer -> farmer.isAdmin() && farmer.getYearlyIncome() > 6000)
						.map(Farmer::getName)
						.toList())
					.filter(list -> !list.isEmpty())
					.ifPresent(names -> {
						System.out.println("==== Admin farmers with yearly income > 6000 ====");
						names.forEach(System.out::println);
					});
			} catch (Exception e) {
				System.err.println("Error while filtering farmers: " + e.getMessage());
				e.printStackTrace();
			}
		}
	

	/**
	 *Task1.3) Prints the IDs of farmers whose yearly income is greater than 30,000.
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
			List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			System.out.println("getFarmerIdWhoseYearlyIncomeGreaterThan30000 ============");

			list.stream().filter(farmer -> farmer.getYearlyIncome() > 30000).map(Farmer::getId)
					.collect(Collectors.toList()).forEach(System.out::println);

		} catch (Exception e) {
			System.out.println("Error while filtering farmers with income > 30000: " + e.getMessage());
		}
	}

	/**
	 * Task1.4)This method filters and prints details of farmers who are admins and earn more than ₹30,000 yearly.
	 *
	 * <p><b>Operations Performed:</b></p>
	 * <ul>
	 *   <li>Fetches a list of farmers from the database utility class.</li>
	 *   <li>Applies a filter for farmers with isAdmin = true and yearly income > 30,000.</li>
	 *   <li>Prints their ID, Name, and Income using formatted output.</li>
	 * </ul>
	 *
	 * <p><b>Note:</b> Exception handling is applied to catch and log any runtime issues.</p>
	 */
	private static void getFarmerDetailsWhoIsAdminAndYearlyIncomeGreaterThan30000() {
	    try {
	        List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

	        System.out.println(METHOD_TITLE);

	        list.stream()
	            .filter(farmer -> farmer.isAdmin() && farmer.getYearlyIncome() > 30000)
	            .map(farmer -> String.format(OUTPUT_FORMAT, farmer.getId(), farmer.getName(), farmer.getYearlyIncome()))
	            .forEach(System.out::println);

	    } catch (Exception e) {
	        System.out.println(ERROR_MSG + e.getMessage());
	    }
	}

	/**
	 *Task1.5 Prints the IDs of farmers whose blood group is "O Negative" 
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
	        List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

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
	 * Task1.6 This method fetches a list of farmers and filters those who:
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
	        List<Farmer> list = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

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
	
	
	
	/**
	 * Task2.1.This method is used to get different farmer names from the database.
	 */
	private static void getDifferentFarmerNames() {
		try {
			List<Farmer> listOfFarmers = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			Optional.ofNullable(listOfFarmers)
				.filter(list -> !list.isEmpty())
				.map(list -> list.stream()
					.map(Farmer::getName)
					.filter(Objects::nonNull)
					.distinct()
					.collect(Collectors.toList()))
				.ifPresent(names -> {
					System.out.println("Successfully retrieved unique farmer names:");
					names.forEach(System.out::println); 
				});

		} catch (Exception e) {
			System.out.println(" Failed to fetch farmer names due to error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Task2.2.This method is used to get different farmer yearly incomes from the database.
	 */
	private static void getDifferentFarmerIncomes() {
		try {
			List<Farmer> listOfFarmers = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			Optional.ofNullable(listOfFarmers)
				.filter(list -> !list.isEmpty())
				.ifPresent(list -> {
					List<Double> incomeList = list.stream()
						.map(Farmer::getYearlyIncome)
						.filter(Objects::nonNull)
						.distinct()
						.collect(Collectors.toList());

					System.out.println("=========== Successfully retrieved unique farmer yearly incomes:");
					incomeList.forEach(System.out::println);
				});

		} catch (Exception e) {
			System.out.println("=========== Failed to fetch farmer incomes due to error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Task2.3.This method is used to get farmer salaries after increasing every salary by 10,000.
	 */
	private static void getIncreasedFarmerIncomesBy10k() {
		try {
			List<Farmer> listOfFarmers = MyDataBaseUtil.getListOfFarmers(new ArrayList<>());

			Optional.ofNullable(listOfFarmers)
				.filter(list -> !list.isEmpty())
				.ifPresent(list -> {
					List<Double> updatedIncomeList = list.stream()
						.map(Farmer::getYearlyIncome)
						.filter(Objects::nonNull)
						.map(income -> income + 10000) // Add ₹10,000
						.distinct()
						.collect(Collectors.toList());

					System.out.println("============= Increased farmer incomes by ₹10,000:");
					updatedIncomeList.forEach(System.out::println);
				});

		} catch (Exception e) {
			System.err.println("============= Error while increasing farmer incomes: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Task2.4. This method fetches a maximum of 3 farmers whose experience is greater than 1 year.
	 */
	private static void getFarmersWithExperienceGreaterThan1Year() {
		try {
			Optional.ofNullable(MyDataBaseUtil.getListOfFarmers(new ArrayList<>()))
				.filter(list -> !list.isEmpty())
				.map(list -> list.stream()
					.filter(farmer -> Optional.ofNullable(farmer.getJoiningDate())
						.map(date -> Period.between(date.toLocalDate(), LocalDate.now()).getYears())
						.filter(years -> years > 1)
						.isPresent())
					.limit(3)
					.toList())
				.filter(list -> !list.isEmpty())
				.ifPresent(experiencedFarmers -> {
					System.out.println("============= Fetched max 3 farmers with experience > 1 year.");
					experiencedFarmers.forEach(System.out::println);
				});
		} catch (Exception e) {
			System.err.println("Error while fetching experienced farmers: " + e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 *Task2. 5.This method fetches the first farmer name whose yearly income is greater than 1000.
	 */
	private static void GetFirstFarmerNamewhoseYearlyIncomeisgreaterthan1000() {
		

		try {
			Optional.ofNullable(MyDataBaseUtil.getListOfFarmers(new ArrayList<>()))
				.filter(list -> !list.isEmpty())
				.map(list -> list.stream()
					.filter(farmer -> farmer.getYearlyIncome() > 1000)
					.map(Farmer::getName)
					.findFirst())
				.flatMap(farmerNameOpt -> farmerNameOpt)
				.ifPresentOrElse(
					name -> System.out.println(SUCCESS_MSG + name),
					() -> System.out.println(ERROR_MSG)
				);

		} catch (Exception e) {
			System.out.println(ERROR_MSG);
		}
	}
	
	/**
	 *Task2.6. This method prints the ID and yearly income of all farmers from the database.
	 * It uses Optional, Stream API, and SimpleEntry for clean and safe data processing.
	 *  Java 8 compatible and clean.
	 */
	private static void GetFarmersIDAndYearlyIncome() {
	    final String SUCCESS_MSG = "=========== Farmer ID and Yearly Income List ===========";
	    final String ERROR_MSG = "============= No farmers found or an error occurred while fetching data.";

	    try {
	        List<Farmer> farmers = Optional.ofNullable(MyDataBaseUtil.getListOfFarmers(new ArrayList<>()))
	                                       .orElse(new ArrayList<>());

	        if (!farmers.isEmpty()) {
	            System.out.println(SUCCESS_MSG);
	            farmers.stream()
	                   .map(farmer -> new AbstractMap.SimpleEntry<>(farmer.getId(), farmer.getYearlyIncome()))
	                   .map(entry -> String.format("Farmer ID: %d, Yearly Income: ₹%.2f", entry.getKey(), entry.getValue()))
	                   .forEach(System.out::println); 
	        } else {
	            System.out.println(ERROR_MSG);
	        }
	    } catch (Exception e) {
	        System.out.println(ERROR_MSG);
	    }
	}
	
	
	/**
	 * Task2.7.This method fetches a list of farmers from the database and displays their
	 * IDs and Yearly Income in sorted order based on the ID.
	 * 
	 * Key Java 8 features used:
	 * - Optional: to handle null safely
	 * - filter(): to skip empty lists
	 * - map(): to transform Farmer objects into custom "ID = Income" strings
	 * - sorted(): to sort Farmer objects based on ID
	 * - forEach(): to print the result using a method reference
	 */
	private static void GetFarmersIDAndYearlyIncomeSortingBasedOnKey() {
	    try {
	        Optional.ofNullable(MyDataBaseUtil.getListOfFarmers(new ArrayList<>()))
	                .filter(list -> !list.isEmpty())
	                .ifPresent(farmers -> {

	                    System.out.println("=========== Successfully displayed all Farmer IDs with Yearly Incomes sorting Basedonkey or id ===========");
	                    farmers.stream()
	                           .sorted(Comparator.comparing(Farmer::getId))
	                           .map(farmer -> farmer.getId() + " = " + farmer.getYearlyIncome())
	                           .forEach(System.out::println);

	                });
	    } catch (Exception e) {
	        System.out.println("============= No farmers found or an error occurred while fetching data. =============");
	    }
	}
	
	
	/**
	 *Task2. 8.This method fetches a list of farmers and displays their
	 * IDs and Yearly Incomes sorted in ascending order based on income.
	 *
	 * Java 8 Features Used:
	 * - Optional: to handle nulls safely
	 * - filter(): to skip empty lists
	 * - stream(): to process collection
	 * - sorted(): to sort by income (value)
	 * - map(): to format output
	 * - forEach(): with method reference to print
	 */
	private static void GetFarmerIDandYearlyIncomeAndApplySortingBasedOnValue() {
	    try {
	    	
	    	System.out.println("=========== Successfully displayed Farmer IDs sorted by Yearly Income ===========");
	        Optional.ofNullable(MyDataBaseUtil.getListOfFarmers(new ArrayList<>()))
	                .filter(list -> !list.isEmpty())
	                .ifPresent(farmers -> {
	                   
	                    farmers.stream()
	                           .sorted(Comparator.comparing(Farmer::getYearlyIncome)) 
	                           .map(farmer -> farmer.getId() + " = " + farmer.getYearlyIncome())
	                           .forEach(System.out::println); 

	                });
	    } catch (Exception e) {
	        System.out.println("============= No farmers found or an error occurred while fetching data. =============");
	    }
	}

	
	/**
	 * Task2.9.This method fetches a list of farmers and prints their names along with yearly income,
	 * sorted in ascending order by farmer name.
	 *
	 * Java 8 Features Used:
	 * - Optional: to safely handle null lists
	 * - Stream API: to process and sort the list
	 * - Comparator.comparing(): for sorting
	 * - Lambda expressions and method references
	 */
	private static void GetFarmersNameAndYearlyIncomeAndApplySortingBasedOnName() {
	    try {
	    	 System.out.println("=========== Successfully displayed Farmer Names and Yearly Incomes sorted by Name ===========");

	        Optional.ofNullable(MyDataBaseUtil.getListOfFarmers())
	                .filter(list -> !list.isEmpty())
	                .ifPresent(farmers -> 
	                    farmers.stream()
	                           .sorted(Comparator.comparing(Farmer::getName))
	                           .map(farmer -> farmer.getName() + " = " + farmer.getYearlyIncome())
	                           .forEach(System.out::println)
	                );


	    } catch (Exception e) {
	        System.out.println("============= Error occurred while fetching or processing farmer data =============");
	        e.printStackTrace(); 
	    }
	}
	
	//Task2. 10.Farmer class assumed to have fields: name, joiningDate
		//Method to calculate experience using LocalDateTime and Optional
		private static void calculateFarmerExperienceBasedOnJoiningDateAndTodayDate(Farmer farmer) {
		    Optional.ofNullable(farmer.getJoiningDate()).ifPresentOrElse(joinDateTime -> {
		        try {
		            LocalDate joinDate = joinDateTime.toLocalDate();
		            LocalDate today = LocalDate.now();

		            Period experience = Period.between(joinDate, today);

		            System.out.println("========Success: Experience calculated for farmer: " + farmer.getName());
		            System.out.println("Farmer Name: " + farmer.getName());
		            System.out.println("Experience: " + experience.getYears() + " years, " 
		                               + experience.getMonths() + " months, " 
		                               + experience.getDays() + " days.");
		        } catch (Exception e) {
		            System.out.println("Error occurred while calculating experience for farmer: " + farmer.getName());
		            e.printStackTrace();
		        }
		    }, () -> {
		        System.out.println("Error: Joining date is not available for farmer: " + farmer.getName());
		    });
		}

		/**
		 * Task2.11. This method prints the farmer's joining date in the format "yyyy-MM-dd
		 * HH:mm:ss". It checks the availability of the joining date using Optional. If
		 * the date is absent, it logs an error. If present, it formats and prints the
		 * joining date.
		 */
		private static void getFarmerJoiningDateFormatted() {
			
				LocalDateTime joiningDateTime = LocalDateTime.of(2024, 6, 28, 6, 55, 23);

				Optional.ofNullable(joiningDateTime).ifPresentOrElse(date -> {
					try {
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

						String formattedDate = date.format(formatter);

						System.out.println("============ Getting FarmerJoiningDateFormatted");
						System.out.println("Joining Date: " + formattedDate);
					} catch (Exception e) {
						System.out.println("Error occurred while formatting joining date.");
						e.printStackTrace();
					}
				}, () -> {
					System.out.println("Error: Joining date is not available for farmer.");
				});
			}
		
		
		

		/**
		 *Task2. 12.This method formats and displays a farmer's joining date in the following
		 * pattern: "yyyy-MMMM-dd HH:mm:ss" → Example: 2024-June-28 06:55:23
		 * 
		 * - Uses Java 8's LocalDateTime, Optional, and DateTimeFormatter. - Simulates
		 * the joining date for demonstration purposes. - Safely handles null using
		 * Optional.
		 */
		private static void getFarmerJoiningDateCustomFormatted() {
			
				LocalDateTime joiningDateTime = LocalDateTime.of(2024, 6, 28, 6, 55, 23);

				Optional.ofNullable(joiningDateTime).ifPresentOrElse(date -> {
					try {
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss");

						String formattedDate = date.format(formatter);
						System.out.println("=======getFarmerJoiningDateCustomFormatted");
						System.out.println("Joining Date: " + formattedDate);

					} catch (Exception e) {
						System.out.println("Error occurred while formatting the joining date.");
						e.printStackTrace();
					}
				}, () -> {
					System.out.println("Error: Joining date is not available for farmer.");
				});
			}
		
		
		
		/**
		 *Task2.13. This method prints the farmer's joining date in the format: "dd-MMMM-yyyy
		 * HH:mm:ss" Example Output: 28-June-2024 06:55:23
		 */
		private static void getFarmerJoiningDateCustomPattern() {
		
				LocalDateTime joiningDateTime = LocalDateTime.of(2024, 6, 28, 6, 55, 23);

				Optional<LocalDateTime> optionalJoiningDate = Optional.ofNullable(joiningDateTime);

				optionalJoiningDate.ifPresentOrElse(date -> {
					try {
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
						String formattedDate = date.format(formatter);

						System.out.println("======= getFarmerJoiningDateCustomPattern =======");
						System.out.println("Joining Date: " + formattedDate);
					} catch (Exception e) {
						System.out.println("Error occurred while formatting the joining date.");
						e.printStackTrace();
					}
				}, () -> {
					System.out.println("Error: Joining date is not available for farmer.");
				});
			}

}
