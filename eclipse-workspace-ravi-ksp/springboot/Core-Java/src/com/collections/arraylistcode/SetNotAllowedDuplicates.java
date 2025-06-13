package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.employee.Employee;

public class SetNotAllowedDuplicates {

	public static void main(String[] args) {
		List listBox = new ArrayList<>(); //0
		Set<Employee> setOfEMployees1 = MyDataBaseUtil.getSetOfEmployees(listBox); // 4

		Set<Employee> setOfEMployees3 = setOfEMployees1; //4
		System.out.println(setOfEMployees3.size()); // 4
		setOfEMployees1.addAll(setOfEMployees3); //4
		setOfEMployees1.addAll(setOfEMployees3);//4
		setOfEMployees1.addAll(setOfEMployees3);//4
		setOfEMployees1.addAll(setOfEMployees3);//4

		System.out.println("duplicates not allowed Set ==>" + setOfEMployees1.size()); // 4

	}

}
