package com.basic.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		String s1 = "Java,Python,HTML";
		StringTokenizer s2 = new StringTokenizer(s1, ",");
		
		while(s2.hasMoreTokens()) {
			System.out.println(s2.nextToken());
		}
		
		//By split method..!!
		
		String s = "Happy New Year";
		System.out.println(s);
		
		String[] split = s.split(" ");
		
		for(String t : split) {
			System.out.println(t);
		}

	}

}
