package com.java9;

import java.util.ArrayList;
import java.util.Set;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.employee.Employee;

public class MyUnmodifibleSet {

	public static void main(String[] args) {

		//get employees list, after get emp list , dont add any data.
		Set<Employee> set = MyDataBaseUtil.getSetOfEmployees(new ArrayList());
		
		//Don't modify the result
		
		Set set2 = Set.of(set); //now set2 not allowed any modifications
		
		set2.add(new Employee());
		System.out.println("==============");

	}

}
