package com.basic.java8.lambda.expression;

interface MethodWithTwoParams {

	void add(int a, int b);

}

public class LambdaExpressionDemo3 {

	public static void main(String[] args) {

		MethodWithTwoParams m = (a, b) -> {
			int c = a + b;
			System.out.println("Addition : " + c);
		};
		m.add(45, 45);

	}

}
