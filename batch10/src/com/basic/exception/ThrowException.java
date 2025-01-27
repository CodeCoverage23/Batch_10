package com.basic.exception;

public class ThrowException {

	public static void main(String[] args) {
		int a = 20;
		
		if (a<18) {
			throw new RuntimeException("You can vote..");
		} else {
			System.out.println("can vote..!!");
		}

	}

}
