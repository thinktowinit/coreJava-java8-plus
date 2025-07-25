package com.java8.mainclasses;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseCustomerUtil;
import com.entity.Customer;

public class Java8CustomerTasks {

	private static final int THOUSAND = 1000;
	private static final int INCREMENT_SALARY_BY_10000 = 10000;

	public static void main(String[] args) {
		List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
		getDifferentCustomerNames();
		getDifferentCustomerSalaries();
		getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference();
		getCustomersWhoseExperienceIsGreaterthan1Year();
		getFirstCustomerNameWhoseSalaryGreaterthan1000();
		getCustomerIdAndthierSalary();
		getCustomerIdAndSalaryAndApplySortingBasedOnKey();
		getCustomerIdAndSalaryAndApplySortingBasedOnValue();
		getCustomerIdAndSalaryAndApplySortingBasedOnName();
//		calculateCustomerExperienceBasedOnJoiningDateAndTodaysDate();
//		getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional();
//		getCustomerJoiningDateAndDisplayInRequiredForm2();
//		getCustomerJoiningDateAndDisplayInRequiredForm3();
//		doParallelSortingOnIntegers();
//		doParallelSortingOnStrings();
	}

	/**
	 * this method is used to get different customer names from database
	 */
	private static void getDifferentCustomerNames() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfCustomers=list.stream().map(customer->customer.getName())
					.collect(Collectors.toList());
			System.out.println("getDifferentCustomerNames============");
			listOfCustomers.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getDifferentCustomerNames "+e.getMessage());
		}
	}

	/**
	 * this method is used to get different customer salaries
	 */
	private static void getDifferentCustomerSalaries() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<Integer> listOfSalaries=list.stream().map(customer->customer.getSalary())
					.collect(Collectors.toList());
			System.out.println("getDifferentCustomerSalaries==========");
			listOfSalaries.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getDifferentCustomerSalaries "+e.getMessage());
		}
	}

	/**
	 * this method is used to Get customer salaries after increasing every salary by 10k applying method reference
	 */
	private static void getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<Integer> listOfSalaries=list.stream().map(customer->customer.getSalary()+INCREMENT_SALARY_BY_10000)
					.collect(Collectors.toList());
			System.out.println("getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference=========");
			listOfSalaries.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference "+e.getMessage());
		}
	}

	/**
	 * this method is used to Get customers whose experience is > 1 year, get max 3 customers.
	 */
	private static void getCustomersWhoseExperienceIsGreaterthan1Year() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());		
			List<String> listOfCustomers=list.stream().filter(customer->getExperience(customer)>1).limit(3)
					.map(customer->customer.getName()+" having experience - "+getExperience(customer))
					.collect(Collectors.toList());
			System.out.println("getCustomersWhoseExperienceIsGreaterthan1Year=========");
			listOfCustomers.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("eror at getCustomersWhoseExperienceIsGreaterthan1Year "+e.getMessage());
		}
	}
	
	/**
	 * @param c
	 * @return
	 * this is used in this getCustomersWhoseExperienceIsGreaterthan1Year method to let the experience of customer
	 */
	private static int getExperience(Customer c) {
		int exp=0;
		try {
			LocalDateTime joiningDate=c.getJoiningDate();
			LocalDateTime today=LocalDateTime.now();
			exp=(int)ChronoUnit.YEARS.between(joiningDate, today);
			return exp;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error in getExperience "+e.getMessage());
		}
		return exp;	
	}

	/**
	 * this method is used to Get first customer name whose salary is greater than 1000
	 */
	private static void getFirstCustomerNameWhoseSalaryGreaterthan1000() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfCustomers=list.stream().filter(customer->customer.getSalary()>THOUSAND)
					.map(c->c.getName()).collect(Collectors.toList());
			System.out.println("getFirstCustomerNameWhoseSalaryGreaterthan1000=============\n"+listOfCustomers.get(0));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getFirstCustomerNameWhoseSalaryGreaterthan1000 "+e.getMessage());
		}	
	}

	/**
	 * this method is used to get CustomerId And their Salary
	 */
	private static void getCustomerIdAndthierSalary() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, Integer> map = list.stream()
				    .collect(Collectors.toMap(Customer::getCustomerId, Customer::getSalary));
			System.out.println("getCustomerIdAndthierSalary=============");
			map.forEach((id, salary) -> System.out.println(id + " - " + salary));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndthierSalary "+e.getMessage());
		}
	}

	/**
	 * apply sorting based on key and get customer id and thier salary
	 */
	private static void getCustomerIdAndSalaryAndApplySortingBasedOnKey() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, Integer> customerIdAndSalary=list.stream().collect(Collectors.toMap(Customer::getCustomerId, Customer::getSalary));
			System.out.println("getCustomerIdAndSalaryAndApplySortingBasedOnKey====");
			customerIdAndSalary.entrySet().stream()
			    .sorted(Map.Entry.comparingByKey())
			    .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndSalaryAndApplySortingBasedOnKey "+e.getMessage());
		}
		
	}

	/**
	 * apply sorting based on value and get customer id and thier salary
	 */
	private static void getCustomerIdAndSalaryAndApplySortingBasedOnValue() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, Integer> customerIdAndSalary=list.stream().collect(Collectors.toMap(Customer::getCustomerId, Customer::getSalary));
			System.out.println("getCustomerIdAndSalaryAndApplySortingBasedOnValue======");
			customerIdAndSalary.entrySet().stream()
					.sorted(Map.Entry.comparingByValue()).forEach(entry->System.out.println(entry.getKey()+" - "+entry.getValue()));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndSalaryAndApplySortingBasedOnValue "+e.getMessage());
		}
		
	}

	/**
	 * apply sorting based on name and get customer id and thier salary
	 */
	private static void getCustomerIdAndSalaryAndApplySortingBasedOnName() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Comparator<Customer> sortByName=Comparator.comparing(Customer::getName);
			list.sort(sortByName);
			System.out.println("getCustomerIdAndNameAndApplySortingBasedOnName======");
			list.forEach(cus -> System.out.println(cus.getName()+" - "+cus.getCustomerId() + " - " + cus.getSalary()));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdAndSalaryAndApplySortingBasedOnName "+e.getMessage());
		}
	}

	private static void calculateCustomerExperienceBasedOnJoiningDateAndTodaysDate() {
		// TODO Auto-generated method stub
		
	}

	private static void getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional() {
		// TODO Auto-generated method stub
		
	}

	private static void getCustomerJoiningDateAndDisplayInRequiredForm2() {
		// TODO Auto-generated method stub
		
	}

	private static void getCustomerJoiningDateAndDisplayInRequiredForm3() {
		// TODO Auto-generated method stub
		
	}

	private static void doParallelSortingOnIntegers() {
		// TODO Auto-generated method stub
		
	}

	private static void doParallelSortingOnStrings() {
		// TODO Auto-generated method stub
		
	}

	
}
