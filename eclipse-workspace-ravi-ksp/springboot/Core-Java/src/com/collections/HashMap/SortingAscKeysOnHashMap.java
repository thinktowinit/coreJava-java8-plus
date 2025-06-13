package com.collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.collections.arraylistcode.MyDataBaseUtil;

public class SortingAscKeysOnHashMap {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = MyDataBaseUtil.getSampleMapData();

		System.out.println("size of map ==> " + hashMap.size());
		// m.entrySet() means , will get all entries from map
		// every entry have key and alue, Entry<Integer, String>

		for (Map.Entry<Integer, String> box : hashMap.entrySet()) {
			System.out.println(box.getKey() + ", " + box.getValue());
		}

		System.out.println("============above map is NOT sorting based on key===============");
		System.out.println("============Below map is sorting based on key===============");
		Map<Integer, String> hashMapAfterSortingUsingKey = hashMap.entrySet().stream()
				.filter(entry -> entry.getKey() != null && entry.getValue() != null).sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		for (Map.Entry<Integer, String> box : hashMapAfterSortingUsingKey.entrySet()) {
			System.out.println(box.getKey() + ", " + box.getValue());
		}

	}

}