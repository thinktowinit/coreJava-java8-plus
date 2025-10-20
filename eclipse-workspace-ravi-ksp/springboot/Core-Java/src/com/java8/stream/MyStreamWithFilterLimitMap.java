package com.java8.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;
import com.constants.CoreJavaConstants;
import com.employee.Employee;

public class MyStreamWithFilterLimitMap {

    private static final String IT_WILL_NOT_DIVISIBLE_BY_3 = "it will not divisible by 3";
    private static final String GET_EMP_IDS_WHOSE_BLODD_GROUP_IS_O_NEGATIVE_AND_BLOOD_PRICE_LESS_THAN60002 = "getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========";
    private static final String SALARIES_AFTER_INCREASING_BY_10K = "Salaries After Increasing by 10K:";
    private static final int _tenthousand = 10000;
    private static final int SALARY_DIVISOR = 3;
    private static final int MAX_EMPLOYEES = 3;
    private static final int salary_threshold = 3000;
    private static final int salary_thresholdd = 6000;
    private static final String O_NEGATIVE = "ONegative";
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
        task1(list);
        task2();
    }

    private static void task1(List<Employee> list) {
        getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees(list);
        getEmpIdWhoseSalaryGreaterThan3000();
        getGenderWhoseNamesLenthGreaterThan6();
        getEmpNamesWhoIsAdminAndHisSalaryGreaterThan6000();
        getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
        getEmpIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
        getEmpIdWhoseSalaryGreaterThan3000method2(list);
        getFormattedJoiningDateTime(list);
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

    // ------------------ TASK1 METHODS ------------------

    private static void getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees(List<Employee> list) {
        try {
            System.out.println("getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees");
            maybeThrowRandomException();
            List<String> listOfEmpNames = list.stream()
                    .filter(employee -> employee.getSalary() % SALARY_DIVISOR == 0)
                    .limit(MAX_EMPLOYEES)
                    .map(Employee::getName)
                    .collect(Collectors.toList());
            listOfEmpNames.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage() + IT_WILL_NOT_DIVISIBLE_BY_3);
        }
    }

    public static List<Integer> getEmpIdWhoseSalaryGreaterThan3000method2(List<Employee> list) {
        List<Integer> listOfEmpIds = new ArrayList<>();
        try {
            System.out.println("Filtering employees with salary greater than 3000...");
            maybeThrowRandomException();
            listOfEmpIds = list.stream()
                    .filter(emp -> emp.getSalary() > 3000)
                    .map(Employee::getId)
                    .collect(Collectors.toList());
            System.out.println("Filtered " + listOfEmpIds.size() + " employees.");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return listOfEmpIds;
    }

    private static void getEmpIdWhoseSalaryGreaterThan3000() {
        try {
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            maybeThrowRandomException();
            list.stream()
                    .filter(emp -> emp.getSalary() > salary_threshold)
                    .map(Employee::getId)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void getGenderWhoseNamesLenthGreaterThan6() {
        try {
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            maybeThrowRandomException();
            List<String> listOfGenders = list.stream()
                    .filter(emp -> emp.getName().length() > CoreJavaConstants.NAME_LENGTH)
                    .map(Employee::getGender)
                    .collect(Collectors.toList());
            listOfGenders.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error at getGenderWhoseNamesLenthGreaterThan6: " + e.getMessage());
        }
    }

    private static void getEmpNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
        try {
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            maybeThrowRandomException();
            List<String> listOfNames = list.stream()
                    .filter(emp -> emp.isAdmin() && emp.getSalary() > salary_thresholdd)
                    .map(Employee::getName)
                    .collect(Collectors.toList());
            listOfNames.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
        try {
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            maybeThrowRandomException();
            List<Integer> listOfEmpIds = list.stream()
                    .filter(emp -> O_NEGATIVE.equalsIgnoreCase(emp.getBloodGroup()) && emp.getBloodGroupPrice() < 6000)
                    .map(Employee::getId)
                    .collect(Collectors.toList());
            listOfEmpIds.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void getEmpIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
        try {
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            maybeThrowRandomException();
            Map<Integer, String> listOfEmpIdWithNames = list.stream()
                    .filter(emp -> O_NEGATIVE.equalsIgnoreCase(emp.getBloodGroup()) && emp.getBloodGroupPrice() < 6000)
                    .collect(Collectors.toMap(Employee::getId, Employee::getName, (x, y) -> x + ", " + y, LinkedHashMap::new));
            listOfEmpIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static List<String> getFormattedJoiningDateTime(List<Employee> empList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss.SSS");
        LocalTime fixedTime = LocalTime.of(6, 55, 23, 234_000_000);
        return Optional.ofNullable(empList).orElseGet(Collections::emptyList)
                .stream()
                .map(emp -> Optional.ofNullable(emp.getJoiningDate())
                        .map(date -> LocalDateTime.of(date, fixedTime).format(formatter))
                        .orElse("Joining date not available"))
                .collect(Collectors.toList());
    }

    // ------------------ TASK2 METHODS ------------------

    private static void getDifferentEmployeeNames() {
        try {
             List<Employee> listt = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
        	  List<String> listOfNames = Optional.ofNullable(listt)
                      .orElseGet(Collections::emptyList) // handle null
                      .stream()
                      .map(Employee::getName)
                      .filter(Objects::nonNull)
                      .distinct()
                      .sorted()
                      .collect(Collectors.toList());

              if (listOfNames.isEmpty()) {
                  System.out.println("No data found");
              } else {
                  listOfNames.forEach(System.out::println);
              }
        } catch (Exception e) {
            System.out.println("Exception in getDifferentEmployeeNames: " + e.getMessage());
        }
    }

    private static void getDifferentEmployeesalaries() {
        try {
            maybeThrowRandomException();
            List<Employee> listt = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            List<Integer> listOfSalaries = listt.stream().map(Employee::getSalary).distinct().collect(Collectors.toList());
            listOfSalaries.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Exception in getDifferentEmployeesalaries: " + e.getMessage());
        }
    }

    private static void getEmployeesalariesAfterIncreasingEverySalarybytenk() {
        try {
            maybeThrowRandomException();
            List<Employee> listt = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            List<Integer> updatedSalaries = listt.stream().map(emp -> emp.getSalary() + _tenthousand).collect(Collectors.toList());
            updatedSalaries.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Exception in getEmployeesalariesAfterIncreasingEverySalarybytenk: " + e.getMessage());
        }
    }

    private static void getEmployeesalariesAfterIncreasingEverySalarybytenkk() {
        try {
            maybeThrowRandomException();
            List<Employee> employees = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            List<Integer> updatedSalaries = employees.stream()
                    .map(emp -> emp.getSalary() + _tenthousand)
                    .collect(Collectors.toList());
            updatedSalaries.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Exception in getEmployeesalariesAfterIncreasingEverySalarybytenkk: " + e.getMessage());
        }
    }

    private static void getFirstEmployeeNameWhoseSalaryisGreaterThanonek() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            Optional<Employee> firstEmployeeName = list.stream().filter(emp -> emp.getSalary() > 1000).findFirst();
            firstEmployeeName.ifPresent(e -> System.out.println("First employee with salary > 1000: " + e.getName()));
        } catch (Exception e) {
            System.out.println("Exception in getFirstEmployeeNameWhoseSalaryisGreaterThanonek: " + e.getMessage());
        }
    }

    private static void getEmpIdsAndSalary() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            list.stream().map(e -> "ID: " + e.getId() + ", Salary: " + e.getSalary()).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Exception in getEmpIdsAndSalary: " + e.getMessage());
        }
    }

    private static void getEmpIdsAndSalarySortingKey() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            Map<Integer, Integer> empIdToSalaryMap = list.stream()
                    .collect(Collectors.toMap(Employee::getId, Employee::getSalary, (x, y) -> x, TreeMap::new));
            empIdToSalaryMap.forEach((id, salary) -> System.out.println("Employee ID: " + id + ", Salary: " + salary));
        } catch (Exception e) {
            System.out.println("Exception in getEmpIdsAndSalarySortingKey: " + e.getMessage());
        }
    }

    private static void getEmpIdsAndSalarySortingValue() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            list.stream().sorted(Comparator.comparing(Employee::getSalary))
                    .forEach(emp -> System.out.println("Employee ID: " + emp.getId() + ", Salary: " + emp.getSalary()));
        } catch (Exception e) {
            System.out.println("Exception in getEmpIdsAndSalarySortingValue: " + e.getMessage());
        }
    }

    private static void getEmpIdsAndSalaryAndApplySortingBasedOnName() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            list.stream().sorted(Comparator.comparing(Employee::getName))
                    .forEach(emp -> System.out.println("Employee Name: " + emp.getName() + ", Salary: " + emp.getSalary()));
        } catch (Exception e) {
            System.out.println("Exception in getEmpIdsAndSalaryAndApplySortingBasedOnName: " + e.getMessage());
        }
    }

    private static void getEmployeeExperience() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            LocalDate today = LocalDate.now();
            list.forEach(emp -> {
                if (emp.getJoiningDate() != null) {
                    Period experience = Period.between(emp.getJoiningDate(), today);
                    System.out.println("Employee: " + emp.getName() + " | Experience: " + experience.getYears() + " years, " + experience.getMonths() + " months");
                }
            });
        } catch (Exception e) {
            System.out.println("Exception in getEmployeeExperience: " + e.getMessage());
        }
    }

    private static void getEmployeeJoiningDategrtroneyr() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
            LocalDate today = LocalDate.now();
            list.stream()
                    .filter(emp -> emp.getJoiningDate() != null && Period.between(emp.getJoiningDate(), today).getYears() > 1)
                    .limit(3)
                    .forEach(emp -> {
                        String formattedJoiningDate = emp.getJoiningDate().format(formatter);
                        Period experience = Period.between(emp.getJoiningDate(), today);
                        System.out.println("Employee: " + emp.getName() + " | Joining Date: " + formattedJoiningDate + " | Experience: " + experience.getYears() + " years, " + experience.getMonths() + " months");
                    });
        } catch (Exception e) {
            System.out.println("Exception in getEmployeeJoiningDategrtroneyr: " + e.getMessage());
        }
    }

    private static void getEmployeeJoiningDate() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd HH:mm:ss");
            LocalDate today = LocalDate.now();
            list.forEach(emp -> {
                if (emp.getJoiningDate() != null) {
                    String formattedJoiningDate = emp.getJoiningDate().format(formatter);
                    Period experience = Period.between(emp.getJoiningDate(), today);
                    System.out.println("Employee: " + emp.getName() + " | Joining Date: " + formattedJoiningDate + " | Experience: " + experience.getYears() + " years, " + experience.getMonths() + " months");
                }
            });
        } catch (Exception e) {
            System.out.println("Exception in getEmployeeJoiningDate: " + e.getMessage());
        }
    }

    private static void getEmployeeJoiningDateFormatter() {
        try {
            maybeThrowRandomException();
            List<Employee> list = MyDataBaseUtil.getListOfEmployees(new ArrayList<>());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyyHH:mm:ss");
            LocalDate today = LocalDate.now();
            list.forEach(emp -> {
                if (emp.getJoiningDate() != null) {
                    String formattedJoiningDate = emp.getJoiningDate().format(formatter);
                    Period experience = Period.between(emp.getJoiningDate(), today);
                    System.out.println("Employee: " + emp.getName() + " | Joining Date: " + formattedJoiningDate + " | Experience: " + experience.getYears() + " years, " + experience.getMonths() + " months");
                }
            });
        } catch (Exception e) {
            System.out.println("Exception in getEmployeeJoiningDateFormatter: " + e.getMessage());
        }
    }

    // ------------------ HELPER ------------------

    private static void maybeThrowRandomException() {
        if (random.nextInt(100) < 35) { // ~35% chance to throw
            throw new RuntimeException("Randomized exception for debugging!");
        }
    }
}
