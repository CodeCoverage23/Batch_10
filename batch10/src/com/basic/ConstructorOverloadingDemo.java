package com.basic;

/**
 * This class will be considered as Student Object
 */
public class ConstructorOverloadingDemo {

	int rollNumber;
	String name;
	String address;

	public ConstructorOverloadingDemo(int rollNumber, String name, String address) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	public ConstructorOverloadingDemo(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public void display() {
		System.out.println(rollNumber + " " + name + " " + address);
	}

	public static void main(String[] args) {

		ConstructorOverloadingDemo c1 = new ConstructorOverloadingDemo(101, "Kishor");
		ConstructorOverloadingDemo c2 = new ConstructorOverloadingDemo(102, "Sachin", "Akola");
		c1.display();
		c2.display();
	}

}
