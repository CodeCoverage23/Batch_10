package com.Assign24.Que2;


//2. Suppose I have Student class containing I'd, name and salary now I want to sort the data based on comparator interface by using salary.


public class Student {
	private int id;
	private String name;
	private double salary;
	
	public Student(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	

}
