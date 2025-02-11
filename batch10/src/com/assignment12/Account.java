package com.assignment12;
import java.util.Scanner;
public class Account {
	
	    int accountNumber;
	    String accountHolderName;

	    // Constructor
	    public Account(int accountNumber, String accountHolderName) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	    }

	    
	    public void getAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account  Holder Name: " + accountHolderName);
	    }

	    
	    public void getAccountInformation() {
	        System.out.println("Account Information: ");
	        getAccountDetails();
	    }

	    // Main method
	    public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter Account Number: ");
	        int accountNumber = scanner.nextInt();  
	        scanner.nextLine();  

	        System.out.print("Enter Account Holder Name: ");
	        String accountHolderName = scanner.nextLine();  

	       
	        Account account = new Account(accountNumber, accountHolderName);
	        account.getAccountInformation(); 

	        System.out.println(); 

	       
	        System.out.print("Enter Account Type (e.g., Saving): ");
	        String accountType = scanner.nextLine();  

	        System.out.print("Enter Balance: ");
	        long balance = scanner.nextLong();  

	        
	        SavingAccount savingAccount = new SavingAccount(accountNumber, accountHolderName, accountType, balance);
	        savingAccount.getSavingAccountInformation(); 

	        // Close the scanner CLASS
	        scanner.close();
	    }
	}

	
	class SavingAccount extends Account {
	    String accountType;
	    long balance;

	   
	    public SavingAccount(int accountNumber, String accountHolderName, String accountType, long balance) {
	        super(accountNumber, accountHolderName);  
	        this.accountType = accountType;
	        this.balance = balance;
	    }

	  
	    public void getSavingAccountDetails() {
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Balance: " + balance);
	    }

	   
	    public void getSavingAccountInformation() {
	        System.out.println("Saving Account Information: ");
	        getAccountDetails();  
	        getSavingAccountDetails();  
	    }
	}

	    
	

