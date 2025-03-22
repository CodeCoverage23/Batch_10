package com.basic.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee(101,"John",2200.55d));
		emplist.add(new Employee(105,"Tushar",1200.55d));
		emplist.add(new Employee(109,"Kant",4500.55d));
		emplist.add(new Employee(103,"Nayan",8200.55d));
		emplist.add(new Employee(102,"Shree",4200.55d));
		
//		System.out.println(emplist);
		
		Collections.sort(emplist, new IdComparator());
		
		System.out.println(emplist);
		
		Collections.sort(emplist, new NameComparator());
		System.out.println(emplist);
		
		
		Collections.sort(emplist, new SalaryComparator());
		System.out.println(emplist);
		
		
	}

}

class IdComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1,Employee o2) {
		int value =0;
		if(o1.getId() < o2.getId()) {
			value = 1;
		}
		else if(o1.getId() > o2.getId()) {
			value = -1;
		}
		else {
			value =0;
		}
		return value;
	}
}

class NameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1,Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}
}
class SalaryComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1,Employee o2) {
		int value =0;
		if(o1.getSalary() < o2.getSalary()) {
			value = 1;
		}
		else if(o1.getSalary() > o2.getSalary()) {
			value = -1;
		}
		else {
			value =0;
		}
		return value;
}
}