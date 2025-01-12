package com.basic.assign6;
import java.util.Scanner;
public class FactorialNum {
	
	    public static int factorial(int no) {
	        int fact = 1;
	        for (int i = 1; i <= no; i++) {
	           fact *= i;  
	        }
	        return fact;
	    }

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();  
	        
	       
	        int result = factorial(number);
	        
	        
	        System.out.println("The factorial of " + number + " is " + result);
	    }
	}



