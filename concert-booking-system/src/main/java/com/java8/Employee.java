package com.java8;

public class Employee {
	
	private int id;
	private int deptId;
	private String status;
	private String name;
	private double sal;
	
	public Employee(int id, int deptId, String status, String name, double sal) {
		super();
		this.id = id;
		this.deptId = deptId;
		this.status = status;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", deptId=" + deptId + ", status=" + status + ", name=" + name + ", sal=" + sal
				+ "]";
	}
	
	
	
	
	

}
