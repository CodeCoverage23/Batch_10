package com.basic.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.basic.collection.Employee;

public class FilterMapDemo {

	public static void main(String[] args) {

		// List<Employee> asList = Arrays.asList(new Employee(10, "John", 56000D));

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "John", 56000D));
		empList.add(new Employee(20, "Sam", 55000D));
		empList.add(new Employee(30, "Swap", 54000D));
		empList.add(new Employee(40, "Kiran", 52000D));
		empList.add(new Employee(50, "Harry", 61000D));
		System.out.println(empList);

		// get the emp with salary < 55
		List<Employee> empListWithSalary55 = empList.stream().filter(f -> f.getSalary() > 55000D)
				.collect(Collectors.toList());
		System.out.println(empListWithSalary55);

		// get emp salary
		List<Double> empSalary = empList.stream().map(m -> m.getSalary()).toList();
		System.out.println(empSalary);

	}

}
