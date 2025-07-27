package com.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseCustomerUtil;
import com.entity.Customer;
import com.enums.BloodGroup;

public class MyStreamWithFilterLimitMapOnCustomer {

	
	private static final int NAME_LENGTH = 6;

	/**
	 * @param args
	 * main method
	 */
	public static void main(String[] args) {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			getCustomerIdWhoseSalaryGreaterThan3000();
			getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000();
			getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
			getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
			getGenderWhoseNamesLenthGreaterThan6();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error in main method"+e.getMessage());
		}
	}

	/**
	 * this method is used to get Gender details Whose Names Length GreaterThan 6
	 */
	private static void getGenderWhoseNamesLenthGreaterThan6() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfGenders=list.stream().filter(customer -> customer.getName().length()>NAME_LENGTH)
													.map(customer->customer.getName()+" - "+customer.getGender())
													.collect(Collectors.toList());
			System.out.println("getGenderWhoseNamesLenthGreaterThan6==========");
			listOfGenders.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getGenderWhoseNamesLenthGreaterThan6 "+e.getMessage());
		}
		
	}

	/**
	 * this method is used to get CustomerIds With Name Whose BloddGroup Is ONegative And BloodPrice LessThan 6000
	 */
	private static void getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			Map<Integer, String> listOfCustomerIds=list.stream().filter(cus->(cus.getBloodGroup()== BloodGroup.O_NEGATIE && cus.getBloodGroupPrice()<6000))
					.collect(Collectors.toMap(Customer::getCustomerId, Customer::getName, (x,y)->x+" , "+y, LinkedHashMap::new));
			System.out.println("getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000============");
			listOfCustomerIds.forEach((key,value)->System.out.println("id= " + key + ", name= " + value));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 "+e.getMessage());
		}
		
	}

	/**
	 * this method is used to get CustomerIds Whose Blood Group Is ONegative And Blood Price LessThan 6000
	 */
	private static void getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<Integer> listOfCustomerIds=list.stream().filter(cus->(cus.getBloodGroup()== BloodGroup.O_NEGATIE  && cus.getBloodGroupPrice()<6000))
					.map(cus->cus.getCustomerId()).collect(Collectors.toList());
			System.out.println("getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
			listOfCustomerIds.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" error at getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 "+e.getMessage());
		}
	}

	/**
	 * this method is used to get Customer Names Who Is Admin And His Salary GreaterThan 6000
	 */
	private static void getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			List<String> listOfNames=list.stream().filter(customer -> (customer.getSalary()>6000 && customer.isAdmin()))
					.map(customer->customer.getName())
					.collect(Collectors.toList());
			System.out.println("getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000===========");
			listOfNames.forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000 "+e.getMessage());
		}
		
	}

	/**
	 * this method is used to get Customer Id Whose Salary GreaterThan 3000
	 */
	private static void getCustomerIdWhoseSalaryGreaterThan3000() {
		try {
			List<Customer> list=MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
			System.out.println("getCustomerIdWhoseSalaryGreaterThan3000==============");
			list.stream().filter(customer -> customer.getSalary()>3000)
			.map(customer -> customer.getCustomerId())
			.collect(Collectors.toList())
			.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error at getCustomerIdWhoseSalaryGreaterThan3000 "+e.getMessage());
		}
		
	}

}
