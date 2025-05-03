package com.basic;
	import java.util.Scanner;
	
	import java.util.function.IntConsumer;

	public class OddEven {
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");

	        int number = scanner.nextInt();

	        IntConsumer checkWithMod = (n) -> {
	            if (n % 2 == 0)
	                System.out.println(n + " is Even (checked with modulus)");
	            else
	                System.out.println(n + " is Odd (checked with modulus)");
	        };

	        IntConsumer checkWithoutMod = (n) -> {
	            if ((n & 1) == 0)
	                System.out.println(n + " is Even (checked without modulus)");
	            else
	                System.out.println(n + " is Odd (checked without modulus)");
	        };

	        // Run both checks
	        checkWithMod.accept(number);
	        checkWithoutMod.accept(number);
	  scanner.close();
	    }
	}


