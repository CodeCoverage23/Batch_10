package com.basic.inheritance;


interface A {
	void display(); 
}

interface B{
	void show() ;
}
class C implements A,B{
	public void display() {
		System.out.println("Printing Documents");
	}
	public void show() {
		System.out.println("Showing Documents");
	}
}

public class MultiplyInherotanceDemo{

	public static void main(String[] args) {
C c1 = new C();
c1.display();
c1.show();

	}

}
