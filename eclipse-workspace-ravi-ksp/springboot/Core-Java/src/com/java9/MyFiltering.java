package com.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyFiltering {

	public static void main(String[] args) {
		List<Employee> empList = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		//get emp list for each gender wise and should eligible for voting
		
		//male, [emp1, emp2]
		//female, [emp1, emp2]

		Map<String, List<Employee>> map = empList.stream().filter(emp -> emp.getAge() > 18)
				.collect(Collectors.groupingBy(Employee::getGender));
		
		System.out.println("beforre java9=======");
		System.out.println(map);

		Map<String, List<Employee>> mapJava9 = empList.stream().collect(Collectors.groupingBy(Employee::getGender,
				Collectors.filtering(emp -> emp.getAge() > 18, Collectors.toList())));
		System.out.println("from java9======");
		System.out.println(mapJava9);
	}

}
