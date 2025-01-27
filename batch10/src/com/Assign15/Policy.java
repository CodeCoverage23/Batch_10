package com.Assign15;

import java.util.Scanner;

public class Policy {
	
	private int policyId;
	private String policyName;
	private String policyType;
	private double premiumAmount;
	
public Policy(int policyId, String policyName, String policyType, double premiumAmount) {
	this.policyId = policyId;
	this.policyName = policyName;
	this.policyType = policyType;
	this.premiumAmount = premiumAmount;
}

public Policy getPolicyDetails() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Policy Id ");
	int policyId = sc.nextInt();
	  sc.nextLine();
	
	System.out.println("Enter Policy Name ");
	String policyName = sc.nextLine();
	
	System.out.println("Enter policy Type ");
	String policyType = sc.nextLine();
	
	System.out.println("Enter primium Amount ");
	double premiumAmount = sc.nextDouble();
	
	return new Policy(policyId, policyName, policyType,premiumAmount );
}
public void displayPolicyDetails() {
    System.out.println("Policy Details:");
    System.out.println("Policy ID: " + policyId);
    System.out.println("Policy Name: " + policyName);
    System.out.println("Policy Type: " + policyType);
    System.out.println("Premium Amount: " + premiumAmount);
}

	public static void main(String[] args) {
		
//		 Policy policy = new Policy(0, "", "", 0.0);
		Policy policy = new Policy();
		 
		 policy = policy.getPolicyDetails();
		 
		 policy.displayPolicyDetails();
		

	}

}
