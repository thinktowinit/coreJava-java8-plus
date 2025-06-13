package com.collections.HashMap;

import java.util.Map;
import java.util.TreeMap;

import com.collections.arraylistcode.MyDataBaseUtil;

public class ConertHashMapToTreeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> hashMapWithOutNull = MyDataBaseUtil.getSampleMapDataWithOutNull();
		Map<Integer, String> treeMapAfterConvertionFromHashMap = new TreeMap<>();
		treeMapAfterConvertionFromHashMap.putAll(hashMapWithOutNull);
		
		
		for (Map.Entry<Integer, String> box : treeMapAfterConvertionFromHashMap.entrySet()) {
			System.out.println(box.getKey() + ", " + box.getValue());
		}
		
		
	}
	
}
