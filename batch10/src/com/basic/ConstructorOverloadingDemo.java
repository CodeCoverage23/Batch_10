package com.basic;

public class ConstructorOverloadingDemo {

	int rollNo;
	String name;
	String address;
	
	
	
	
	public ConstructorOverloadingDemo(int rollNo, String name, String address) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	


	public ConstructorOverloadingDemo(int rollNo, String name) {
	this.rollNo = rollNo;
	this.name = name;
	}
	
	public void display() {
		System.out.println(rollNo + " " + name + " " + address);
	}



	public static void main(String[] args) {
		ConstructorOverloadingDemo c1 = new ConstructorOverloadingDemo(101,"Kk","Pune");
		ConstructorOverloadingDemo c2 = new ConstructorOverloadingDemo(102,"Ko","Akola");
c1.display();
c2.display();
	}

}
