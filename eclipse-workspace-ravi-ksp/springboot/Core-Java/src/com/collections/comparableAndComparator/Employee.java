package com.collections.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Using comparable we can comparing employee objects
public class Employee implements Comparable<Employee> {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee employee) {
		// TODO Auto-generated method stub

		if (id > employee.getId()) {
			return 1;
		} else if (id < employee.getId()) {
			return -1;
		}
		return 0; // if equals
	}

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(5);
		Employee employee2 = new Employee();
		employee2.setId(3);
		Employee employee3 = new Employee();
		employee3.setId(15);

		List<Employee> list = new ArrayList<>();

		list.add(employee3);
		list.add(employee2);
		list.add(employee);

		list.forEach(box -> System.out.println(box.getId()));

		Collections.sort(list); //only compared basedd id
		System.out.println("after sorting=============");
		list.forEach(box -> System.out.println(box.getId()));

	}

}
