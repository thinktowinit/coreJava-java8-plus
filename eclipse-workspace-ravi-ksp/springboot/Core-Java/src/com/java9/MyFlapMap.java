package com.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyFlapMap {

	public static void main(String[] args) {

		List<Employee> empList = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		// getFriendNames of each emp id

		//get emp friend names for each emp id......
		//Ex:-  1,(Hyd, Ban, Chennai)
		//key interger, value List<String>
		
		//if value = List<String>
		//java9
		Map<Integer, List<String>> map = empList.stream().collect(Collectors.groupingBy(Employee::getId,
				Collectors.flatMapping(emp -> emp.getFrindNames().stream(), Collectors.toList())));

//		Map<Integer, List<List<String>>> map2 = empList.stream().collect(Collectors.groupingBy(Employee::getId,
//				Collectors.mapping(emp -> emp.getFrindNames(), Collectors.toList())));

	}

}
