package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyFindFirst {

	public static void main(String[] args) {

		// means find first or get first

		getFirstEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();

	}

	private static void getFirstEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		// TODO Auto-generated method stub
		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		Optional<Integer> singleId = list
				.stream().filter(emp -> (emp.getBloodGroup() != null
						&& "ONegative".equalsIgnoreCase(emp.getBloodGroup()) && emp.getBloodGroupPrice() < 6000))
				.map(emp -> emp.getId()).findFirst();
		System.out.println("getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
		//for get alue from Optional use  .get() method
		System.out.println(singleId.get());

	}

}
