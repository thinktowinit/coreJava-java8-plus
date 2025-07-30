package com.java9;

import java.util.ArrayList;
import java.util.Set;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyUnmodifibleSet {

	public static void main(String[] args) {

		//get employees list, after get emp list , dont add any data.
		Set<Employee> mutableSet = MyDataBaseUtil.getSetOfEmployees(new ArrayList());
		
		//Don't modify the result
		
		Set immutableSet = Set.of(mutableSet); //now set2 not allowed any modifications
		System.out.println("=============="+immutableSet);
		immutableSet.add(new Employee()); //Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println("==============");

	}

}
