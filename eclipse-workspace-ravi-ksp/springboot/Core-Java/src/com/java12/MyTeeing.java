package com.java12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyTeeing {
	
	public static void main(String[] args) {
		//List<String> listNames = MyDataBaseUtil.getListOfStrings();
		
		//get shortestEmpName, longestEmpName
		List<Employee> employeeList = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		List<String> listNames = employeeList.stream().filter(emp -> emp.getAge() > 18).map(Employee::getName)
				.collect(Collectors.toUnmodifiableList());
		GetSmallLongWords c = listNames.stream().collect(
				Collectors.teeing(
						Collectors.minBy(Comparator.comparing(String::length)),
						Collectors.maxBy(Comparator.comparing(String::length)),
						(s,l) -> new GetSmallLongWords(s.orElse(null), l.orElse(null))));
		
		System.out.println("names data"+c);
		
		//get least age,  most age
		
		GetSmallLongWords agesData = employeeList.stream().collect( 
	              Collectors.teeing(
	                  Collectors.maxBy(Comparator.comparing(Employee::getAge)),
	                  Collectors.minBy(Comparator.comparing(Employee::getAge)),
	                  (s,l) -> new GetSmallLongWords(s.get().getAge(), l.get().getAge())));
		
		System.out.println("agesData"+agesData);
		
	}

}
