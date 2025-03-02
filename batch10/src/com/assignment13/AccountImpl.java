package com.assignment13;

	import java.util.Scanner;

	interface Account {
	    void getSavingAccount();
	    void getUserDetails(String name, float balance);
	}

	class AccountImpl implements Account {

	    public void getSavingAccount() {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter your account balance: ");
	        float balance = scanner.nextFloat();
	        
	        getUserDetails(name, balance);
	        scanner.close();
	    }

	    public void getUserDetails(String name, float balance) {
	        System.out.println("\nAccount Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Balance: " + balance);
	    }
	
   public static void main(String[] args) {
	        // Create an instance of AccountImpl
	        AccountImpl account = new AccountImpl();
	        
	        // Call the getSavingAccount method to start the process
	        account.getSavingAccount();
	    }
	}


