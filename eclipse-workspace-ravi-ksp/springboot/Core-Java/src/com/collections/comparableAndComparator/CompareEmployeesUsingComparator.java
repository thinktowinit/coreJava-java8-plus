package com.collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareEmployeesUsingComparator {

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

		List<Employee> list = new ArrayList<>();

		list.add(employee3);
		list.add(employee2);
		list.add(employee1);

		Collections.sort(list, new EmployeeIdComparision());

		list.forEach(box -> System.out.println(box.getId() + ", " + box.getName()));
		System.out.println("============below is name comparision");
		Collections.sort(list, new EmployeeNameComparision());

		list.forEach(box -> System.out.println(box.getId() + ", " + box.getName()));

	}

}
