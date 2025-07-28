package com.java8.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.constants.CoreJavaConstants;
import com.employee.Employee;

public class MyStreamWithFilterLimitMap {

	private static final String GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN60002 = "getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========";
	private static final String SALARIES_AFTER_INCREASING_BY_10K = "Salaries After Increasing by 10K:";
	private static final int _tenthousand = 10000;
	private static final String GET_EMPLOYEESALARIES_AFTER_INCREASING_EVERY_SALARYBYTENK = "getEmployeesalariesAfterIncreasingEverySalarybytenk===========";
	private static final String GET_DIFFERENT_EMPLOYEESALARIES = "getDifferentEmployeesalaries===========";
	private static final String GET_DIFFERENT_EMPLOYEE_NAMES = "getDifferentEmployeeNames===========";
	private static final String GET_EMP_ID_WHOSE_SALARY_GREATER_THAN3000 = "getEmpIdWhoseSalaryGreaterThan3000============";
	private static final String GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN6000 = GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN60002;
	private static final String GET_EMP_NAMES_WHO_IS_ADMIN_AND_H_IS_SALARY_GREATER_THAN6000 = "getEmpNamesWhoIsAdminAndHIsSalaryGreaterThan6000===========";
	private static final int salary_thresholdd = 6000;
	private static final String GENDER_NAME_LENGTH_LOG = "getGenderWhoseNamesLenthGreaterThan6==========";
	private static final int SALARY_DIVISOR = 3;
	private static final int MAX_EMPLOYEES = 3;
	private static final int salary_threshold = 3000;
	private static final String getlistofnames = "getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees=============>";
	private static final String O_NEGATIVE = "ONegative";




	public static void main(String[] args) {

		List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

		task1(list);
		
		
		task2();
		
		

	}

	private static void task2() {
		getDifferentEmployeeNames();
		getDifferentEmployeesalaries();
		getEmployeesalariesAfterIncreasingEverySalarybytenk();
		getEmployeesalariesAfterIncreasingEverySalarybytenkk();
		
		
		getFirstEmployeeNameWhoseSalaryisGreaterThanonek();
		getEmpIdsAndSalary();
		getEmpIdsAndSalarySortingKey();
		getEmpIdsAndSalarySortingValue();
		getEmpIdsAndSalaryAndApplySortingBasedOnName();
		getEmployeeExperience();
		getEmployeeJoiningDategrtroneyr();
		getEmployeeJoiningDate();
		getEmployeeJoiningDateFormatter();
	}

	private static void task1(List<Employee> list) {
		getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees(list);
		getEmpIdWhoseSalaryGreaterThan3000();
		getGenderWhoseNamesLenthGreaterThan6();
		getEmpNamesWhoIsAdminAndHisSalaryGreaterThan6000();
		getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getEmpIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		
		getEmpIdWhoseSalaryGreaterThan3000method2(list);
	}

	/**
	 * getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees
	 */
	private static void getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees(List<Employee> list) {
		try {
			System.out.println(getlistofnames);
			List<String> listOfEmpNames = list.stream().filter(employee -> employee.getSalary() % SALARY_DIVISOR == 0).limit(MAX_EMPLOYEES)
					.map(emp -> emp.getName()).collect(Collectors.toList());
			listOfEmpNames.forEach(System.out::println);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	/**
	 * getEmpIdWhoseSalaryGreaterThan3000method2
	 * @return listOfEmpIds
	 */
	public static List<Integer> getEmpIdWhoseSalaryGreaterThan3000method2(List<Employee> list) {
	    List<Integer> listOfEmpIds = new ArrayList<>();
	    try {
	        System.out.println("Filtering employees with salary greater than 3000 and collecting their IDs...");
	        
	        listOfEmpIds = list.stream()
	            .filter(emp -> emp.getSalary() > 3000)
	            .map(emp -> emp.getId())
	            .collect(Collectors.toList());

	        System.out.println("Successfully filtered " + listOfEmpIds.size() + " employees.");
	    } catch (Exception e) {
	        System.out.println("Error occurred while filtering employee list in getEmpIdWhoseSalaryGreaterThan3000method2.");
	        System.out.println("Exception message: " + e.getMessage());
	        e.printStackTrace(); 
	    }
	    return listOfEmpIds;
	}


	/**
	 * getEmpIdWhoseSalaryGreaterThan3000
	 */
	private static void getEmpIdWhoseSalaryGreaterThan3000() {
		
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());


			System.out.println(GET_EMP_ID_WHOSE_SALARY_GREATER_THAN3000);
			list.stream()
			.filter(emp -> emp.getSalary() > salary_threshold)
			.map(emp -> emp.getId()).collect(Collectors.toList())
					.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Get gender deatils whose names length greater than 6
	 */
	private static void getGenderWhoseNamesLenthGreaterThan6() {
		// TODO Auto-generated method stub
		
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
			List<String> listOfGenders = list.stream().filter(emp -> emp.getName().length() > CoreJavaConstants.NAME_LENGTH).map(emp -> emp.getGender())
					.collect(Collectors.toList());
			System.out.println(GENDER_NAME_LENGTH_LOG);
			listOfGenders.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error at getGenderWhoseNamesLenthGreaterThan6 "+e.getMessage());
		}

	}

	private static void getEmpNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
		
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());


