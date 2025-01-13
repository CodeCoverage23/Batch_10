package com.basic.oops;

class Test {
	int data = 10;

	public void display() {
		System.out.println(data);
	}

}

public class InheritanceDemo extends Test {

	public void print() {
		System.out.println("Code Covergae");
	}

	public static void main(String[] args) {

		InheritanceDemo i = new InheritanceDemo();

		i.data = 50;

		i.display();
		i.print();

	}

}
