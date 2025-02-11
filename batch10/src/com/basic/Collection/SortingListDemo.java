package com.basic.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListDemo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(56);
		l.add(45);
		l.add(78);
		l.add(23);
		l.add(10);
		l.add(89);
		l.add(30);
		
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(101, "Tushar"));
		studentList.add(new Student(102, "Kant"));
		studentList.add(new Student(104, "Deep"));
		studentList.add(new Student(108, "Nayan"));
		
//		Collections.sort(studentList);
//		System.out.println(studentList);

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
