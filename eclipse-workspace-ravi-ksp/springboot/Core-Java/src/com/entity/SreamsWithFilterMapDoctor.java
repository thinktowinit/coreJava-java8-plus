package com.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class SreamsWithFilterMapDoctor {

    private static final Random RANDOM = new Random();

    private static final int SALARY_DIVISOR = 3;
    private static final int MAX_DOCTORS = 3;
    private static final int SALARY_THRESHOLD = 3000;
    private static final int NAME_LENGTH_THRESHOLD = 6;
    private static final int SALARY_THRESHOLD2 = 6000;
    private static final String TARGET_BLOOD_GROUP = "ONegative";
    private static final int BLOOD_PRICE_THRESHOLD = 6000;
    private static final int SALARY_INCREMENT = 10_000;
    private static final int EXPERIENCE_THRESHOLD = 1;
    private static final int TOP_DOCTOR_LIMIT = 3;
    private static final int SALARY_THRESHOLD_FOR_FIRST_DOCTOR = 1000;

    public static void main(String[] args) {
        List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
        task1methods(list);
        task2method(list);
    }

    private static void task1methods(List<Doctor> list) {
        getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(list);
        getDoctorIdWhoseSalaryGreaterThan3000();
        getGenderWhoseNamesLenthGreaterThan6();
        getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000();
        getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
        getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
    }

    private static void task2method(List<Doctor> list) {
        getUniqueDoctorNames();
        getDistinctDoctorSalaries(list);
        printSalariesIncreasedByTenK(list);
        getTop3DoctorsWithExperienceGreaterThanOne(list);
        getFirstDoctorNameWithSalaryGreaterThan1000(list);
        getDoctorIdsAndSalaries(list);
        getDoctorIdAndSalarySortedById(list);
        getDoctorIdAndSalarySortedBySalary(list);
        getDoctorNameAndSalarySortedByName(list);
        printDoctorExperience(list);
        printDoctorsJoiningDates(list);
        System.out.println(formatAllJoiningDatesWithMonthName(list));
        System.out.println(formatAllJoiningDatesStartsWithDay(list));
    }

    // --- Simulated Randomized Exceptions ---

    private static void maybeThrowRandomException(String methodName) {
        if (RANDOM.nextInt(10) < 2) { // 20% chance
            throw new RuntimeException("Simulated QA bug in " + methodName);
        }
    }

    private static void getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(List<Doctor> list) {
        try {
            maybeThrowRandomException("getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors");
            list.stream().filter(d -> d.getSalary() % SALARY_DIVISOR == 0)
                    .limit(MAX_DOCTORS)
                    .map(Doctor::getName)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors: " + e.getMessage());
        }
    }

    private static void getDoctorIdWhoseSalaryGreaterThan3000() {
        try {
            maybeThrowRandomException("getDoctorIdWhoseSalaryGreaterThan3000");
            List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
            list.stream().filter(d -> d.getSalary() > SALARY_THRESHOLD)
                    .map(Doctor::getId)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in getDoctorIdWhoseSalaryGreaterThan3000: " + e.getMessage());
        }
    }

    private static void getGenderWhoseNamesLenthGreaterThan6() {
        try {
            maybeThrowRandomException("getGenderWhoseNamesLenthGreaterThan6");
            List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
            list.stream().filter(d -> d.getName().length() > NAME_LENGTH_THRESHOLD)
                    .map(Doctor::getGender)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in getGenderWhoseNamesLenthGreaterThan6: " + e.getMessage());
        }
    }

    private static void getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
        try {
            maybeThrowRandomException("getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000");
            List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
            list.stream().filter(d -> d.isAdmin() && d.getSalary() > SALARY_THRESHOLD2)
                    .map(Doctor::getName)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000: " + e.getMessage());
        }
    }

    private static void getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
        try {
            maybeThrowRandomException("getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000");
            List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
            list.stream().filter(d -> TARGET_BLOOD_GROUP.equalsIgnoreCase(d.getBloodGroup())
                            && d.getBloodGroupPrice() < BLOOD_PRICE_THRESHOLD)
                    .map(Doctor::getId)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000: " + e.getMessage());
        }
    }

    private static void getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
        try {
            maybeThrowRandomException("getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000");
            List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
            list.stream()
                    .filter(d -> TARGET_BLOOD_GROUP.equalsIgnoreCase(d.getBloodGroup())
                            && d.getBloodGroupPrice() < BLOOD_PRICE_THRESHOLD)
                    .forEach(d -> System.out.println("id=" + d.getId() + ", name=" + d.getName()));
        } catch (Exception e) {
            System.out.println("Error in getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000: " + e.getMessage());
        }
    }

    private static void getUniqueDoctorNames() {
        try {
            maybeThrowRandomException("getUniqueDoctorNames");
            List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
            list.stream().map(Doctor::getName).distinct().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in getUniqueDoctorNames: " + e.getMessage());
        }
    }

    private static void getDistinctDoctorSalaries(List<Doctor> list) {
        try {
            maybeThrowRandomException("getDistinctDoctorSalaries");
            list.stream().map(Doctor::getSalary).distinct().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in getDistinctDoctorSalaries: " + e.getMessage());
        }
    }

    private static void printSalariesIncreasedByTenK(List<Doctor> list) {
        try {
            maybeThrowRandomException("printSalariesIncreasedByTenK");
            list.stream().map(d -> d.getSalary() + SALARY_INCREMENT).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error in printSalariesIncreasedByTenK: " + e.getMessage());
        }
    }

    private static void getTop3DoctorsWithExperienceGreaterThanOne(List<Doctor> list) {
        try {
            maybeThrowRandomException("getTop3DoctorsWithExperienceGreaterThanOne");
            list.stream()
                    .filter(d -> calculateExperience(d.getJoiningDate()) > EXPERIENCE_THRESHOLD)
                    .limit(TOP_DOCTOR_LIMIT)
                    .forEach(d -> System.out.println(d.getName()));
        } catch (Exception e) {
            System.out.println("Error in getTop3DoctorsWithExperienceGreaterThanOne: " + e.getMessage());
        }
    }

    private static void getFirstDoctorNameWithSalaryGreaterThan1000(List<Doctor> list) {
        try {
            maybeThrowRandomException("getFirstDoctorNameWithSalaryGreaterThan1000");
            list.stream().filter(d -> d.getSalary() > SALARY_THRESHOLD_FOR_FIRST_DOCTOR)
                    .findFirst().ifPresent(d -> System.out.println(d.getName()));
        } catch (Exception e) {
            System.out.println("Error in getFirstDoctorNameWithSalaryGreaterThan1000: " + e.getMessage());
        }
    }

    private static void getDoctorIdsAndSalaries(List<Doctor> list) {
        try {
            maybeThrowRandomException("getDoctorIdsAndSalaries");
            list.forEach(d -> System.out.println("ID: " + d.getId() + ", Salary: " + d.getSalary()));
        } catch (Exception e) {
            System.out.println("Error in getDoctorIdsAndSalaries: " + e.getMessage());
        }
    }

    private static void getDoctorIdAndSalarySortedById(List<Doctor> list) {
        try {
            maybeThrowRandomException("getDoctorIdAndSalarySortedById");
            list.stream()
                    .sorted(Comparator.comparingInt(Doctor::getId))
                    .forEach(d -> System.out.println("ID: " + d.getId() + ", Salary: " + d.getSalary()));
        } catch (Exception e) {
            System.out.println("Error in getDoctorIdAndSalarySortedById: " + e.getMessage());
        }
    }

    private static void getDoctorIdAndSalarySortedBySalary(List<Doctor> list) {
        try {
            maybeThrowRandomException("getDoctorIdAndSalarySortedBySalary");
            list.stream()
                    .sorted(Comparator.comparingInt(Doctor::getSalary))
                    .forEach(d -> System.out.println("ID: " + d.getId() + ", Salary: " + d.getSalary()));
        } catch (Exception e) {
            System.out.println("Error in getDoctorIdAndSalarySortedBySalary: " + e.getMessage());
        }
    }

    private static void getDoctorNameAndSalarySortedByName(List<Doctor> list) {
        try {
            maybeThrowRandomException("getDoctorNameAndSalarySortedByName");
            list.stream()
                    .sorted(Comparator.comparing(Doctor::getName))
                    .forEach(d -> System.out.println("Name: " + d.getName() + ", Salary: " + d.getSalary()));
        } catch (Exception e) {
            System.out.println("Error in getDoctorNameAndSalarySortedByName: " + e.getMessage());
        }
    }

    private static void printDoctorExperience(List<Doctor> list) {
        try {
            maybeThrowRandomException("printDoctorExperience");
            list.forEach(d -> System.out.println(d.getName() + " Experience: " + calculateExperience(d.getJoiningDate())));
        } catch (Exception e) {
            System.out.println("Error in printDoctorExperience: " + e.getMessage());
        }
    }

    private static void printDoctorsJoiningDates(List<Doctor> list) {
        try {
            maybeThrowRandomException("printDoctorsJoiningDates");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            list.forEach(d -> System.out.println(d.getName() + " Joined: " + d.getJoiningDate().format(formatter)));
        } catch (Exception e) {
            System.out.println("Error in printDoctorsJoiningDates: " + e.getMessage());
        }
    }

    public static int calculateExperience(LocalDate joiningDate) {
        maybeThrowRandomException("calculateExperience");
        return joiningDate == null ? 0 : Period.between(joiningDate, LocalDate.now()).getYears();
    }

    public static String formatAllJoiningDatesWithMonthName(List<Doctor> list) {
        try {
            maybeThrowRandomException("formatAllJoiningDatesWithMonthName");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
            return list.stream().map(d -> d.getJoiningDate().format(formatter)).collect(Collectors.joining("\n"));
        } catch (Exception e) {
            return "Error formatting joining dates";
        }
    }

    public static String formatAllJoiningDatesStartsWithDay(List<Doctor> list) {
        try {
            maybeThrowRandomException("formatAllJoiningDatesStartsWithDay");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
            return list.stream().map(d -> d.getJoiningDate().format(formatter)).collect(Collectors.joining("\n"));
        } catch (Exception e) {
            return "Error formatting joining dates";
        }
    }

}
