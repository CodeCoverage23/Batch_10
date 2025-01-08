package com.example;

public class NameSurname {

	public static void main(String[] args) {
		 for (int i = 1; i <= 100; i++) {
	           
	            if (i  == 5*7) {
	                System.out.println(i + " Mrunali Prasad Kashid");
	            }
	           
	            else if (i % 5 == 0) {
	                System.out.println(i + " My Name is Mrunali");
	            }
	          
	            else if (i % 7 == 0) {
	                System.out.println(i + " My Surname is Kashid");
	            }
	           
	            else {
	                 System.out.println(i);
	            }
	        }
	    }

	}


