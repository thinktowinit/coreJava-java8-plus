package com.entity;

import java.util.List;

import com.enums.BloodGroup;

public class Farmer {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String village;
	private String mobileNumber;
	private String landArea; // Example: "5 Acres"
	private String landType; // Example: "Fertile", "Dry"
	private String cropType; // Example: "Paddy", "Wheat"
	private int yearlyIncome;  // i took like as a salary
	private boolean isLoanTaken;
	private double loanAmount;
	private String bankName;
	private String aadharNumber;
	private String rationCardNumber;
	private boolean isAdmin;
	private BloodGroup bloodGroup;// // Enum type instead of String
	private int bloodGroupPrice;
	private List<String> familyMembersNames;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLandArea() {
		return landArea;
	}

	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}

	public String getLandType() {
		return landType;
	}

	public void setLandType(String landType) {
		this.landType = landType;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public int getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(int yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
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

	public void setBloodGroup(BloodGroup string) {
		this.bloodGroup = string;
	}

	public int getBloodGroupPrice() {
		return bloodGroupPrice;
	}

	public void setBloodGroupPrice(int bloodGroupPrice) {
		this.bloodGroupPrice = bloodGroupPrice;
	}

	public boolean isLoanTaken() {
		return isLoanTaken;
	}

	public void setLoanTaken(boolean isLoanTaken) {
		this.isLoanTaken = isLoanTaken;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getRationCardNumber() {
		return rationCardNumber;
	}

	public void setRationCardNumber(String rationCardNumber) {
		this.rationCardNumber = rationCardNumber;
	}

	public List<String> getFamilyMembersNames() {
		return familyMembersNames;
	}

	public void setFamilyMembersNames(List<String> familyMembersNames) {
		this.familyMembersNames = familyMembersNames;
	}

	

	// if u need or You can add constructor, getters, setters as needed

}
