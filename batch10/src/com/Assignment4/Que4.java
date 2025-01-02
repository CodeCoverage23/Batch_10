package com.Assignment4;
//Division

public class Que4 {

	 public static void main(String[] args) {
	       
	        int n1 = 20;
	        int n2 = 5;

	        
	        int result = divide(n1, n2);

	        System.out.println("The result of dividing " + n1 + " by " + n2 + " is: " + result);
	    }
	  public static int divide(int numerator, int denominator) {
	        
	        if (denominator != 0) {
	            return numerator / denominator;
	        } else {
	            System.out.println("Error: Division by zero is not allowed.");
	            return 0; 
	        }
	    }

	   
}
