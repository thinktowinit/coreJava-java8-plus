package com.collections.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeNameCompartor implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e1.getName().compareTo(e2.getName());
	}

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
		al.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
		al.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
		al.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));

		Collections.sort(al, new EmployeeNameCompartor());

		for (Employee se : al) {
			System.out.println(se.getName() + ", " + se.getId() + ", " + se.getSalary() + ", " + se.getJoiningDate());
		}
	}

}
