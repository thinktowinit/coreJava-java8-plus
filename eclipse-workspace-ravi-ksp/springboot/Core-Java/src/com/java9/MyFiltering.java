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

		Map<String, List<Employee>> map = empList.stream().filter(emp -> emp.getAge() > 18)
				.collect(Collectors.groupingBy(Employee::getGender));
		
		Map<String, List<String>> mapNames = empList.stream()
			    .filter(emp -> emp.getAge() > 18)
			    .collect(Collectors.groupingBy(
			        Employee::getGender,                       // group by gender. key
			        Collectors.mapping(Employee::getName,      // collect names only
			                           Collectors.toList())    // as List<String>
			    ));
		
		//display salaries group by gender using java8
		//display salaries group by gender using java9
		//display names group by gender using java9
		
		System.out.println("beforre java9=======");
		System.out.println(map);

		Map<String, List<Employee>> mapJava9 = empList.stream().collect(Collectors.groupingBy(Employee::getGender,
				Collectors.filtering(emp -> emp.getAge() > 18, Collectors.toList())));
		System.out.println("from java9======");
		System.out.println(mapJava9);
	}

}
