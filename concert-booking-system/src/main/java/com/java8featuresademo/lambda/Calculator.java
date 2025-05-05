package com.java8featuresademo.lambda;

import java.util.function.Consumer;

@FunctionalInterface
interface Calculator {

	//void switchOn();
	//void sub1(int a,int b);
	int sub(int a,int b);
}
 class CalculatorImpl{
	
	 //traditional way
	 // need to impliment interface
	/*@Override
	public void switchOn() {
		System.out.println("Calculator is On");
		
	}*/
	
	 //java 8
	//no need to impliment interface
	// synatx
	//()->{};
	public static void main(String[] args) {
		
		/*CalculatorImpl c = new CalculatorImpl();
		c.switchOn();*/
		/*Calculator c =()->System.out.println("Calculator is On using java 8");
		c.switchOn()*/;
		/*Calculator c = (a ,b)->System.out.println(a-b);
		 * 
		c.sub(50, 30);*/
		//String s1 = "Shiv";
		try {
			String s1 = "GFG";
			String s2 = "";
			System.out.println(s1.equals(s2)); 
			System.out.println(s1 == s2); 
			someMethod(null);
			return ;
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("hi");
		}
	}
	  public static void someMethod(Object o) {
		System.out.println("Object method Invoked");
		}
		public static void someMethod(String s) {
		System.out.println("String method Invoked");
		}
		
}
 
 
 
 
 
 
 
  
 
 
 
 
 
 
 
 
 
 
