package com.shiv.arrays;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {

		System.out.println("enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println(BasicsConst.CODE_1);	
		}else if(n == 2) {
			System.out.println(BasicsConst.CODE_2);
		}else if(n == 3) {
			System.out.println(BasicsConst.CODE_3);
		}
	}

}
/*
 * enum DaysStatus{ jan,feb,mar,thursday,friday,saturday,sunday }
 */

