package com.employee;

import java.util.List;

//@getterssetters
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String gender;
	private boolean isAdmin;
	private String bloodGroup;
	private int bloodGroupPrice;
	private int age;
	private List<String> frindNames;
	
	

	public List<String> getFrindNames() {
		return frindNames;
	}

	public void setFrindNames(List<String> frindNames) {
		this.frindNames = frindNames;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getBloodGroupPrice() {
		return bloodGroupPrice;
	}

	public void setBloodGroupPrice(int bloodGroupPrice) {
		this.bloodGroupPrice = bloodGroupPrice;
	}

}
