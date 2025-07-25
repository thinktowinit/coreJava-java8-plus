package com.java8.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.constants.CoreJavaConstants;
import com.employee.Employee;

public class MyStreamWithFilterLimitMap {

	private static final String GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN6000 = "getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========";
	private static final String GET_EMP_NAMES_WHO_IS_ADMIN_AND_H_IS_SALARY_GREATER_THAN6000 = "getEmpNamesWhoIsAdminAndHIsSalaryGreaterThan6000===========";
	private static final int salary_thresholdd = 6000;
	private static final String GENDER_NAME_LENGTH_LOG = "getGenderWhoseNamesLenthGreaterThan6==========";
	private static final int SALARY_DIVISOR = 3;
	private static final int MAX_EMPLOYEES = 3;
	private static final int salary_threshold = 3000;
	private static final String getlistofnames = "getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees=============>";
	private static final String O_NEGATIVE = "ONegative";


//get emp names whose salary divided by with 3 and get maximun 3 employees

	public static void main(String[] args) {

		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees(list);
		getEmpIdWhoseSalaryGreaterThan3000();
		getGenderWhoseNamesLenthGreaterThan6();
		getEmpNamesWhoIsAdminAndHisSalaryGreaterThan6000();
		getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getEmpIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		
		getEmpIdWhoseSalaryGreaterThan3000method2(list);
		
		

	}

	private static void getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees(List<Employee> list) {
		System.out.println(getlistofnames);
		List<String> listOfEmpNames = list.stream().filter(employee -> employee.getSalary() % SALARY_DIVISOR == 0).limit(MAX_EMPLOYEES)
				.map(emp -> emp.getName()).collect(Collectors.toList());
		listOfEmpNames.forEach(System.out::println);
	}
	
	
	public static List<Integer> getEmpIdWhoseSalaryGreaterThan3000method2(List<Employee> list) {
		
		List<Integer> listOfEmpIds = list.stream().filter(emp -> emp.getSalary() > salary_threshold).map(emp -> emp.getId())
				.collect(Collectors.toList());
		return listOfEmpIds;
	}

	private static void getEmpIdWhoseSalaryGreaterThan3000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

//		List<Integer> listOfIds = list.stream().filter(emp -> emp.getSalary() > 3000).map(emp -> emp.getId())
//				.collect(Collectors.toList());
//
//		listOfIds.forEach(System.out::println);

		// if not used listOfId's other places
		System.out.println("getEmpIdWhoseSalaryGreaterThan3000============");
		list.stream()
		.filter(emp -> emp.getSalary() > salary_threshold)
		.map(emp -> emp.getId()).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	/**
	 * 
	 * Get gender deatils whose names length greater than 6
	 */
	private static void getGenderWhoseNamesLenthGreaterThan6() {
		// TODO Auto-generated method stub
		
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
			List<String> listOfGenders = list.stream().filter(emp -> emp.getName().length() > CoreJavaConstants.NAME_LENGTH).map(emp -> emp.getGender())
					.collect(Collectors.toList());
			System.out.println(GENDER_NAME_LENGTH_LOG);
			listOfGenders.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error at getGenderWhoseNamesLenthGreaterThan6 "+e.getMessage());
		}

	}

	private static void getEmpNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
		// if(x>10 && x%2==0) //x=20 // 2)20(10 //reminder = 0

		List<String> listOfNames = list.stream().filter(emp -> (emp.getSalary() > salary_thresholdd && emp.isAdmin()))
				.map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(GET_EMP_NAMES_WHO_IS_ADMIN_AND_H_IS_SALARY_GREATER_THAN6000);
		listOfNames.forEach(System.out::println);

	}

	private static void getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		List<Integer> listOfEmpIds = list
				.stream().filter(emp -> (emp.getBloodGroup() != null
						&& O_NEGATIVE.equalsIgnoreCase(emp.getBloodGroup()) && emp.getBloodGroupPrice() < salary_thresholdd))
				.map(emp -> emp.getId()).collect(Collectors.toList());
		System.out.println(GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN6000);
		listOfEmpIds.forEach(System.out::println);

	}


	private static void getEmpIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		Map<Integer, String> listOfEmpIdWithNames = list.stream()
				.filter(emp -> (emp.getBloodGroup() != null && CoreJavaConstants.O_NEGATIVE.equalsIgnoreCase(emp.getBloodGroup())
						&& emp.getBloodGroupPrice() < salary_thresholdd))
				.collect(Collectors.toMap(Employee::getId, Employee::getName, (x, y) -> x + ", " + y,
						LinkedHashMap::new));
//		
//		Map<Integer, String> listOfEmpIdWithNamesWithSalaries = list.stream()
//				.filter(emp -> (emp.getBloodGroup() != null && "ONegative".equalsIgnoreCase(emp.getBloodGroup())
//						&& emp.getBloodGroupPrice() < 6000))
//				.collect(Collectors.toMap(Employee :: getId, Employee::getName);
//		System.out.println("getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
////		listOfEmpIdWithNames.forEach(enterySet -> {
////			
////			System.out.println(enterySet.getKey()+","+entrySet.getValue());
////		});

		listOfEmpIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
		listOfEmpIdWithNames.forEach((key, value) -> System.out.println(key + ", " + value));

	}

}

