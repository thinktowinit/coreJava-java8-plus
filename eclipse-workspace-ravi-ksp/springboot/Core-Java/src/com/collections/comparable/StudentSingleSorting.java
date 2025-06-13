package com.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSingleSorting {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(4, "siva", 7000f));
		al.add(new Student(3, "bheema", 4000f));
		al.add(new Student(9, "ramu", 8000f));
		al.add(new Student(2, "shiva", 10000f));
		al.add(new Student(5, "manoj", 13000f));
		
		Collections.sort(al);
		for(Student se : al){
			System.out.println(se.getId()+ ", "+se.getName()+", "+ se.getFee());
		}
	}

}
