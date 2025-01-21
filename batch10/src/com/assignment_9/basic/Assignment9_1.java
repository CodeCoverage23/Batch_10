package com.assignment_9.basic;

/*1. Write the Java program in which create the multiple objects and display the count of number of
objects created into class.
*/

public class Assignment9_1 {
	static int countObjects;
	Assignment9_1(){
		countObjects++;
	}
	public static void getObjectCount() {
		System.out.println("Number of objects in class:" +countObjects);
		
	}
	public static void main(String[] args) {
		Assignment9_1 contObj1 = new Assignment9_1();
		Assignment9_1 contObj2 = new Assignment9_1();
		Assignment9_1 contObj3 = new Assignment9_1();
		Assignment9_1 contObj4 = new Assignment9_1();
		Assignment9_1 contObj5 = new Assignment9_1();
		getObjectCount();
		
	}
	
}