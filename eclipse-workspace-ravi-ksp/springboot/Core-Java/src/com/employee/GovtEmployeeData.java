package com.employee;

import com.constants.CoreJavaConstants;
import com.enums.BloodGroup;
import com.enums.Gender;

public class GovtEmployeeData {
	
	
public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setGender("Male");  //""   hot code value //2 //M
		employee.setBloodGroup("o negatie");
		//saved in db//above values from angular/html/client
		
		//get from db
		Employee employeeFromDb = employee;
		
		if(employeeFromDb.getGender().equalsIgnoreCase(Gender.M.type)) {
			System.out.println("employee is male");
		}else {
			System.out.println("employee is not male");
		}
		
		if(employee.getBloodGroup().equals(BloodGroup.O_NEGATIE.bloodGroup)) {
			employee.setBloodGroupPrice(BloodGroup.O_NEGATIE.price);
		}
		if(employee.getBloodGroup().equals("o possitie")) {
			employee.setBloodGroupPrice(1000);
		}
		
		
	}

}
