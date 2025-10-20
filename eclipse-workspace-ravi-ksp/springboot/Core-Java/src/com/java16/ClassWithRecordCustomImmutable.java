package com.java16;

//for create custom immutable class
public record ClassWithRecordCustomImmutable
(int id, String name, String section, String className, int age) {
	
	public void m1() {
		// TODO Auto-generated method stub
		ClassWithRecordCustomImmutable classWithRecord = new ClassWithRecordCustomImmutable(1, "sdf", "sdfsd", "sdfds", 2);
		ClassWithRecordCustomImmutable classWithRecord2 = new ClassWithRecordCustomImmutable(1, "dgg", "sdfsd", "sdfds", 2);
		//classWithRecord.name="sdfsf"; 
		//error here,  not  allowed to set value, y bcz record makes class as immutable
	}
	
}
