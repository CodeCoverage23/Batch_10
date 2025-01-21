package com.assignment_8.basic;

import java.util.Scanner;

/*
 * 1.4 Print the multiple student information into getStudentInformation () method.
 */


class Student{
	
	private String name;
	private int age;
	private String studentId;
	private String grade;
	
	
	//Constructor
	Student(String name, int age, String studentId, String grade){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.grade = grade;
	}
	
	// Getter methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getGrade() {
		return grade;
	}
	
	
	//Method to display student information
	
	void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("StudentId: " + getStudentId());
		System.out.println("Grade: " + getGrade());
		System.out.println();
	}
	
	
	}

public class Assignment8_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		
		int numberOfStudents = sc.nextInt();
		sc.nextLine();   //Consume newline
		
		Student[] stud = new Student[numberOfStudents];
		
		for(int i = 0; i< numberOfStudents; i++) {
			System.out.println("Enter the details of student: " + (i + 1) + ":");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Age: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("StudentId: ");
			String studentId = sc.nextLine();
			System.out.println("Grade: ");
			String grade = sc.nextLine();
			
			stud[i] = new Student(name, age, studentId, grade);
			
		}
		
		//Calling the method to print student information
		getStudetInformation(stud);
		
        sc.close();
	}
	
	//Method to print multiple student information
	
	static void getStudetInformation(Student[] students) {
		for(Student stud : students) {
			stud.displayInfo();
		}
	}


}
