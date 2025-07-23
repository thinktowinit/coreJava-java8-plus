package com.java8.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyStreamWithFilterLimitMap {
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
		System.out.println("getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees=============>");
		List<String> listOfEmpNames = list.stream().filter(employee -> employee.getSalary() % 3 == 0).limit(3)
				.map(emp -> emp.getName()).collect(Collectors.toList());
		listOfEmpNames.forEach(System.out::println);
	}
	
	
	public static List<Integer> getEmpIdWhoseSalaryGreaterThan3000method2(List<Employee> list) {
		
		List<Integer> listOfEmpIds = list.stream().filter(emp -> emp.getSalary() > 3000).map(emp -> emp.getId())
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
		.filter(emp -> emp.getSalary() > 3000)
		.map(emp -> emp.getId()).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	private static void getGenderWhoseNamesLenthGreaterThan6() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
		List<String> listOfGenders = list.stream().filter(emp -> emp.getName().length() > 6).map(emp -> emp.getGender())
				.collect(Collectors.toList());
		System.out.println("getGenderWhoseNamesLenthGreaterThan6==========");
		listOfGenders.forEach(System.out::println);

	}

	private static void getEmpNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
		// if(x>10 && x%2==0) //x=20 // 2)20(10 //reminder = 0

		List<String> listOfNames = list.stream().filter(emp -> (emp.getSalary() > 6000 && emp.isAdmin()))
				.map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println("getEmpNamesWhoIsAdminAndHIsSalaryGreaterThan6000===========");
		listOfNames.forEach(System.out::println);

	}

	private static void getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		List<Integer> listOfEmpIds = list
				.stream().filter(emp -> (emp.getBloodGroup() != null
						&& "ONegative".equalsIgnoreCase(emp.getBloodGroup()) && emp.getBloodGroupPrice() < 6000))
				.map(emp -> emp.getId()).collect(Collectors.toList());
		System.out.println("getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
		listOfEmpIds.forEach(System.out::println);

	}


	private static void getEmpIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		Map<Integer, String> listOfEmpIdWithNames = list.stream()
				.filter(emp -> (emp.getBloodGroup() != null && "ONegative".equalsIgnoreCase(emp.getBloodGroup())
						&& emp.getBloodGroupPrice() < 6000))
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

