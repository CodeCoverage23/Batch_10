package com.basic.java8.functionalinterface;

@FunctionalInterface
interface Inter {

	void showMessage();

}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Inter i = () -> System.out.println("Hello, Java 8..!");
		i.showMessage();

	}

}
