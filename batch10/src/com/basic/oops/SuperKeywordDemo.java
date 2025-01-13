package com.basic.oops;

class Test1 {
	int data;

	public Test1() {
		System.out.println("Parent class contructor");
	}

}

public class SuperKeywordDemo extends Test1 {

	public SuperKeywordDemo() {
		super();
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {

		SuperKeywordDemo s = new SuperKeywordDemo();

	}

}
