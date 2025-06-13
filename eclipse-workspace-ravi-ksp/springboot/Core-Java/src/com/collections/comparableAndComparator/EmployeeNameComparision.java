package com.collections.comparableAndComparator;

import java.util.Comparator;

public class EmployeeNameComparision implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		return employee1.getName().compareToIgnoreCase(employee2.getName());
	}

}
