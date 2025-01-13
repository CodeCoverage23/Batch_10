package com.basic.oops;

class Parent {

	public void marry() {
		System.out.println("Marry Shantabai");
	}

}

class Child extends Parent {

	@Override
	public void marry() {
		System.out.println("Marry Karishma");
	}

}

class Addition {

	void add(int a, int b) {
		System.out.println(a + b);

	}
}

class Multiplication extends Addition {

	void add(int a, int b) {
		System.out.println(a * b);
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {

		Child c = new Child();
		c.marry();

		Addition a = new Multiplication();
		a.add(11, 11);

	}

}
