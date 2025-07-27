package com.java8.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseCustomerUtil;
import com.entity.Customer;
import com.enums.BloodGroup;

public class MyStreamWithFilterLimitMapOnCustomer {
	private static final int SIX_THOUSAND = 6000;
	private static final int OTHER = -1;
	private static final String EMPTY = "";
	private static final int NULL = 0;
	private static final String UNKNOWN = "Unknown";
	private static final int NAME_LENGTH = 6;
	private static final int THREE_THOUSAND = 3000;
	private static final int INCREMENT_SALARY_BY_10000 = 10000;
	private static final Integer THOUSAND = 1000;

	/**
	 * @param args main method
	 */
	public static void main(String[] args) {

		task1Methods();
		task2Methods();

	}

	public static void task2Methods() {
		getDifferentCustomerNames();
		getDifferentCustomerSalaries();
		getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference();
		getCustomersWhoseExperienceIsGreaterthan1Year();
		getFirstCustomerNameWhoseSalaryGreaterthan1000();
		getCustomerIdAndthierSalary();
		getCustomerIdAndSalaryAndApplySortingBasedOnKey();
		getCustomerIdAndSalaryAndApplySortingBasedOnValue();
		getCustomerIdAndSalaryAndApplySortingBasedOnName();
		calculateCustomerExperienceBasedOnJoiningDateAndTodaysDate();
		getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional();
		getCustomerJoiningDateAndDisplayInRequiredForm2();
		getCustomerJoiningDateAndDisplayInRequiredForm3();
		ParallelSorting();
	}

	public static void task1Methods() {
		getCustomerIdWhoseSalaryGreaterThan3000();
		getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000();
		getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getGenderWhoseNamesLenthGreaterThan6();
	}

