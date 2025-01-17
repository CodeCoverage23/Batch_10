package com.assignment8;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentInformation {
	private ArrayList<Student> students; // List to store students
    private String country; // Country shared  all students

    // Constructor to initialize the list and country
    public StudentInformation(String country) {
        students = new ArrayList<>();
        this.country = country;
    }

    // Method to get student details from  user
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter student details:");

            // Get input for first name, last name, city, and mobile number
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("Mobile Number: ");
            String mobileNumber = scanner.nextLine();

            // Create a new student object with the provided details and the shared country
            Student student = new Student(firstName, lastName, city, mobileNumber, country);
            students.add(student); // Add student to the list

            // Ask if the user wants to add another student
            System.out.print("Add another student? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break; // Exit loop when user is done
                
            }
           // scanner.close();
        }
scanner.close();
}
    public void displayStudentInformation() {
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.display(); // Display each student's info
           
        }
    }
    
}
    
