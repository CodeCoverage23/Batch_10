package com.basic.inheritance;


class test1{
	public test1() {
		System.out.println("Parrent Class");
	}
}
public class superKeyword extends test1 {
public superKeyword() {
	super();
	System.out.println("Child Class");
}
	public static void main(String[] args) {
		superKeyword s = new superKeyword();
	}

}
