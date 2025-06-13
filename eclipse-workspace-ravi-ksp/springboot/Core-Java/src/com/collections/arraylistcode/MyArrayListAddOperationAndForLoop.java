package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.List;

import com.employee.Employee;

public class MyArrayListAddOperationAndForLoop {

	public static void main(String[] args) {

		List<Employee> listOfEmployee = new ArrayList();

		Employee employee1 = new Employee();
		employee1.setName("Araind");
		employee1.setId(2);
		employee1.setAdmin(true);
		employee1.setSalary(22);
		Employee employee2 = new Employee();
		employee2.setName("Nagesh");
		Employee employee3 = new Employee();
		employee3.setName("Naveen");
		Employee employee4 = new Employee();
		employee4.setName("Abhinav");

		listOfEmployee.add(employee3);
		listOfEmployee.add(employee2);
		listOfEmployee.add(employee1);
		listOfEmployee.add(employee4);

		System.out.println(listOfEmployee.size());

		for (int i = 0; i < listOfEmployee.size(); i++) {

			System.out.println(listOfEmployee.get(i).getName());
			System.out.println(listOfEmployee.get(i).getSalary());
			System.out.println("==============================");

		}

		for (Employee employee : listOfEmployee) {
//for each loop
			System.out.println("================using for each==============");
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println("==============================");

		}

		System.out.println("using java8 for each================================= ");
		listOfEmployee.forEach(box -> System.out.println(box.getName()));

		listOfEmployee.forEach(box -> {

			System.out.println(box.getName());
			System.out.println(box.getSalary());

		});

		listOfEmployee.forEach(employee -> {

			System.out.println(employee.getName());
			System.out.println(employee.getSalary());

		});

	}

}
