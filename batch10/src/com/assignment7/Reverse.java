package com.assignment7;
import java.util.Scanner;
public class Reverse {

	 public static int getReverseNumber(int num) {
	        int revers = 0;

	        // Reverse the digits of the number
	        
	        while (num != 0) {
	            int digit = num % 10;  // Get the last digit
	            revers = revers * 10 + digit;  // Add the digit to the reversed number
	            num = num / 10;  // Remove the last digit
	        }
	        return revers;
	 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.print("Enter a Number: ");
        int number = scanner.nextInt();  

        // Call the method 
        int reversedNumber = getReverseNumber(number);

        // Print the reversed number
        System.out.println("Reverse Number : " + reversedNumber);

        // Close the scanner
        scanner.close();
    

	}

}
