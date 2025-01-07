package com.example;

public class NameSurname {

	public static void main(String[] args) {
		 for (int i = 1; i <= 100; i++) {
	            // Check if the number is a multiple of both 5 and 7
	            if (i  == 5*7) {
	                System.out.println(i + ": Mrunali Prasad Kashid");
	            }
	            // Check if the number is a multiple of 5
	            else if (i % 5 == 0) {
	                System.out.println(i + ": My Name is Mrunali");
	            }
	            // Check if the number is a multiple of 7
	            else if (i % 7 == 0) {
	                System.out.println(i + ": My Surname is Kashid");
	            }
	            // For other numbers, do nothing or just print the number
	            else {
	                 System.out.println(i);
	            }
	        }
	    }

	}


