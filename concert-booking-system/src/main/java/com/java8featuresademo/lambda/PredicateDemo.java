package com.java8featuresademo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		/*Predicate<Integer> p = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(p.test(10));
		*/
		//Predicate<Integer> p = t->t%2==0;
		Consumer<Integer> c = (t)->System.out.println(t);
		//System.out.println(p.test(11));
		
		List<Integer> l =Arrays.asList(1,2,3,4,5);
		//l.stream().filter(p).forEach(c);
		l.stream().filter(t->t%2==0).forEach(System.out::println);
		List<Integer> l2 =Arrays.asList(7,4,8,5,9);
		Collections.sort(l2);
		System.out.println(l2);
	}
}
