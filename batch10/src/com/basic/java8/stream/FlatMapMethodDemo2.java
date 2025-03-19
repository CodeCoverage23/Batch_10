package com.basic.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapMethodDemo2 {

	public static void main(String[] args) {

		List<String> teamA = Arrays.asList("Virat", "Rohit", "Rahul", "Kuldeep");
		List<String> teamB = Arrays.asList("John", "Scott", "David", "Harry");
		List<String> teamC = Arrays.asList("Ken", "Sam", "Lathom", "Fap","Ken", "Sam", "Lathom", "Fap");

		List<List<String>> cricketPlayers = Arrays.asList(teamA, teamB, teamC);

		// without stream
		for (List<String> list : cricketPlayers) {
			for (String s : list) {
				System.out.println(s);
			}
		}

		// With Stream

		cricketPlayers.stream()
				.flatMap(f -> f.stream()).toList().stream()
				.filter(e -> e.length() <4)
				.map(m -> m.toUpperCase())
				.distinct()
				.forEach(System.out::println);

	}

}
