package com.assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assignment1 {
public static void main(String[] args) {
	//Write the Java program to print the Code Coverage message on console.
	String a="Code";
	//char ch[];
	char res[]= new char[a.length()];
	int j=0;
	for(int i= a.length()-1; i>=0;i--) {
		res[j]=a.charAt(i) ;
		//res[j]= res[i];
		j++;
	}
	String temp = new String(res);
	System.out.println(temp);
	
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}
