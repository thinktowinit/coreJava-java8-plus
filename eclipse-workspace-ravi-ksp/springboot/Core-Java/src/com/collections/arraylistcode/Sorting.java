package com.collections.arraylistcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10, 9, 3, 15, 12));

	public void m1() {

		System.out.println(al);
		System.out.println("ascending order");
		Collections.sort(al);
		System.out.println(al);
		al.forEach(System.out::println);
	}

	public void m2() {
		System.out.println("descending order");

		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		al.forEach(System.out::println);
	}

	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		sorting.m1();
		sorting.m2();
	}

}
