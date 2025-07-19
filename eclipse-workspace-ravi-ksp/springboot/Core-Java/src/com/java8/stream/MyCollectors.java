package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyCollectors {

	public static void main(String[] args) {

		printEmpNamesHowManyTimesRepeatedFromLIstOfEmployeeObjects();

		printEmpNamesHowManyTimesRepeatedFromLIstOfNames();
	}

	private static void printEmpNamesHowManyTimesRepeatedFromLIstOfNames() {
		List<String> employeeNames = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", null);

		Map<String, Long> wordCounts = employeeNames.stream().filter(Objects::nonNull) // Optional: to avoid
																						// NullPointerException
				.collect(Collectors.groupingBy(Function.identity(), // same as s -> s
						Collectors.counting()));

		// Print all counts
		wordCounts.forEach((word, count) -> System.out.println(word + ", " + count + " times"));
	}

	private static void printEmpNamesHowManyTimesRepeatedFromLIstOfEmployeeObjects() {
		List<Employee> listOfEmp = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		Map<String, Long> nameCounts = listOfEmp.stream().filter(emp -> emp.getName() != null) // Remove null names
				.collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

		nameCounts.entrySet().stream().filter(entry -> entry.getValue() > 0)
				.forEach(entry -> System.out.println(entry.getKey() + ", " + entry.getValue() + " times"));
	}

}
