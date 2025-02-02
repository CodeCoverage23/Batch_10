package com.assignment4;

public class Addition {
	
	public int getAddition(int a, int b)
	{
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		Addition addition = new Addition();//create object
		int sum = addition.getAddition(10, 20);//call method
		System.out.println("Addition of two number:"+sum);

	}

}
