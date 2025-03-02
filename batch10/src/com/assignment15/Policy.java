package com.assignment15;
import java.util.Scanner;
public class Policy {

	    private int policyId;
	    private String policyName;
	    private String policyType;
	    private double premiumAmount;
	    // Constructor
	    public Policy(int policyId, String policyName, String policyType, double premiumAmount) {
	        this.policyId = policyId;
	        this.policyName = policyName;
	        this.policyType = policyType;
	        this.premiumAmount = premiumAmount;
	    }
	    public Policy getPolicyDetails() {
	        return this; // Return the object
	    }

	    public void displayPolicyDetails() {
	        System.out.println("\nPolicy Details:");
	        System.out.println("Policy ID: " + policyId);
	        System.out.println("Policy Name: " + policyName);
	        System.out.println("Policy Type: " + policyType);
	        System.out.println("Premium Amount: " + premiumAmount);
	    }
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Policy ID: ");
	        int policyId = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Enter Policy Name: ");
	        String policyName = scanner.nextLine();
	        System.out.print("Enter Policy Type: ");
	        String policyType = scanner.nextLine();
	        System.out.print("Enter Premium Amount: ");
	        double premiumAmount = scanner.nextDouble();
	        Policy policy = new Policy(policyId, policyName, policyType, premiumAmount);
 Policy policyDetails = policy.getPolicyDetails();
	        policyDetails.displayPolicyDetails();

	        scanner.close();
	    }
	

}
