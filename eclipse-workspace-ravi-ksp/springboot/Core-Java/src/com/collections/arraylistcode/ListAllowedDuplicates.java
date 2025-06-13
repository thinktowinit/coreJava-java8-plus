package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.List;

import com.employee.Employee;

public class ListAllowedDuplicates {

	public static void main(String[] args) {
		List listBox = new ArrayList<>(); // 0
		List<Employee> listOfEMployeesFromDataBase = MyDataBaseUtil.getListOfEmployees(listBox); // 4
		List<Employee> listOfEMployees1 = listOfEMployeesFromDataBase; // 4
		List<Employee> listOfEMployees2 = listOfEMployeesFromDataBase; // 4
		List<Employee> listOfEMployees3 = listOfEMployeesFromDataBase; // 4
		List<Employee> listOfEMployees4 = listOfEMployeesFromDataBase; // 4
		List<Employee> listOfEMployees5 = listOfEMployeesFromDataBase;// 4
		System.out.println(listOfEMployees1.size()); // 4
		List finalList = new ArrayList<>();// 0
		finalList.addAll(listOfEMployees1);// 4
		finalList.addAll(listOfEMployees2);// 8
		finalList.addAll(listOfEMployees3);// 12
		finalList.addAll(listOfEMployees4);// 16
		finalList.addAll(listOfEMployees5);// 20

		System.out.println("list allowed duplicates ==> " + finalList.size()); // 8

	}

}
