package com.basic.oops;

abstract class Shape1{
	public abstract void  area();
	public void display() {
		System.out.println("Display...");
	}
}
public class AbstractMethod  extends Shape1{
	public void area() {
		System.out.println("Print...");
	}
	public static void main(String[] args) {
		AbstractMethod s = new AbstractMethod();
		s.area();
		s.display();

	}

}
