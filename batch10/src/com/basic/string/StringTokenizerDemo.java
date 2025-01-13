package com.basic.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String str = "Java,Python,HTML";
		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		// By split method

		String s = "Happy New Year";
		System.out.println(s);
		String[] split = s.split(" ");

		for (String t : split) {
			System.out.println(t);
		}

	}

}
