package com.collections.comparable;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningDate;

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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Employee(int id, String name, double salary, LocalDate joininDate) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningDate = joininDate;
	}

	@Override
	public int compareTo(Employee e) {
		if (id== e.id) {
			return 0;
		}
		else if (id > e.id) {
			return 1;
		}
		else {
			return -1;
		}
	}

}