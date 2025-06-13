package com.java16;

public class MainClassUsedForRecordClass {

	public static void main(String[] args) {

		ClassWithRecordCustomImmutable classWithRecord = new ClassWithRecordCustomImmutable(1, "sdf", "sdfsd", "sdfds", 2);
		System.out.println(classWithRecord.id());
		System.out.println(classWithRecord.name());

	}

}
