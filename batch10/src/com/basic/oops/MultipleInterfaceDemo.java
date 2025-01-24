package com.basic.oops;

interface A1 {
	String message();
}

interface B1 {

	String message();
}

public class MultipleInterfaceDemo implements A1, B1 {

	@Override
	public String message() {
		return "Code Coverage";

	}

	public static void main(String[] args) {

		MultipleInterfaceDemo m = new MultipleInterfaceDemo();

		System.out.println(m.message());

	}

}
