package com.java8.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyPredicate {

	public static void main(String[] args) {

		List<MyOffice> listOfOffices = getListOfOffices();

		Predicate<Employee> p1 = employee -> employee.getName().startsWith("A");
		Predicate<Employee> p2 = employee -> employee.getAge() < 40;
		Predicate<Employee> p3 = employee -> employee.getAge() < 40 && employee.getName().startsWith("P");
		Predicate<Employee> p4 = employee -> employee.getName().startsWith("K");

		List<Employee> listStartWithEmployeeNameA = listOfOffices.stream()
				.filter(singleOffice -> singleOffice.getListOfEmployees().stream().anyMatch(p1))
				.flatMap(singleOffice -> singleOffice.getListOfEmployees().stream()).filter(p1)
				.collect(Collectors.toList());

		List<Employee> listEmpLessThan40 = listOfOffices.stream()
				.filter(singleOffice -> singleOffice.getListOfEmployees().stream().anyMatch(p2))
				.flatMap(singleOffice -> singleOffice.getListOfEmployees().stream()).filter(p2)
				.collect(Collectors.toList());

		listStartWithEmployeeNameA.stream().forEach(emp -> System.out.println(emp.getName()));
		System.out.println("============");
		listEmpLessThan40.stream().forEach(emp -> System.out.println(emp.getName()));
	}

	private static List<MyOffice> getListOfOffices() {
		MyOffice myOffice = new MyOffice();

		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		myOffice.setListOfEmployees(list);

		List<MyOffice> list2 = new ArrayList<>();
		list2.add(myOffice);
		return list2;
	}

}
