package com.basic.java8.lambda.expression;

interface MethodWithReturnType {

	public int squareIt(int a);

}

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {

		MethodWithReturnType m = a -> a * a;
		int squareIt = m.squareIt(12);
		System.out.println(squareIt);

		System.out.println(m.squareIt(squareIt));

	}

}
