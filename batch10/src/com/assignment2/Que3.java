//3. Write the Java Program to declare the local variable as x .
package com.assignment2;

public class Que3 {
	
	void add() {
		int a=30;//local variable
		int b=40;//local variable
		int sum = a+b;
		System.out.println("Sum of local variables is = " +sum);
	}
	public static void main(String[] args) {
		Que3 obj = new Que3();
		obj.add();
	}

}
