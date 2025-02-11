package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListDemo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();

		l.add(56);
		l.add(96);
		l.add(26);
		l.add(16);
		l.add(76);
		l.add(59);
		l.add(52);

		System.out.println(l);

		Collections.sort(l);

		System.out.println(l);

		List<Student> studentList = new ArrayList<>();

		studentList.add(new Student(101, "Kishor"));
		studentList.add(new Student(102, "Kishor"));
		studentList.add(new Student(105, "Kishor"));

		// Collections.sort(studentList);

	}

}

class Student {

	private int rollNumber;
	private String name;

	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

}
