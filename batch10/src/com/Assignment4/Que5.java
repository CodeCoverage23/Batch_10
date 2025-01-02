package com.Assignment4;

import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Declare variables for the five subjects' marks
	        double s1, s2, s3, s4, s5;
	        
	        // Get marks for each subject from the user
	        System.out.print("Enter marks for Subject 1: ");
	        s1 = scanner.nextDouble();
	        
	        System.out.print("Enter marks for Subject 2: ");
	        s2 = scanner.nextDouble();
	        
	        System.out.print("Enter marks for Subject 3: ");
	        s3 = scanner.nextDouble();
	        
	        System.out.print("Enter marks for Subject 4: ");
	        s4 = scanner.nextDouble();
	        
	        System.out.print("Enter marks for Subject 5: ");
	        s5 = scanner.nextDouble();
	        
	        
	        double totalMarks = s1 + s2 + s3 + s4 + s5;
	        
	       
	        double averageMarks = totalMarks / 5;
	        
	        
	        System.out.println("\nTotal Marks: " + totalMarks);
	        System.out.println("Average Marks: " + averageMarks);
	        
	      
	        scanner.close();
	    }

	}
	

}
