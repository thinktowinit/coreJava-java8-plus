package com.collections.comparableAndComparator;

import java.util.Comparator;

public class EmployeeIdComparision implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {
		// TODO Auto-generated method stub
		if (employee1.getId() > employee2.getId()) {
			return 1;
		} else if (employee1.getId() < employee2.getId()) {
			return -1;
		}
		return 0; // if equals
	}
	
	

}
