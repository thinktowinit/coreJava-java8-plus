package com.java16;

public class ClassWithOutRecord {

	public ClassWithOutRecord(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
