package com.basic.exception;

/**
 * Runtime exception or unchecked exception
 */
public class TestCustomException2 {

	public static void main(String[] args) {

		int fund = 5000;
		int transferBalance = 10000;

		if (fund >= transferBalance) {
			System.out.println("Deposited");
		} else {
			throw new FundNotFoundException("Fund not found");
		}

		System.out.println("Rest of the code");
	}

}
