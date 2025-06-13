package com.collections.HashMap;

import java.util.Map;
import java.util.TreeMap;

import com.collections.arraylistcode.MyDataBaseUtil;

public class MyTreeMapNoNeedSortingBasdedOnKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map treeMap = MyDataBase.getTreeMap();

		for (Map.Entry<Integer, String> box : MyDataBaseUtil.getTreeMap().entrySet()) {
			System.out.println(box.getKey() + ", " + box.getValue());
		}

	}

}
