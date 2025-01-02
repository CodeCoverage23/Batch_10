package com.assignment_4.basic;

import java.util.Scanner;

/*
 * 5. Write the Java Program to calculate total of five subject marks and average of it.
 */

public class Assignment4_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Marks of five subjects
		System.out.println("Enter marks of five subjects: ");
		
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		
		sc.close();
		//lets calculate total
		
		int totalMarks = sub1+sub2+sub3+sub4+sub5;
		
		//lets calculate average
		
		int averageMarks = totalMarks / 5;
		
		System.out.println("Total marks: " + totalMarks);
		System.out.println("Average marks: " + averageMarks);
		
				
			}

}