	/**
	 * this method is used to get Gender details Whose Names Length GreaterThan 6
	 */
	private static void getGenderWhoseNamesLenthGreaterThan6() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfGenders = list.stream()
					.filter(customer -> Optional.ofNullable(customer.getName()).map(name -> name.length() > NAME_LENGTH)
							.orElse(false))
					.map(customer -> customer.getName() + " - " + customer.getGender()).collect(Collectors.toList());
			System.out.println("getGenderWhoseNamesLenthGreaterThan6==========");
			listOfGenders.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getGenderWhoseNamesLenthGreaterThan6 " + e.getMessage());
		}

	}

	/**
	 * this method is used to get CustomerIds With Name Whose BloddGroup Is
	 * ONegative And BloodPrice LessThan 6000
	 */
	private static void getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, String> listOfCustomerIds = list.stream()
					.filter(cus -> Optional.ofNullable(cus.getBloodGroup()).map(bg -> bg == BloodGroup.O_NEGATIE)
							.orElse(false) && Optional.ofNullable(cus.getBloodGroupPrice()).orElse(NULL) < SIX_THOUSAND)
					.collect(Collectors.toMap(cus -> Optional.ofNullable(cus.getCustomerId()).orElse(OTHER),
							cus -> Optional.ofNullable(cus.getName()).orElse(UNKNOWN), (x, y) -> x + " , " + y,
							LinkedHashMap::new));
			System.out.println("getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000============");
			listOfCustomerIds.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 "
					+ e.getMessage());
		}

	}

	/**
	 * this method is used to get CustomerIds Whose Blood Group Is ONegative And
	 * Blood Price LessThan 6000
	 */
	private static void getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<Integer> listOfCustomerIds = list.stream().filter(
					cus -> Optional.ofNullable(cus.getBloodGroup()).orElse(BloodGroup.UNKNOWN) == BloodGroup.O_NEGATIE
							&& Optional.ofNullable(cus.getBloodGroupPrice()).orElse(NULL) < SIX_THOUSAND)
					.map(cus -> Optional.ofNullable(cus.getCustomerId()).orElse(OTHER)).collect(Collectors.toList());
			System.out.println("getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
			listOfCustomerIds.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(
					" error at getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 " + e.getMessage());
		}
	}

	/**
	 * this method is used to get Customer Names Who Is Admin And His Salary
	 * GreaterThan 6000
	 */
	private static void getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfNames = list.stream()
					.filter(customer -> Optional.ofNullable(customer.getSalary()).orElse(NULL) > SIX_THOUSAND
							&& Optional.ofNullable(customer.isAdmin()).orElse(false))
					.map(customer -> Optional.ofNullable(customer.getName()).orElse(UNKNOWN))
					.collect(Collectors.toList());
			System.out.println("getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000===========");
			listOfNames.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000 " + e.getMessage());
		}

	}

	/**
	 * this method is used to get Customer Id Whose Salary GreaterThan 3000
	 */
	private static void getCustomerIdWhoseSalaryGreaterThan3000() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			System.out.println("getCustomerIdWhoseSalaryGreaterThan3000==============");
			list.stream().filter(customer -> Optional.ofNullable(customer.getSalary()).orElse(NULL) > THREE_THOUSAND)
					.map(customer -> Optional.ofNullable(customer.getCustomerId()).orElse(OTHER))
					.collect(Collectors.toList()).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdWhoseSalaryGreaterThan3000 " + e.getMessage());
		}

	}

	/**
	 * this method is used to get different customer names from database
	 */
	private static void getDifferentCustomerNames() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfCustomers = list.stream()
					.map(customer -> Optional.ofNullable(customer.getName()).orElse(UNKNOWN)).distinct()
					.collect(Collectors.toList());
			System.out.println("getDifferentCustomerNames============");
			listOfCustomers.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getDifferentCustomerNames " + e.getMessage());
		}
	}

	/**
	 * this method is used to get different customer salaries
	 */
	private static void getDifferentCustomerSalaries() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<Integer> listOfSalaries = list.stream()
					.map(customer -> Optional.ofNullable(customer.getSalary()).orElse(NULL)).distinct()
					.collect(Collectors.toList());
			System.out.println("getDifferentCustomerSalaries==========");
			listOfSalaries.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getDifferentCustomerSalaries " + e.getMessage());
		}
	}

	/**
	 * this method is used to Get customer salaries after increasing every salary by
	 * 10k applying method reference
	 */
	private static void getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<Integer> listOfSalaries = list.stream()
					.map(customer -> Optional.ofNullable(customer.getSalary()).orElse(NULL) + INCREMENT_SALARY_BY_10000)
					.collect(Collectors.toList());
			System.out.println("getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference=========");
			listOfSalaries.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference "
					+ e.getMessage());
		}
	}

	/**
	 * this method is used to Get customers whose experience is > 1 year, get max 3
	 * customers.
	 */
	private static void getCustomersWhoseExperienceIsGreaterthan1Year() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfCustomers = list.stream().filter(customer -> getExperience(customer) > 1).limit(3)
					.map(customer -> Optional.ofNullable(customer.getName()).orElse(UNKNOWN) + " having experience - "
							+ getExperience(customer))
					.collect(Collectors.toList());
			System.out.println("getCustomersWhoseExperienceIsGreaterthan1Year=========");
			listOfCustomers.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("eror at getCustomersWhoseExperienceIsGreaterthan1Year " + e.getMessage());
		}
	}

	/**
	 * @param c
	 * @return this is used in this getCustomersWhoseExperienceIsGreaterthan1Year
	 *         method to let the experience of customer
	 */
	private static int getExperience(Customer c) {
		int exp = 0;
		try {
			LocalDateTime joiningDate = Optional.ofNullable(c.getJoiningDate()).orElse(LocalDateTime.now());
			LocalDateTime today = LocalDateTime.now();
			exp = (int) ChronoUnit.YEARS.between(joiningDate, today);
			return exp;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error in getExperience " + e.getMessage());
		}
		return exp;
	}

	/**
	 * this method is used to Get first customer name whose salary is greater than
	 * 1000
	 */
	private static void getFirstCustomerNameWhoseSalaryGreaterthan1000() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Optional<String> firstCustomerName = list.stream()
					.filter(customer -> Optional.ofNullable(customer.getSalary()).orElse(NULL) > THOUSAND)
					.map(customer -> Optional.ofNullable(customer.getName()).orElse(UNKNOWN)).findFirst();
			System.out.println("getFirstCustomerNameWhoseSalaryGreaterthan1000=============");
			System.out.println(firstCustomerName.orElse("No customer found with salary > 1000"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getFirstCustomerNameWhoseSalaryGreaterthan1000 " + e.getMessage());
		}
	}

	/**
	 * this method is used to get CustomerId And their Salary
	 */
	private static void getCustomerIdAndthierSalary() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, Integer> map = list.stream()
					.collect(Collectors.toMap(cus -> Optional.ofNullable(cus.getCustomerId()).orElse(NULL),
							cus -> Optional.ofNullable(cus.getSalary()).orElse(NULL)));
			System.out.println("getCustomerIdAndthierSalary=============");
			map.forEach((id, salary) -> System.out.println(id + " - " + salary));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndthierSalary " + e.getMessage());
		}
	}

	/**
	 * apply sorting based on key and get customer id and thier salary
	 */
	private static void getCustomerIdAndSalaryAndApplySortingBasedOnKey() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, Integer> customerIdAndSalary = list.stream()
					.collect(Collectors.toMap(cus -> Optional.ofNullable(cus.getCustomerId()).orElse(0),
							cus -> Optional.ofNullable(cus.getSalary()).orElse(0)));
			System.out.println("getCustomerIdAndSalaryAndApplySortingBasedOnKey====");
			customerIdAndSalary.entrySet().stream().sorted(Map.Entry.comparingByKey())
					.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndSalaryAndApplySortingBasedOnKey " + e.getMessage());
		}

	}

	/**
	 * apply sorting based on value and get customer id and thier salary
	 */
	private static void getCustomerIdAndSalaryAndApplySortingBasedOnValue() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, Integer> customerIdAndSalary = list.stream()
					.collect(Collectors.toMap(cus -> Optional.ofNullable(cus.getCustomerId()).orElse(NULL),
							cus -> Optional.ofNullable(cus.getSalary()).orElse(NULL)));
			System.out.println("getCustomerIdAndSalaryAndApplySortingBasedOnValue======");
			customerIdAndSalary.entrySet().stream().sorted(Map.Entry.comparingByValue())
					.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndSalaryAndApplySortingBasedOnValue " + e.getMessage());
		}

	}

	/**
	 * apply sorting based on name and get customer id and thier salary
	 */
	private static void getCustomerIdAndSalaryAndApplySortingBasedOnName() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Comparator<Customer> sortByName = Comparator
					.comparing(customer -> Optional.ofNullable(customer.getName()).orElse(EMPTY));
			list.sort(sortByName);
			System.out.println("getCustomerIdAndNameAndApplySortingBasedOnName======");
			list.forEach(cus -> {
				String name = Optional.ofNullable(cus.getName()).orElse("Unknown Name");
				Integer id = Optional.ofNullable(cus.getCustomerId()).orElse(NULL);
				Integer salary = Optional.ofNullable(cus.getSalary()).orElse(NULL);
				System.out.println(name + " - " + id + " - " + salary);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndSalaryAndApplySortingBasedOnName " + e.getMessage());
		}
	}

	/**
	 *  To calculate customer experience based on joining date and today’s date using Java 8 LocalDateTime
	 */
	private static void calculateCustomerExperienceBasedOnJoiningDateAndTodaysDate() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			System.out.println("Calculate employee experience based on joining date and today’s date=============");
			list.forEach(customer -> {
				Optional<LocalDateTime> optionalJoiningDate = Optional.ofNullable(customer.getJoiningDate());
				String exp = optionalJoiningDate.map(joiningDate -> {
					LocalDateTime today = LocalDateTime.now();
					long years = ChronoUnit.YEARS.between(joiningDate, today);
					joiningDate = joiningDate.plusYears(years);
					long months = ChronoUnit.MONTHS.between(joiningDate, today);
					joiningDate = joiningDate.plusMonths(months);
					long days = ChronoUnit.DAYS.between(joiningDate, today);
					return years + "years " + months + " months " + days;
				}).orElse("joining date not available");
				System.out.println("Customer ID: " + customer.getCustomerId() + " => Experience: " + exp);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at calculateCustomerExperienceBasedOnJoiningDateAndTodaysDate " + e.getMessage());
		}

	}

	/**
	 * To get customer joining date and display in the form of 2024-06-28 06:55:234
	 */
	private static void getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			System.out.println("Get customer joining date and display in the form of 2024-06-28 06:55:234 ===============");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ssS");
			System.out.println();
			list.forEach(customer -> {
				Optional<LocalDateTime> optionalDate = Optional.ofNullable(customer.getJoiningDate());
				String formattedDate = optionalDate.map(date -> date.format(dtf)).orElse("joining date not available");
				System.out.println(customer.getJoiningDate() + " => " + formattedDate);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("error at getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional " + e.getMessage());
		}

	}

	/**
	 * To get customer joining date and display in the form of 2024-June-28 06:55:234
	 */
	private static void getCustomerJoiningDateAndDisplayInRequiredForm2() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			System.out.println("Get customer joining date and display in the form of 2024-June-28 06:55:234 ==============");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MMMM-dd HH:mm:ssS");
			list.forEach(customer -> {
				Optional<LocalDateTime> optionalDate = Optional.ofNullable(customer.getJoiningDate());
				String formattedDate = optionalDate.map(date -> date.format(dtf)).orElse("joining date not available");
				System.out.println(customer.getJoiningDate() + " => " + formattedDate);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("error at getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional " + e.getMessage());
		}

	}

	/**
	 * Get customer joining date and display in the form of 28-June-2024 06:55:234
	 */
	private static void getCustomerJoiningDateAndDisplayInRequiredForm3() {
		try {
			List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			System.out.println(" Get customer joining date and display in the form of 28-June-2024 06:55:234 =========");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-YYYY HH:mm:ssS");
			list.forEach(customer -> {
				Optional<LocalDateTime> optionalDate = Optional.ofNullable(customer.getJoiningDate());
				String formattedDate = optionalDate.map(date -> date.format(dtf)).orElse("joining date not available");
				System.out.println(customer.getJoiningDate() + " => " + formattedDate);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("error at getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional " + e.getMessage());
		}

	}

	/**
	 * If you have array of integers and array of strings, how to apply parallel
	 * sorting.
	 */
	private static void ParallelSorting() {
		try {
			int[] intArray = { 74, 24, 98, -9, 45 };
			String[] strArray = { "Delhi", "Mumbai", "Chennai", "Bangalore", "Kolkata" };
			System.out.println("Parallel sorting on integer of arrays ");
			Arrays.parallelSort(intArray);
			Arrays.stream(intArray).forEach(System.out::println);
			System.out.println("Parallel sorting on integer of strings ");
			Arrays.parallelSort(strArray);
			Arrays.stream(strArray).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at ParallelSortingOnIntegersAndStrings " + e.getMessage());
		}

	}

}
