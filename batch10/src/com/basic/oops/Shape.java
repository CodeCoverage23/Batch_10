package com.basic.oops;

abstract class Shape1 {

	public abstract void area();

	public void display() {
		System.out.println("Display...");
	}

	
	public final void finalMethod() {
		System.out.println("Final method");
	}
	
	public abstract void add();
}

public class Shape extends Shape1 {

	public void area() {
		System.out.println("Calculate the area..");
	}

	public static void main(String[] args) {

		Shape s = new Shape();
		s.area();
		s.display();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}