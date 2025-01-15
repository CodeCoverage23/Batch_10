package com.basic.oops;


class Parent{
	String name;
	void Show() {
		System.out.println("Parent Class...");
	}
}


public class Downcasting extends Parent {
	int age;
	@Override
void Show() {
	System.out.println("Child Class...");
	
}
	public static void main(String[] args) {
	Parent p = new Downcasting();
	p.name="Tushar";
	Downcasting D = new Downcasting();
	D.age=23;
	System.out.println(D.age);
	System.out.println(p.name);
	D.Show();

	}

}
