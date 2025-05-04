package com.shiva.java8.funI;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
public interface MyFunctionalInterface {

	//boolean equals(Object obj) ;
	void m1();
	//void m5();

	default void m2() {
		System.out.println("Default method-1");
	}

	default void m3() {
		System.out.println("Default method-2");
	}

	static void m4() {
		System.out.println("static method-1");
	}
	//Consumer<T>
	//Supplier<T>
	//Predicate<T>
	
}
