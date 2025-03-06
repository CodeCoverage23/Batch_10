package com.basic.java8.functionalinterface;

import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineInterfaces {

	public static void main(String[] args) {

		// Predicate Interface - Conditional check

		Predicate<Integer> p = t -> t == 100;
		boolean test = p.test(90);
		System.out.println(test);
		System.out.println(p.test(100));

		Predicate<String> p2 = s -> s.contains("C");
		System.out.println(p2.test("CodeCoverage"));

		System.out.println("*****************************************");

		// Function Interface - accepts the data and gives result

		Function<Integer, String> f1 = i -> {
			int c = i * i;
			return "Square : " + c;
		};
		System.out.println(f1.apply(25));

		Function<Integer, String> f2 = i -> i * i + " it is Square of " + i;
		System.out.println(f2.apply(5));

		Function<Integer, Integer> f3 = f -> f * f;
		System.out.println(f3.apply(88));

		Function<String, String> f4 = s -> s.toUpperCase();
		System.out.println(f4.apply("java is a programming language"));

		System.out.println("*****************************************");

		// Consumer Interface - consume the data

		Consumer<String> c1 = c -> System.out.println(c);
		c1.accept("This is an consumer interface");

		Consumer<Integer> c2 = c -> {
			int a = c + 500;
			System.out.println(a);
		};
		c2.accept(44);
		System.out.println("*****************************************");

		// Supplier Interface - supplies the data

		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());

		Supplier<String> s2 = () -> UUID.randomUUID().toString();
		System.out.println(s2.get());

	}

}
