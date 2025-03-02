package com.assignment14;
import java.util.Scanner;
public class MultiplyTables {

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the starting number for the tables: ");
	        int start = scanner.nextInt();

	        System.out.print("Enter the ending number for the tables: ");
	        int end = scanner.nextInt();
	        for (int i = start; i <= end; i++) {
	            System.out.println("Multiplication Table for " + i + ":");
	           
	            for (int j = 1; j <= 10; j++) {
	                System.out.print( i + " * " + j + " = "+  (i * j ) );
	                
	     System.out.println();
	            }
	        }
	        
	        // Close the scanner
	        scanner.close();
	    }
	}


