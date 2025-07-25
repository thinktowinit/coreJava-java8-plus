package com.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Demonstrates use of Java Streams with filtering and mapping operations on Doctor entities.
 */
public class SreamsWithFilterMap {
	 private static final int SALARY_DIVISOR = 3;
	    private static final int MAX_DOCTORS = 3;
	    private static final String LOG_MESSAGE = "getListOfNamesWhoseSalaryDividedBy3AndGetMax3Doctors=============>";
	    private static final int SALARY_THRESHOLD = 3000;
	    private static final String LOG_MESSAGE1 = "getDoctorIdWhoseSalaryGreaterThan3000============";
	    private static final int NAME_LENGTH_THRESHOLD = 6;
	    private static final String LOG_MESSAGE2 = "getGenderWhoseNamesLengthGreaterThan6==========";
	    private static final int SALARY_THRESHOLD2 = 6000;
	    private static final String LOG_MESSAGE3 = "getDoctorNamesWhoAreAdminsWithSalaryAbove6000===========";
	    private static final String TARGET_BLOOD_GROUP = "ONegative";
	    private static final int BLOOD_PRICE_THRESHOLD = 6000;
	    private static final String LOG_MESSAGE4 = "getDoctorIdsWithONegativeBloodGroupAndPriceBelow6000===========";
	    static final String LOG_MESSAGE5 = "getDoctorIdsWithNamesForONegativeBloodGroupAndPriceBelow6000";


	
	

		
		public static void main(String[] args) {

			List<Doctor> list =  MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(list);
			getDoctorIdWhoseSalaryGreaterThan3000();
			getGenderWhoseNamesLenthGreaterThan6();
			getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000();
			getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
			getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();

		}
		/**
		 * Returns a list of names of up to 3 doctors whose salary is divisible by 3.
		 *
		 * @param doctors the list of doctors to filter
		 * @return list of doctor names satisfying the criteria
		 */

		private static void getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(List<Doctor> list) {
			try {
				System.out.println(LOG_MESSAGE);
				List<String> listOfEmpNames = list.stream().filter(doctor -> doctor.getSalary() % SALARY_DIVISOR == 0)
	                    .limit(MAX_DOCTORS)
						.map(emp -> emp.getName()).collect(Collectors.toList());
				listOfEmpNames.forEach(System.out::println);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/**
		 * Prints IDs of doctors whose salary is greater than the defined salary threshold.
		 */

		private static void getDoctorIdWhoseSalaryGreaterThan3000() {
			// TODO Auto-generated method stub
			try {
				List<Doctor> list =MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

//			List<Integer> listOfIds = list.stream().filter(emp -> emp.getSalary() > 3000).map(emp -> emp.getId())
//					.collect(Collectors.toList());
//
//			listOfIds.forEach(System.out::println);

				// if not used listOfId's other places
				System.out.println(LOG_MESSAGE1);
				list.stream().filter(doctor -> doctor.getSalary() > SALARY_THRESHOLD).map(doctor -> doctor.getId()).collect(Collectors.toList())
						.forEach(System.out::println);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

/**
 * Prints genders of doctors whose name length is greater than the defined threshold.
 */

		private static void getGenderWhoseNamesLenthGreaterThan6() {
			// TODO Auto-generated method stub
			try {
				List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
				List<String> listOfGenders = list.stream().filter(dtr -> dtr.getName().length() > NAME_LENGTH_THRESHOLD).map(dtr -> dtr.getGender())
						.collect(Collectors.toList());
				System.out.println(LOG_MESSAGE2);
				listOfGenders.forEach(System.out::println);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		/**
		 * Prints names of doctors who are admins and have a salary greater than the defined threshold.
		 */

		private static void getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
			// TODO Auto-generated method stub
			try {
				List<Doctor> list =MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
				// if(x>10 && x%2==0) //x=20 // 2)20(10 //reminder = 0

				List<String> listOfNames = list.stream().filter(dtr -> (dtr.getSalary() > SALARY_THRESHOLD2 && dtr.isAdmin()))
						.map(dtr -> dtr.getName()).collect(Collectors.toList());
				System.out.println(LOG_MESSAGE3);
				listOfNames.forEach(System.out::println);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		/**
		 * Prints IDs of doctors whose blood group is O-negative and blood price is below the defined threshold.
		 */

		private static void getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
			// TODO Auto-generated method stub
			try {
				List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

				List<Integer> listOfDoctorsIds = list
						.stream().filter(dtr -> (dtr.getBloodGroup() != null
								&& TARGET_BLOOD_GROUP.equalsIgnoreCase(dtr.getBloodGroup()) && dtr.getBloodGroupPrice() < BLOOD_PRICE_THRESHOLD))
						.map(dtr -> dtr.getId()).collect(Collectors.toList());
				System.out.println(LOG_MESSAGE4);
				listOfDoctorsIds.forEach(System.out::println);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		/**
		 * Prints IDs and names of doctors whose blood group is O-negative and blood price is below the defined threshold.
		 */

		private static void getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
			// TODO Auto-generated method stub
			try {
				List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

				Map<Integer, String> listOfDoctorIdWithNames = list.stream()
						.filter(dtr -> (dtr.getBloodGroup() != null && TARGET_BLOOD_GROUP.equalsIgnoreCase(dtr.getBloodGroup())
								&& dtr.getBloodGroupPrice() < BLOOD_PRICE_THRESHOLD ))
						.collect(Collectors.toMap(Doctor::getId, Doctor::getName, (x, y) -> x + ", " + y,
								LinkedHashMap::new));
//			
//			Map<Integer, String> listOfEmpIdWithNamesWithSalaries = list.stream()
//					.filter(emp -> (emp.getBloodGroup() != null && "ONegative".equalsIgnoreCase(emp.getBloodGroup())
//							&& emp.getBloodGroupPrice() < 6000))
//					.collect(Collectors.toMap(Employee :: getId, Employee::getName);
		System.out.println(LOG_MESSAGE5);
////			listOfEmpIdWithNames.forEach(enterySet -> {
////				
////				System.out.println(enterySet.getKey()+","+entrySet.getValue());
////			});

				listOfDoctorIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
				listOfDoctorIdWithNames.forEach((key, value) -> System.out.println(key + ", " + value));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	



}
