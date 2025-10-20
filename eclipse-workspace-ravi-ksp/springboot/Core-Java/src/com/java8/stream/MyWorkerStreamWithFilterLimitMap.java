package com.java8.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseWorkerUtil;
import com.entity.Worker;

public class MyWorkerStreamWithFilterLimitMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		List<Worker> list= MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());
		getWorkerIdWhoseSalaryGreaterThan3000(list);
		getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000();
		getWorkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();
		getWorkerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000();

	}
	
public static List<Integer> getWorkerIdWhoseSalaryGreaterThan3000(List<Worker> list) {
		
		try {
			List<Integer> listOfWorkerIds = list.stream().filter(worker -> worker.getSalary() > 3000).map(worker -> worker.getId())
					.collect(Collectors.toList());
			listOfWorkerIds.forEach(System.out::println);
			return listOfWorkerIds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error at getWorkerIdWhoseSalaryGreaterThan3000 "+e.getMessage());
			return new ArrayList<>();
		}
	}

private static void getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000() {
	try {
		System.out.println("getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000 started");
		List<Worker> list = MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());
		// if(x>10 && x%2==0) //x=20 // 2)20(10 //reminder = 0

		List<String> listOfNames = list.stream().filter(worker -> (worker.getSalary() > 6000 && worker.isAdmin()))
				.map(worker -> worker.getName()).collect(Collectors.toList());
		System.out.println("getworkerNamesWhoIsAdminAndHIsSalaryGreaterThan6000===========");
		listOfNames.forEach(System.out::println);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerNamesWhoIsAdminAndHisSalaryGreaterThan6000 "+e.getMessage());
	}

}


private static void getWorkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
	// TODO Auto-generated method stub
	try {
		List<Worker> list = MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());

		List<Integer> listOfWorkerIds = list
				.stream().filter(worker -> (worker.getBloodGroup() != null
						&& "ONegative".equalsIgnoreCase(worker.getBloodGroup()) && worker.getBloodGroupPrice() < 6000))
				.map(worker -> worker.getId()).collect(Collectors.toList());
		System.out.println("getworkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000===========");
		listOfWorkerIds.forEach(System.out::println);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerIdsWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 "+e.getMessage());
	}

}


private static void getWorkerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000() {
	// TODO Auto-generated method stub
	try {
		List<Worker> list = MyDataBaseWorkerUtil.getListOfWorker(new ArrayList<>());

		Map<Integer, String> listOfWorkerIdWithNames = list.stream()
				.filter(worker -> (worker.getBloodGroup() != null && "ONegative".equalsIgnoreCase(worker.getBloodGroup())
						&& worker.getBloodGroupPrice() < 6000))
				.collect(Collectors.toMap(Worker::getId, Worker::getName, (x, y) -> x + ", " + y,
						LinkedHashMap::new));

		listOfWorkerIdWithNames.forEach((key, value) -> System.out.println("id= " + key + ", name= " + value));
		listOfWorkerIdWithNames.forEach((key, value) -> System.out.println(key + ", " + value));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("error at getWorkerIdsWithNameWhoseBloddGroupIsONegativeAndBloodPriceLessThan6000 "+e.getMessage());
	}

}




}
