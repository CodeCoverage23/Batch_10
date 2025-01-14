package com.assignment7;
import java.util.Scanner;
public class CheckCharAlpha {
	 public static String checkChar(char c) {
	        int num = (int) c;

	        //Alphabet (A-Z or a-z)
	        if ((num >= 65 && num <= 90) || (num >= 97 && num <= 122)) {
	            return "Alphabet";
	        }
	        // For digit (0-9)
	        else if (num >= 48 && num <= 57) {
	            return "Digit";
	        }
	        // For special symbol
	        else {
	            return "Special Symbol";
	        }
	    }

	    public static void main(String[] args) {
	        // Create a scanner object
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.print("Enter a character: ");
	        char inputChar = sc.next().charAt(0);  // Read the first character entered by the user
	        
	        // Categorize the character and display the result
	        System.out.println("The character '" + inputChar + "' is a: " + checkChar(inputChar));
	        
	        sc.close();  // Close the scanner
	    }
	}


