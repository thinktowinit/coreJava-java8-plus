package com.util.story2.java;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;  // <--- ADD THIS
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Doctor {

	private int id;
	private String name;
	private int salary;
	private String gender;
	private boolean isAdmin;
	private String bloodGroup;
	private int bloodGroupPrice;
	private int age;
	private int experience;
	  private LocalDate joiningDate; 
	private List<String> frindNames;
	 // private LocalDate joiningDate;

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
	public int getExperience() {
	    return experience;
	}

	public void setExperience(int experience) {
	    this.experience = experience;
	}

	public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getFormattedJoiningDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss.SSS");
        Optional<LocalDate> optionalJoiningDate = Optional.ofNullable(this.joiningDate);
        LocalTime fixedTime = LocalTime.of(6, 55, 23, 234_000_000);
        return optionalJoiningDate
                .map(date -> LocalDateTime.of(date, fixedTime).format(formatter))
                .orElse("Joining date not available");
    }

    public String getFormattedJoiningDateTimeFixed() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss.SSS");
        Optional<LocalDate> optionalJoiningDate = Optional.ofNullable(this.joiningDate);
        LocalTime fixedTime = LocalTime.of(6, 55, 23, 234_000_000);

        return optionalJoiningDate
                .map(date -> LocalDateTime.of(date, fixedTime).format(formatter))
                .orElse("Joining date not available");
    }
}