			List<String> listOfNames = list.stream().filter(emp -> (emp.getSalary() > salary_thresholdd && emp.isAdmin()))
					.map(emp -> emp.getName()).collect(Collectors.toList());
			System.out.println(GET_EMP_NAMES_WHO_IS_ADMIN_AND_H_IS_SALARY_GREATER_THAN6000);
			listOfNames.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan60000() {
		// TODO Auto-generated method stub
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			List<Integer> listOfEmpIds = list
					.stream().filter(emp -> (emp.getBloodGroup() != null
							&& O_NEGATIVE.equalsIgnoreCase(emp.getBloodGroup()) && emp.getBloodGroupPrice() < salary_thresholdd))
					.map(emp -> emp.getId()).collect(Collectors.toList());
			System.out.println(GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN6000);
			listOfEmpIds.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	private static void getEmpIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		// TODO Auto-generated method stub
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			Map<Integer, String> listOfEmpIdWithNames = list.stream()
					.filter(emp -> (emp.getBloodGroup() != null && CoreJavaConstants.O_NEGATIVE.equalsIgnoreCase(emp.getBloodGroup())
							&& emp.getBloodGroupPrice() < salary_thresholdd))
					.collect(Collectors.toMap(Employee::getId, Employee::getName, (x, y) -> x + ", " + y,
							LinkedHashMap::new));



			listOfEmpIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
			listOfEmpIdWithNames.forEach((key, value) -> System.out.println(key + ", " + value));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	private static void getDifferentEmployeeNames() {
		// TODO Auto-generated method stub
		try {
			List<Employee> listt = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
			

			List<String> listOfNamess = listt.stream()
					.map(emp -> emp.getName()).distinct().sorted().collect(Collectors.toList());
			System.out.println(GET_DIFFERENT_EMPLOYEE_NAMES);
			listOfNamess.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
//	Get different employee salaries?
	
	private static void getDifferentEmployeesalaries () {
		// TODO Auto-generated method stub
		try {
			List<Employee> listt = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
			

			List<Integer> listOfNamess = listt.stream()
					.map(emp -> emp.getSalary()).distinct().collect(Collectors.toList());
			System.out.println(GET_DIFFERENT_EMPLOYEESALARIES);
			listOfNamess.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Get employee salaries after increasing every salary by 10k 
	 */
	private static void getEmployeesalariesAfterIncreasingEverySalarybytenk () {
		// TODO Auto-generated method stub
		try {
			List<Employee> listt = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
			

			List<Integer> listOfEmployeeSalaries = listt.stream()
					.map(emp -> emp.getSalary()+_tenthousand).collect(Collectors.toList());
			System.out.println(GET_EMPLOYEESALARIES_AFTER_INCREASING_EVERY_SALARYBYTENK);
			listOfEmployeeSalaries.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Integer increaseSalaryByTenK(Employee emp) {
	    return emp.getSalary() + _tenthousand;
	}
	
	private static void getEmployeesalariesAfterIncreasingEverySalarybytenkk () {
		  try {
			List<Employee> employees = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			    List<Integer> updatedSalaries = employees.stream()
			            .map(MyStreamWithFilterLimitMap::increaseSalaryByTenK)  // Replace 'MyClassName' with your actual class name
			            .collect(Collectors.toList());

			    System.out.println(SALARIES_AFTER_INCREASING_BY_10K);
			    updatedSalaries.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	} 
	
	/**
	 * //Get first employee name whose salary is greater than 1000?
	 */
	private static void getFirstEmployeeNameWhoseSalaryisGreaterThanonek() {
		// TODO Auto-generated method stub
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			System.out.println("getFirstEmployeeNameWhoseSalaryisGreaterThanonek============");
			 Optional<Employee> firstEmployeeName = list.stream().filter(emp -> emp.getSalary() > 1000).findFirst();
			System.out.println(firstEmployeeName);
			
   firstEmployeeName.ifPresent(e->
			    System.out.println("First employee with salary > 1000: " + e.getName()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * //get employees id and salary
	 */
	private static void getEmpIdsAndSalary() {
	    try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			List<String> idSalaryList = list.stream()
			        .map(e -> "ID: " + e.getId() + ", Salary: " + e.getSalary())
			        .collect(Collectors.toList());

			// Print
			idSalaryList.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * //	Get employee ID and salary and apply sorting based on key?
	 */
	private static void getEmpIdsAndSalarySortingKey() {
	    try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			// Put into TreeMap to sort by ID
			Map<Integer, Integer> empIdToSalaryMap = list.stream()
			    .collect(Collectors.toMap(
			        Employee::getId,
			        Employee::getSalary,
			        (existing, duplicate) -> existing,  // Handle duplicates
			        TreeMap::new                       // Use TreeMap for sorting by key
			    ));

			// Print sorted employee ID and salary
			empIdToSalaryMap.forEach((id, salary) ->
			    System.out.println("Employee ID: " + id + ", Salary: " + salary)
			);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void getEmpIdsAndSalarySortingValue() {
	    // Get list of employees
	    try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			list.stream()
			.sorted(Comparator.comparing(Employee::getSalary)) // sort by salary ascending
			.forEach(emp -> System.out.println("Employee ID: " + emp.getId() + ", Salary: " + emp.getSalary()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private static void getEmpIdsAndSalaryAndApplySortingBasedOnName() {
	    // Get list of employees
	    try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			list.stream()
			.sorted(Comparator.comparing(Employee::getName))
			.forEach(emp -> System.out.println("Employee Name: " + emp.getName() + ", Salary: " + emp.getSalary()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void getEmployeeExperience() {
	    // Get list of employees
	    try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
LocalDate today = LocalDate.now(); // today's date

list.forEach(emp -> {
			Period experience = Period.between(emp.getJoiningDatee(), today);
			System.out.println("Employee: " + emp.getName() + 
			    " | Experience: " + experience.getYears() + " years, " +
			    experience.getMonths() + " months");
   });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
//	Get employee joining date and display in the form 
	
	private static void getEmployeeJoiningDate() {
	    try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			System.out.println("Total employees fetched: " + list.size());

			if (list.isEmpty()) {
			    System.out.println("No employees found.");
			    return;
			}

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss");
			LocalDate today = LocalDate.now();

			list.forEach(emp -> {
			    if (emp.getJoiningDate() == null) {
			        System.out.println("Joining date missing for employee: " + emp.getName());
			        return;
			    }

			    LocalDateTime joiningDate = emp.getJoiningDate();
			    String formattedJoiningDate = joiningDate.format(formatter);
			    Period experience = Period.between(joiningDate.toLocalDate(), today);

			    System.out.println("Employee: " + emp.getName() +
			        " | Joining Date: " + formattedJoiningDate +
			        " | Experience: " + experience.getYears() + " years, " +
			        experience.getMonths() + " months");
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	private static void getEmployeeJoiningDateFormatter() {
	    try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			System.out.println("Total employees fetched: " + list.size());

			if (list.isEmpty()) {
			    System.out.println("No employees found.");
			    return;
			}

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyyHH:mm:ss");
			LocalDate today = LocalDate.now();

			list.forEach(emp -> {
			    if (emp.getJoiningDate() == null) {
			        System.out.println("Joining date missing for employee: " + emp.getName());
			        return;
			    }

			    LocalDateTime joiningDate = emp.getJoiningDate();
			    String formattedJoiningDate = joiningDate.format(formatter);
			    Period experience = Period.between(joiningDate.toLocalDate(), today);

			    System.out.println("Employee: " + emp.getName() +
			        " | Joining Date: " + formattedJoiningDate +
			        " | Experience: " + experience.getYears() + " years, " +
			        experience.getMonths() + " months");
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	private static void getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
		// TODO Auto-generated method stub
		try {
			List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

			List<Integer> listOfEmpIds = list
					.stream().filter(emp -> (emp.getBloodGroup() != null
							&& "ONegative".equalsIgnoreCase(emp.getBloodGroup()) && emp.getBloodGroupPrice() < 6000))
					.map(emp -> emp.getId()).collect(Collectors.toList());
			System.out.println(GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN60002);
			listOfEmpIds.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void getEmployeeJoiningDategrtroneyr() {
	    List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());

	    System.out.println("Total employees fetched: " + list.size());

	    if (list.isEmpty()) {
	        System.out.println("No employees found.");
	        return;
	    }

	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
	    LocalDate today = LocalDate.now();

	    // Filter employees with experience > 1 year and limit to max 3 employees
	    list.stream()
	        .filter(emp -> {
	            if (emp.getJoiningDatee() == null) {
	                System.out.println("Joining date missing for employee: " + emp.getName());
	                return false;
	            }
	            Period experience = Period.between(emp.getJoiningDate().toLocalDate(), today);
	            return experience.getYears() > 1;
	        })
	        .limit(3)
	        .forEach(emp -> {
	            LocalDateTime joiningDate = emp.getJoiningDate();
	            String formattedJoiningDate = joiningDate.format(formatter);
	            Period experience = Period.between(joiningDate.toLocalDate(), today);

	            System.out.println("Employee: " + emp.getName() +
	                " | Joining Date: " + formattedJoiningDate +
	                " | Experience: " + experience.getYears() + " years, " +
	                experience.getMonths() + " months");
	        });
	}




}
