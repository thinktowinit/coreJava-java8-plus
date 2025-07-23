package com.entity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SreamsWithFilterMap {
	

	
	//get emp names whose salary divided by with 3 and get maximun 3 employees

		public static void main(String[] args) {

			List<Doctor> list =  MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(list);
			getDoctorIdWhoseSalaryGreaterThan3000();
			getGenderWhoseNamesLenthGreaterThan6();
			getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000();
			getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
			getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();

		}

		private static void getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Doctors(List<Doctor> list) {
			System.out.println("getListOfNamesWhoseSalaryDeidedBy3AndGetMax3Employees=============>");
			List<String> listOfEmpNames = list.stream().filter(employee -> employee.getSalary() % 3 == 0).limit(3)
					.map(emp -> emp.getName()).collect(Collectors.toList());
			listOfEmpNames.forEach(System.out::println);
		}

		private static void getDoctorIdWhoseSalaryGreaterThan3000() {
			// TODO Auto-generated method stub
			List<Doctor> list =MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

//			List<Integer> listOfIds = list.stream().filter(emp -> emp.getSalary() > 3000).map(emp -> emp.getId())
//					.collect(Collectors.toList());
	//
//			listOfIds.forEach(System.out::println);

			// if not used listOfId's other places
			System.out.println("getDoctorIdWhoseSalaryGreaterThan3000============");
			list.stream().filter(doctor -> doctor.getSalary() > 3000).map(doctor -> doctor.getId()).collect(Collectors.toList())
					.forEach(System.out::println);
		}

		private static void getGenderWhoseNamesLenthGreaterThan6() {
			// TODO Auto-generated method stub
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
			List<String> listOfGenders = list.stream().filter(dtr -> dtr.getName().length() > 6).map(dtr -> dtr.getGender())
					.collect(Collectors.toList());
			System.out.println("getGenderWhoseNamesLenthGreaterThan6==========");
			listOfGenders.forEach(System.out::println);

		}

		private static void getdoctorNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
			// TODO Auto-generated method stub
			List<Doctor> list =MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());
			// if(x>10 && x%2==0) //x=20 // 2)20(10 //reminder = 0

			List<String> listOfNames = list.stream().filter(dtr -> (dtr.getSalary() > 6000 && dtr.isAdmin()))
					.map(dtr -> dtr.getName()).collect(Collectors.toList());
			System.out.println("getDtrNamesWhoIsAdminAndHIsSalaryGreaterThan6000===========");
			listOfNames.forEach(System.out::println);

		}

		private static void getDoctorsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
			// TODO Auto-generated method stub
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			List<Integer> listOfDoctorsIds = list
					.stream().filter(dtr -> (dtr.getBloodGroup() != null
							&& "ONegative".equalsIgnoreCase(dtr.getBloodGroup()) && dtr.getBloodGroupPrice() < 6000))
					.map(dtr -> dtr.getId()).collect(Collectors.toList());
			System.out.println("getDtrIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
			listOfDoctorsIds.forEach(System.out::println);

		}


		private static void getDoctorIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
			// TODO Auto-generated method stub
			List<Doctor> list = MyDataBaseDoctorUtils.getListOfDoctors(new ArrayList<>());

			Map<Integer, String> listOfDoctorIdWithNames = list.stream()
					.filter(dtr -> (dtr.getBloodGroup() != null && "ONegative".equalsIgnoreCase(dtr.getBloodGroup())
							&& dtr.getBloodGroupPrice() < 6000))
					.collect(Collectors.toMap(Doctor::getId, Doctor::getName, (x, y) -> x + ", " + y,
							LinkedHashMap::new));
//			
//			Map<Integer, String> listOfEmpIdWithNamesWithSalaries = list.stream()
//					.filter(emp -> (emp.getBloodGroup() != null && "ONegative".equalsIgnoreCase(emp.getBloodGroup())
//							&& emp.getBloodGroupPrice() < 6000))
//					.collect(Collectors.toMap(Employee :: getId, Employee::getName);
//			System.out.println("getEmpIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
////			listOfEmpIdWithNames.forEach(enterySet -> {
////				
////				System.out.println(enterySet.getKey()+","+entrySet.getValue());
////			});

			listOfDoctorIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
			listOfDoctorIdWithNames.forEach((key, value) -> System.out.println(key + ", " + value));

		}

	



}
