package com.collections.arraylistinitialization;

import java.util.ArrayList;
import java.util.Collections;

public class FourthType {
	public void m1() {
		ArrayList<String> al = new ArrayList<String>(Collections.nCopies(6, "bheema"));
		System.out.println(al);
	}

	public static void main(String[] args) {
		FourthType fourthType = new FourthType();
		fourthType.m1();

	}

}
