package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

import com.collections.comparableAndComparator.Employee;

public class MyComparatorUsingJava8 {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setId(5);
		employee1.setName("b");
		Employee employee2 = new Employee();
		employee2.setId(3);
		employee2.setName("c");
		Employee employee3 = new Employee();
		employee3.setId(15);
		employee3.setName("a");

		List<Employee> listEmployee = new ArrayList<>();

		listEmployee.add(employee3);
		listEmployee.add(employee2);
		listEmployee.add(employee1);

		listEmployee.sort((emp1, emp2) -> emp1.getName().compareTo(emp2.getName())); // b, c = //b//c

		listEmployee.stream().forEach(emp -> System.out.println(emp.getName()));
		System.out.println("=====================");
		listEmployee.sort((emp1, emp2) -> emp1.getId() - emp2.getId()); // b, c = //b//c

		listEmployee.stream().forEach(emp -> System.out.println(emp.getId()));

	}

}
