package com.assign9;

/*
 * Write the Java program in which create the multiple objects and display the count of number of
objects created into class.

 */

public class CountObject {
	
	static int count =0;
	
	public CountObject() {
		count++;
	}

	public static void main(String[] args) {
		
		CountObject a1= new CountObject();
		CountObject a2= new CountObject();
		CountObject a3= new CountObject();
		CountObject a4= new CountObject();
		
		System.out.println("No of object created  : "+ count);
		

	}

}
