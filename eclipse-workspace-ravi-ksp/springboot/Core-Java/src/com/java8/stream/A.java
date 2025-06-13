package com.java8.stream;

import java.util.ArrayList;
import java.util.List;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class A {

	public static void main(String[] args) {

		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
		int count = 0;
		for (Employee employee : list) {

			if (employee.getName().length() < 7) {
				count++;
			}

		}
		System.out.println(count);
		long countUsingStream = list.stream().filter(employee -> employee.getName().length()<7).count();
		System.out.println(countUsingStream);
	}
	
	
	

}
