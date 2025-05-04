package com.shiva.java8.method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferance {

	 private static List<String> collect;

	public static void printMessage(String message) {
	        System.out.println(message);
	    }

	    public static void main(String[] args) {
	        List<String> messages = Arrays.asList("Hello", "World", "Java 8", "Method Reference");

	        //int a[];
	        // Using method reference to call printMessage
	        messages.forEach(MethodReferance::printMessage);
	       // a.s
	        collect = messages.stream().filter((a)->a.contains("a")).collect(Collectors.toList());
	    }
}
