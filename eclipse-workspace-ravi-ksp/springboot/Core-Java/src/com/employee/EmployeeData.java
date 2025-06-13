package com.employee;

import com.constants.CoreJavaConstants;
import com.enums.BloodGroup;
import com.enums.Gender;

public class EmployeeData {
	
	
	
	
	private static final String EMPLOYEE_IS_NOT_MALE = "employee is not male";
	private static final String EMPLOYEE_IS_MALE = "employee is male";

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setGender(CoreJavaConstants.MALE);  // M
		employee.setBloodGroup(BloodGroup.O_NEGATIE.bloodGroup);
		//saved in db
		
		//get from db
		Employee employeeFromDb = employee;
		
		if(employeeFromDb.getGender().equalsIgnoreCase(Gender.M.type)) {
			System.out.println(EMPLOYEE_IS_MALE);
		}else {
			System.out.println(EMPLOYEE_IS_NOT_MALE);
		}
		
		if(employee.getBloodGroup().equals(BloodGroup.O_NEGATIE.bloodGroup)) {
			employee.setBloodGroupPrice(BloodGroup.O_NEGATIE.price);
		}
		if(employee.getBloodGroup().equals("o possitie")) {
			employee.setBloodGroupPrice(1000);
		}
	}

}
