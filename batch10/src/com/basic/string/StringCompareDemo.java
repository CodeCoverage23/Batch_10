package com.basic.string;

public class StringCompareDemo {

	public static void main(String[] args) {
		String s1 = "Code";
		String s2 = "Code";
		
		String s3 = new String("Code");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,3));
		
		
	}

}
