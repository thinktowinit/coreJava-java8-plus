package com.IQ.StringCpAndHeap;

public class A {

	public static void main(String[] args) {

		String x = "abc";
		String y = "abc";

		String p = new String("abc");
		String q = new String("abc");

		System.out.println(x == y);
		System.out.println(x.equals(y));

		System.out.println(y.equals(p));
		System.out.println(x.equals(q));
		System.out.println(x == p);
		System.out.println(q.equals(p));
		System.out.println(q == p);

	}

}
