package com.collections.HashMap;

import java.util.Map;
import java.util.Map.Entry;

import com.collections.arraylistcode.MyDataBaseUtil;

public class MyHashMapForLoop {

	public static void main(String[] args) {

		Map<Integer, String> map = MyDataBaseUtil.getSampleMapData();

		for (Entry<Integer, String> entry : map.entrySet()) {

			System.out.println(entry.getKey() + ", " + entry.getValue());

		}

		System.out.println("below is java8=======================");

		map.entrySet().forEach(entry ->System.out.println(entry.getKey() + ", " + entry.getValue()));

	}

}
