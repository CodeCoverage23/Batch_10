package com.Assignment3;

import java.util.Scanner;

public class String_que {

	
	static String getStudentName (String name) {
		System.out.println("The name of the Student is :");
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the student name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String studentName=getStudentName (name);
		System.out.println(studentName);
		
		sc.close();
	}

}
