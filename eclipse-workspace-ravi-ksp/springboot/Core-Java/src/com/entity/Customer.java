package com.entity;

import java.util.List;

import com.enums.BloodGroup;

public class Customer {
	private int customerId;
	private String name;
    private int salary;      
    private String gender;
    private boolean isAdmin;       
    private BloodGroup bloodGroup;
    private int bloodGroupPrice; 
    private int age;
    private List<String> familyMembers;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BloodGroup oNegatie) {
		this.bloodGroup = oNegatie;
	}
	public int getBloodGroupPrice() {
		return bloodGroupPrice;
	}
	public void setBloodGroupPrice(int bloodGroupPrice) {
		this.bloodGroupPrice = bloodGroupPrice;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(List<String> familyMembers) {
		this.familyMembers = familyMembers;
	}
	
	 
    
	
}
