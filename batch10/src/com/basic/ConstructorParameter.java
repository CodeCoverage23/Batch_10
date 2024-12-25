package com.basic;

public class ConstructorParameter {

	int count;
	String name;

	public ConstructorParameter(int i, String s) {
		count = i;
		name = s;
	}

	public void print() {
		System.out.println(name + " " + count);
	}

	public static void main(String[] args) {

		ConstructorParameter c = new ConstructorParameter(10, "Batch");

		c.print();

	}

}
