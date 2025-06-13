package com.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyOptional {

	public static void main(String[] args) {

		List<Employee> listOfEmp = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
		// listOfEmp.stream(). // null pointer exception

		Optional.ofNullable(listOfEmp).orElse(Collections.emptyList()).stream()
				.forEach(emp -> System.out.println(emp.getName()));

		// get list of emp names from list of emp objects
		List<String> listOfEmpNames = Optional.ofNullable(listOfEmp).orElse(Collections.emptyList()).stream()
				.map(emp -> emp.getName()).collect(Collectors.toList());

		System.out.println(listOfEmpNames.size()); // >0

		// case 2 if list is null

		List<Employee> listOfEmpIfNull = null;
		List<String> listOfEmpNamesWhenListNull = Optional.ofNullable(listOfEmpIfNull).orElse(Collections.emptyList())
				.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(listOfEmpNamesWhenListNull.size()); // 0

		// get list of emp names from list of emp objects, return null if name not exist

		List<String> listOfEmpNamesWhenListNullNotAllowedNullNames = Optional.ofNullable(listOfEmpIfNull)
				.orElse(Collections.emptyList()).stream().map(emp -> {
					String name = emp.getName();
					Optional<String> optName = Optional.ofNullable(name);
					if (optName.isPresent()) { // true if alue exist
						return optName.get(); // returned existing value
					} else {
						return null;
					}

				}).collect(Collectors.toList());
	}

}
