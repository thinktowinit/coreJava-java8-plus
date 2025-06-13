package com.collections.comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private float fee;

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

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public Student(int id, String name, float fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	@Override
	public int compareTo(Student s) {
		if (id == s.id) {
			return 0;
		} else if (id > s.id) {
			return 1;
		} else {
			return -1;
		}
	}

}
