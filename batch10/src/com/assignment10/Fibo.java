package com.assignment10;
import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number for fibonacy series");
int count = sc.nextInt();

int n1 = 0;
int n2 = 1;

System.out.println(n1+ "  " +n2);

for(int i=2;i<count;i++) {
	int n3 = n1+n2;
	System.out.print( "  " +n3);
	n1 = n2;
	n2 = n3;
}
	}

}
