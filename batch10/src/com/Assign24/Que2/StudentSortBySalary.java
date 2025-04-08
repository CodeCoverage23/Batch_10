package com.Assign24.Que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSortBySalary {

	public static void main(String[] args) {
		
		List<Student> s = new ArrayList<Student>();
		
		s.add(new Student(101,"Tushar",50000));
		s.add(new Student(105,"Kant",90000));
		s.add(new Student(109,"Nayan",10000));
		s.add(new Student(100,"Deep",35000));
		
		Collections.sort(s, new SalaryComparator());
		
		System.out.println("Student Sorted By Sal : ");
		for(Student s1 : s) {
			System.out.println(s1);
		}
	}

}
