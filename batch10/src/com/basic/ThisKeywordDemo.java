package com.basic;

public class ThisKeywordDemo {

	int rollNo;
	String name;
	String add;
	public ThisKeywordDemo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public ThisKeywordDemo(int rollNo, String name) {
		this(rollNo);
		this.name = name;
	}
	
	public void display() {
		System.out.println(rollNo + " " + name);
	}
		
	public static void main(String[] args) {
		ThisKeywordDemo t = new ThisKeywordDemo(101, "Kant");
		t.display();
	}

}
