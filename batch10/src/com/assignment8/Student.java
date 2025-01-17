package com.assignment8;

public class Student {

	 private String firstName;
	    private String lastName;
	    private String city;
	    private String mobileNumber;
	    private String country;
	    
	    // CONSTRUCTOR
	    public Student(String firstName, String lastName, String city, String mobileNumber, String country) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.city = city;
	        this.mobileNumber = mobileNumber;
	        this.country = country;
}
	    
	    public void display() {
	        System.out.println("Name: " + firstName + " " + lastName);
	        System.out.println("City: " + city);
	        System.out.println("Mobile Number: " + mobileNumber);
	        System.out.println("Country: " + country);
	        
	    }
	    
}