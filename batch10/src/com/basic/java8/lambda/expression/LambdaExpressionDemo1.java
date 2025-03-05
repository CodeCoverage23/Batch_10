package com.basic.java8.lambda.expression;

interface FunctionalInterface {

	public void print();

}

//Traditional Way
public class LambdaExpressionDemo1 implements FunctionalInterface {

	public static void main(String[] args) {

		LambdaExpressionDemo1 d = new LambdaExpressionDemo1();
		d.print();

		// Implementation by using lambda expression
		FunctionalInterface f = () -> System.out.println("Java Eight Features");
		// Invocation
		f.print();

	}

	@Override
	public void print() {

		System.out.println("Java 8 features");
	}

}
