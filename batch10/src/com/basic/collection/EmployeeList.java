package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "John", 22000.55d));
		empList.add(new Employee(106, "Sam", 22500.50d));
		empList.add(new Employee(102, "Karan", 20000.55d));
		empList.add(new Employee(104, "Kiran", 12000.40d));
		empList.add(new Employee(105, "Harry", 25000.55d));
		empList.add(new Employee(103, "John", 50000.65d));

		System.out.println(empList);

		Collections.sort(empList, new IdComparator());

		System.out.println(empList);

		Collections.sort(empList, new NameComparator());

		System.out.println(empList);

		double totalSalary = 0.0;
		for (Employee e : empList) {

			totalSalary += e.getSalary();

		}
		System.out.println("Total Salary : " + totalSalary);

		Collections.sort(empList, new SalaryComparator());

		System.out.println(empList);

	}

}

class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int value = 0;

		if (o1.getId() < o2.getId()) {
			value = 1;
		} else if (o1.getId() > o2.getId()) {
			value = -1;
		} else {
			value = 0;
		}

		return value;
	}

}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return o2.getName().compareTo(o1.getName());
	}
}

class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int value = 0;

		if (o1.getSalary() < o2.getSalary()) {
			value = 1;
		} else if (o1.getSalary() > o2.getSalary()) {
			value = -1;
		} else {
			value = 0;
		}

		return value;
	}

}
