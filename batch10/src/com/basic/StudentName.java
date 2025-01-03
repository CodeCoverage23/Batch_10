package com.basic;

public class StudentName {

	 public static String getStudentName(String name) {
	        return name;
	    }

	    public static void main(String[] args) {
	        
	        String studentName = "Swami Dhok";  
	      
	        String name = getStudentName(studentName);
	        System.out.println("The student name is: " + name);
	    }

}
