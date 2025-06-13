package com.collections.arraylistcode;

import java.util.ArrayList;

public class TrimToSize {

	public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>(15);
System.out.println(al.size());

al.add("s");
al.add("t");
al.add("w");
al.add("x");
al.add("y");
al.add("z");

System.out.println(al.size());

 al.trimToSize();

System.out.println(al.size());



	}

}


