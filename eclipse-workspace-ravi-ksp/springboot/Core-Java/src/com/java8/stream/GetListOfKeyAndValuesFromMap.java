package com.java8.stream;

import java.util.Map;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;

public class GetListOfKeyAndValuesFromMap {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = MyDataBaseUtil.getHashMap();

		Map<Integer, String> mapWhoseKeyIsLessThan3 = hashMap.entrySet().stream()
				.filter(singleMap -> singleMap.getValue() != null && singleMap.getKey() != null)
				.filter(singleMap -> singleMap.getKey() < 3)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		mapWhoseKeyIsLessThan3.entrySet().stream()
				.forEach(map -> System.out.println(map.getKey() + "," + map.getValue()));
		System.out.println("=================================");
		// get map whose value starts with A
		Map<Integer, String> mapWhoseValueStartsWithA = hashMap.entrySet().stream()
				.filter(singleMap -> singleMap.getValue() != null && singleMap.getKey() != null)
				.filter(singleMap -> singleMap.getValue().toUpperCase().startsWith("A"))
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
		mapWhoseValueStartsWithA.entrySet().stream()
				.forEach(map -> System.out.println(map.getKey() + "," + map.getValue()));
		System.out.println("=================================");
		// get map whose value starts with B but key greaterthan 3
		Map<Integer, String> mapWhoseValueStartsWithBAndKeyGreaterThan3 = hashMap.entrySet().stream()
				.filter(singleMap -> singleMap.getValue() != null && singleMap.getKey() != null)
				.filter(singleMap -> singleMap.getValue().toUpperCase().startsWith("B") && singleMap.getKey() > 3)
				.collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

		mapWhoseValueStartsWithBAndKeyGreaterThan3.entrySet().stream()
				.forEach(map -> System.out.println(map.getKey() + "," + map.getValue()));

	}

}
