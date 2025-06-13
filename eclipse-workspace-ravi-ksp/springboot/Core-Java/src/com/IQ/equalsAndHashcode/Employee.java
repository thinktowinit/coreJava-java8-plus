package com.IQ.equalsAndHashcode;

import java.util.Objects;

//@getterssetters
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String gender;
	private String aadharNumber;
	private boolean isAdmin;
	private int myHashCode;

	private String bloodGroup;
	private int bloodGroupPrice;

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
	
	

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	public int getMyHashCode() {
		return myHashCode;
	}

	public void setMyHashCode(int myHashCode) {
		this.myHashCode = myHashCode;
	}

	@Override
	public int hashCode() {
		return this.getMyHashCode();  //for compare 2 emp hashcode, I wrote own logic
	}
	
	

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(aadharNumber, other.aadharNumber) && Objects.equals(bloodGroup, other.bloodGroup)
//				&& bloodGroupPrice == other.bloodGroupPrice && Objects.equals(gender, other.gender) && id == other.id
//				&& isAdmin == other.isAdmin && Objects.equals(name, other.name) && salary == other.salary;
//	}


	Object ob = null;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(aadharNumber, other.aadharNumber);
	}
	
	
	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee();
		employee1.setAadharNumber("A1");
		employee1.setMyHashCode(1);
		
		
		Employee employee2 = new Employee();
		employee2.setMyHashCode(2);
		
		employee2.setAadharNumber("A2");
		Employee employee3 = employee2;  //same address
		System.out.println(employee2+"===="+employee3);
		System.out.println("employee3 aadhar number before set to emp3 = "+employee3.getAadharNumber());
		
		
		
		employee3.setAadharNumber("A3");
		System.out.println("employee2 aadhar number after set to emp3 = "+employee2.getAadharNumber());
		System.out.println("employee3 aadhar number after set to emp3 = "+employee2.getAadharNumber());
		
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		
		//case-1//if 2 emp hae diff hash code
		if(CompareEmployees.compare(employee1, employee3)) {
			System.out.println("emp 1 nd emp 3 equals");
		}else {
			System.out.println("emp 1 nd emp 3 not equals, y bcz 2 are diff hash codes, so directly return false, no need to check equals method");
		}
		
		//case-2//if 2 emp hae same hash code and same data
		if(CompareEmployees.compare(employee2, employee3)) {
			System.out.println("emp 2 nd emp 3 equals, , y bcz 2 are same hash codesn and same data");
		}else {
			System.out.println("emp 2 nd emp 3 not equals");
		}
		
		Employee employee4 = new Employee();
		employee4.setMyHashCode(1); //setting for check if same hash code
		employee4.setAadharNumber("A4");
		
		//case-3//if 2 emp hae same hash code, but different data
		if(CompareEmployees.compare(employee1, employee4)) {
			System.out.println("employee1 and employee4 are equal");
		}else {
			System.out.println("employee1 and employee4 are not equal, y bcz 2 are same hash codes but DIFFRENT data");
		}
		
	}


}
