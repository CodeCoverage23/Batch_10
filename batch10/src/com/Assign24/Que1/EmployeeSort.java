package com.Assign24.Que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList();
		
		emp.add(new Employee(101,"Tushar","Nagpur"));
		emp.add(new Employee(105,"Kant","Mumbai"));
		emp.add(new Employee(98,"Deep","Hydrabad"));
		emp.add(new Employee(78,"Krishna","Pune"));
		emp.add(new Employee(103,"Nayan","Goa"));
		
//		Collections.sort(emp);
		
//		
//		System.out.println("EmpolyeeList Sorted : ");
//		for(Employee e : emp) {
//			System.out.println(e);
//		}
		
		emp.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	}

}
