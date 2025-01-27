package com.basic.exception;

public class ExceptionPropagation {
	
	public void firstMethod() {
		int a = 10/0;
	}
	public void secondMethod() {
		firstMethod();
	}
	public void thirdMethod() {
		secondMethod();
	}
	public static void main(String[] args) {
try {
	new ExceptionPropagation().thirdMethod();
}
catch(Exception e){
	System.out.println("Exception handled");
}
	}

}
