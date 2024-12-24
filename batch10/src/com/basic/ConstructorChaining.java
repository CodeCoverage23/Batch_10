package com.basic;

public class ConstructorChaining {

	String cons;

	public ConstructorChaining() {
		this("Parameteries Constructor");
		System.out.println("Default Constructor");
	}

	public ConstructorChaining(String cons) {
		System.out.println(cons);
	}

	public static void main(String[] args) {

		ConstructorChaining c = new ConstructorChaining();

	}

}
