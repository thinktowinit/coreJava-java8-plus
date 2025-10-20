package com.entity;

import java.time.LocalDate;

public class Worker {
	private int id;
	private String name;
	private String gender;
	private int age;
	private Double salary;
	private String bloodGroup;
	private String role;
	private int bloodGroupPrice;
	private boolean isAdmin;
	private int experience;
	private LocalDate joinDate ;
	
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getBloodGroupPrice() {
		return bloodGroupPrice;
	}
	public void setBloodGroupPrice(int bloodGroupPrice) {
		this.bloodGroupPrice = bloodGroupPrice;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	//this code for getThreeWorkersExperienceIsGraterthanOneYear please explain
	@Override
	public String toString() {
	    return "Worker{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", gender='" + gender + '\'' +
	            ", age=" + age +
	            ", salary=" + salary +
	            ", bloodGroup='" + bloodGroup + '\'' +
	            ", role='" + role + '\'' +
	            ", bloodGroupPrice=" + bloodGroupPrice +
	            ", isAdmin=" + isAdmin +
	            ", experience=" + experience +
	            '}';
	}

	
		
	
}
