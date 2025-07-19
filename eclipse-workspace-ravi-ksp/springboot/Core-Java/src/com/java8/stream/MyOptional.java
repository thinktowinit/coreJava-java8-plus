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
		
		//listOfEmp.stream().
		
		//if(listOfEmp != null && listOfEmp.size() > 0 )

		// get list of emp names from list of emp objects
		List<String> listOfEmpNames = Optional.ofNullable(listOfEmp)
				.orElse(Collections.emptyList()).stream()
				.map(emp -> emp.getName()).collect(Collectors.toList());
		
		List<Integer> listOfAges = Optional.ofNullable(listOfEmp)
				.orElse(Collections.emptyList()).stream()
				.map(emp -> emp.getAge()).collect(Collectors.toList());

		System.out.println(listOfEmpNames.size()); // >0

		// case 2 if list is null

		List<Employee> listOfEmpIfNull = null;
		List<String> listOfEmpNamesWhenListNull = Optional.ofNullable
				(listOfEmpIfNull).orElse(Collections.emptyList())
				.stream().map(emp -> emp.getName()).collect(Collectors.toList());
		System.out.println(listOfEmpNamesWhenListNull.size()); // 0

		// get list of emp names from list of emp objects, return null if name not exist

		String defaultName = "TTW";
		List<String> listOfEmpNamesGetDefaultNameIfNameIsNUll = Optional.ofNullable(listOfEmp)
				.orElse(Collections.emptyList()).stream().map(emp -> {
					String name = emp.getName();
					Optional<String> optName = Optional.ofNullable(name);
					if (optName.isPresent()) { // true if value exist
						return optName.get(); // returned existing value
					} else {
						return defaultName;
					}
				}).collect(Collectors.toList());
		
		
		//in short form
		List<String> listOfEmpNamesGetDefaultNameIfNameIsNUll2 = Optional.ofNullable(listOfEmp)
				.orElse(Collections.emptyList()).stream().map(emp -> {
					return Optional.ofNullable(emp.getName()).orElse(defaultName);
				}).collect(Collectors.toList());
	}
	
	private void diffIsPresentIfPresent() {
		  Optional<String> op = Optional.of("abc");

	        // ✅ isPresent + get (not recommended anymore)
	        String name = op.isPresent() ? op.get() : "";
	        System.out.println("Using isPresent: " + name);

	        // ✅ Better: use orElse
	        String name2 = op.orElse("");
	        System.out.println("Using orElse: " + name2);

	        // ✅ ifPresent: only for side-effects (e.g., printing), not for getting value
	        op.ifPresent(val -> System.out.println("Using ifPresent: " + val));

	        // ✅ If Optional is empty
	        Optional<String> emptyOp = Optional.ofNullable(null);
	        String name3 = emptyOp.orElse("default");
	        System.out.println("Empty optional handled: " + name3);

	        // ❌ Don't do this — throws NullPointerException
	        // Optional<String> bad = Optional.of(null);
	        
	      //  Optional<String> safe = Optional.ofNullable(null); // ✅ Safe

	}
	
	private void getNameLengthUisngOPtional() {
		// TODO Auto-generated method stub
		
		String name = "Alice";
		int length = Optional.ofNullable(name).map(String::length).orElse(0);
		System.out.println("Length: " + length); // Output: 5

		name = null;
		length = Optional.ofNullable(name).map(String::length).orElse(0);
		System.out.println("Length: " + length); // Output: 0

	}
	
	private void diffOrElseOrElseGet() {
		double salary = 20;  // Could be null
	    int exp = 6;
	    double baseSalary = 50000;
	    
	    double finalSalary = Optional.ofNullable(salary).orElse(baseSalary);

	    double finalSalary2 =  Optional.ofNullable(salary)
	        .map(Double::valueOf)  // convert Integer salary to Double if present
	        .orElseGet(() -> {
	            // Calculate salary if missing
	            if (exp < 10) {
	                return baseSalary + 10000; // bonus for less experienced
	            } else {
	                return baseSalary;
	            }
	        });
	}


}
