package com.basic.oops;


class parent{
	void show() {
		System.out.println("Parent class..");
	}
}

public class Upcasting extends parent {
void show() {
	System.out.println("Child class...");
}
	public static void main(String[] args) {
		parent p =new Upcasting();
		p.show();

	}

}
