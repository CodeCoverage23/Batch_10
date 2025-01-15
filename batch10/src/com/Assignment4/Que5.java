//5. Write the Java Program to calculate total of five subject marks and average of it.
package com.Assignment4;

public class Que5 {
	static void student(int a,int b,int c,int d,int e) {
		int total=(a+b+c+d+e);
	System.out.println("total of five subject marks is : "+total);
	float avg = total/5;
	System.out.println("Average of subject marks is: "+avg);
	
	}
public static void main(String[] args) {
	 student(50,40,80,70,60);
}
}
