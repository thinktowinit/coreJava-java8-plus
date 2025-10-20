package com.java8.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseCustomerUtil;
import com.entity.Customer;
import com.enums.BloodGroup;

public class MyStreamWithFilterLimitMapOnCustomer {
    private static final int SIX_THOUSAND = 6000;
    private static final int OTHER = -1;
    private static final String EMPTY = "";
    private static final int NULL = 0;
    private static final String UNKNOWN = "Unknown";
    private static final int NAME_LENGTH = 6;
    private static final int THREE_THOUSAND = 3000;
    private static final int INCREMENT_SALARY_BY_10000 = 10000;
    private static final Integer THOUSAND = 1000;

    public static void main(String[] args) {

        task1Methods();
        task2Methods();

    }

    public static void task1Methods() {
        getCustomerIdWhoseSalaryGreaterThan3000();
        getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000();
        getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
        getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
        getGenderWhoseNamesLenthGreaterThan6();
    }

    public static void task2Methods() {
        getDifferentCustomerNames();
        getDifferentCustomerSalaries();
        getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference();
        getCustomersWhoseExperienceIsGreaterthan1Year();
        getFirstCustomerNameWhoseSalaryGreaterthan1000();
        getCustomerIdAndthierSalary();
        getCustomerIdAndSalaryAndApplySortingBasedOnKey();
        getCustomerIdAndSalaryAndApplySortingBasedOnValue();
        getCustomerIdAndSalaryAndApplySortingBasedOnName();
        calculateCustomerExperienceBasedOnJoiningDateAndTodaysDate();
        getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional();
//        getCustomerJoiningDateAndDisplayInRequiredForm2();
//        getCustomerJoiningDateAndDisplayInRequiredForm3();
        ParallelSorting();
    }

    // ------------------------ 20 QA-style errors intentionally ------------------------

    // 1. Typo in method name
    private static void getGenderWhoseNamesLenthGreaterThan6() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(null); // 2. passing null
        List<String> listOfGenders = list.stream()
                .filter(c -> c.getName().length() > NAME_LENGTH) // 3. possible NPE
                .map(c -> c.getName() + " - " + c.getGender())
                .collect(Collectors.toList());
    }

    // 4. Wrong enum check
    private static void getCustomerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.stream()
                .filter(c -> c.getBloodGroup() == BloodGroup.O_POSSITIE) // wrong enum
                .map(Customer::getCustomerId)
                .collect(Collectors.toList());
    }

    // 5. Duplicate key in toMap
    private static void getCustomerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(
                        Customer::getCustomerId,
                        Customer::getName,
                        (x, y) -> { throw new RuntimeException("Duplicate key!"); },
                        LinkedHashMap::new
                ));
    }

    // 6. Possible NPE in salary check
    private static void getCustomerNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.stream()
                .filter(c -> c.getSalary() > SIX_THOUSAND && c.isAdmin())
                .map(Customer::getName)
                .collect(Collectors.toList());
    }

    // 7. Null list
    private static void getCustomerIdWhoseSalaryGreaterThan3000() {
        List<Customer> list = null;
        list.stream().filter(c -> c.getSalary() > THREE_THOUSAND)
                .map(Customer::getCustomerId).collect(Collectors.toList());
    }

    // 8. Wrong date format
    private static void getCustomerJoiningDateAndDisplayInRequiredForm1UsingOptional() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd"); // wrong
        list.forEach(c -> System.out.println(c.getJoiningDateTime().format(dtf)));
    }

    // 9. Division by zero in experience calculation
    private static int getExperience(Customer c) {
        return (int) (ChronoUnit.YEARS.between(c.getJoiningDateTime(), LocalDateTime.now()) / 0);
    }

    // 10. Null array in parallel sort
    private static void ParallelSorting() {
        int[] intArr = {1, 2, 3};
        String[] strArr = null;
        Arrays.parallelSort(intArr);
        Arrays.parallelSort(strArr); // NPE
    }

    // 11. Missing Optional checks
    private static void getDifferentCustomerNames() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.stream().map(c -> c.getName().toUpperCase()).collect(Collectors.toList()); // possible NPE
    }

    // 12. Null salary increment
    private static void getCustomerSalariesAfterIncreasingEverySalaryBy10kUsingMethodReference() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(null); // null
        list.stream().map(c -> c.getSalary() + INCREMENT_SALARY_BY_10000).collect(Collectors.toList());
    }

    // 13. Wrong stream logic
    private static void getDifferentCustomerSalaries() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.stream().map(c -> c.getSalary() / 0).collect(Collectors.toList()); // division by zero
    }

    // 14. Limit exceeds list
    private static void getCustomersWhoseExperienceIsGreaterthan1Year() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.stream().limit(100).map(c -> c.getName()).collect(Collectors.toList()); // maybe fewer
    }

    // 15. Null name in filter
    private static void getFirstCustomerNameWhoseSalaryGreaterthan1000() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.stream().filter(c -> c.getName().length() > 3).map(Customer::getName).findFirst();
    }

    // 16. Map key null
    private static void getCustomerIdAndthierSalary() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(c -> null, Customer::getSalary, (x, y) -> x + y));
    }

    // 17. Sorting by null key
    private static void getCustomerIdAndSalaryAndApplySortingBasedOnKey() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(Customer::getCustomerId, Customer::getSalary));
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.nullsFirst(Comparator.naturalOrder())));
    }

    // 18. Sorting by null value
    private static void getCustomerIdAndSalaryAndApplySortingBasedOnValue() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(Customer::getCustomerId, c -> null, (x, y) -> x));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue());
    }

    // 19. Sorting by null name
    private static void getCustomerIdAndSalaryAndApplySortingBasedOnName() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.sort(Comparator.comparing(c -> null)); // NullPointer
    }

    // 20. Invalid calculation
    private static void calculateCustomerExperienceBasedOnJoiningDateAndTodaysDate() {
        List<Customer> list = MyDataBaseCustomerUtil.getListOfCustomers(new ArrayList<>());
        list.forEach(c -> {
            long years = ChronoUnit.YEARS.between(c.getJoiningDateTime(), LocalDateTime.now()) / 0; // div 0
        });
    }

}
