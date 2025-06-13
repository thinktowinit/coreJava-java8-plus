package com.collections.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class A {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
		al.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
		al.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
		Collections.sort(al);
		for (Employee se : al) {
			System.out.println(se.getId() + " " + se.getName() + " " + se.getJoiningDate());
		}
	}

}
