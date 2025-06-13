package com.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyUnmodifiableList {

	public static void main(String[] args) {

		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		List<String> listNames = list.stream().filter(emp -> emp.getAge() > 18).map(Employee::getName)
				.collect(Collectors.toUnmodifiableList());

		listNames.add("aa");
	}

}
