package com.assignment4;

public class Multiplication {
	
	public int getMultiplication(int a, int b)
	
	{
		int c = a*b;
		return c;
	}

	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();
		int sum = multiplication.getMultiplication(30, 20);
		System.out.println("multiplication of two number:"+sum);

	}

}
