package com.assignment_8.basic;
/*1.3 Pass the input to getStudentInformation() method
*/

public class Assignment8_3 {
	private String name;
	private int age;
	private String studentId;
	private String city;
	private int mobileNumber;
	
	//constructor
	public Assignment8_3(String name, int age, String studentId, String city, int mobileNumber) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.city = city;
		this.mobileNumber = mobileNumber;
		
	}
	
	// Method to get student information
	public void getStudentInformation() {
		System.out.println("Name: " + name);
		System.out.println("Age: "+age);
		System.out.println("StudentId: " + studentId);
		System.out.println("City: " + city);
		System.out.println("Mobile Number: " + mobileNumber);

	}
	
	public static void main(String[] args) {
		
        //creating a Student object and passing input
		Assignment8_3 assign = new Assignment8_3("Pallavi", 27, "123456789", "Pune", 1234556777);
		assign.getStudentInformation();
	}

}
