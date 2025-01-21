package com.assignment_8.basic;

import java.util.Scanner;

/*1.2 Design the class as Student Information which takes the input for multiple students 
 * from user and Design method public void getUserInput(), 
 *country is same for all the students. 
 */
public class Assignment8_2 {
	public void getUserInput() {
		Assignment8_1 assig = new Assignment8_1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name: ");
		assig.setFirstName(sc.nextLine());
		System.out.println("Enter the last name: ");
		assig.setLastName(sc.nextLine());
		System.out.println("Enter the city: ");
		assig.setCity(sc.nextLine());
		System.out.println("Enter the mobile number: ");
		assig.setMobileNumber(sc.nextLine());
		
		assig.setCountry("India");
		
		getAssignment8_2(assig.getFirstName(), assig.getLastName(), assig.getCity(), assig.getMobileNumber(), assig.getCountry());
		
	}
	
	
	
	

	private void getAssignment8_2(String firstName, String lastName, String city, String mobileno, String country) {
		
		
		System.out.println("Student Information=>> ");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " +  lastName);
		System.out.println("City: " + city);
		System.out.println("Mobile Number: " + mobileno);
		System.out.println("Country: " + country);
		System.out.println();
		
	}

       public static void main(String[] args) {
		
    	   
    	   Assignment8_2 assign = new Assignment8_2();
    	   
    	   System.out.println("Enter the number of student show ->");
    	   Scanner sc = new Scanner(System.in);
    	   int count = sc.nextInt();
    	   
    	   for(int i = 1; i <= count; i++) {
    		   System.out.println("Enter the students details: ");
    		   assign.getUserInput();
    	   }
    	   System.out.println("<<<<< ALL STUDENT INFORMATION ARE PRINTED>>>>>");
    		sc.close();	   
	}

}
