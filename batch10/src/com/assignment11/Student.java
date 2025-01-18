package com.assignment11;

public class Student {
	// to stop object creation
	private Student() {
		
	}
	// static method to access class
	public static Student newStudent() {
		return new Student();
	}
	public void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// object create using static method
Student student = Student.newStudent();
student.display();
	}

}
