package com.basic.oops;

public class CompileTimePolymorphismDemo {

	public static void main(String[] args) {
		
		CompileTimePolymorphismDemo c =  new CompileTimePolymorphismDemo();
		
		int a = c.add(11, 44);
		System.out.println(a);
		
		int b = c.add(11, 44, 44);
		System.out.println(b);
		
		System.out.println(c.division(144,11.5f));
		System.out.println(c.division(144,12));

	}
	
	//By Changing number of parameters..!!
	
	public int add(int a , int b) {
		return a+b;
	}
	public int add(int a , int b , int c) {
		return a+b+c;
	}
	
	//By Changing data types of parameters..!!
	
	public double division(int a , int b) {
		return a/b;
	}
	public double division(int a , float b) {
		return a/b;
	}
	

}
