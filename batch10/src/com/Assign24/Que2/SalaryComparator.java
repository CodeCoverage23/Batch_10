package com.Assign24.Que2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student> {
@Override
public int compare(Student s1, Student s2) {
	return Double.compare(s1.getSalary(), s2.getSalary());
}
}
