package com.shiv.basics;

import java.util.Scanner;

// Prime number is a number that is greater than 1 and divided by 1 or itself only
public class primeNo {
	public static void main(String args[]) {
		int n1, n2, flag = 0, m = 0, sum = 0, count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter from no");
		n1 = sc.nextInt();
		System.out.print("Enter To no");
		n2 = sc.nextInt();
		for (int i = n1; i <= n2; i++) {
			m = i / 2;
			if (i == 0 || i == 1) {
				// System.out.print(i+" is not a prime no");
			} else {
				for (int j = 2; j <= m; j++) {
					if (i % j == 0) {
						flag = 1;
						break;
					    }
					 }
					if (flag == 0) {
					   System.out.print(i);
						sum += i;
						count++;
					} /*
						 * else{ System.out.print(i+" is not a prime no"); }
						 */
				}
			

		}
		System.out.println();
		System.out.println("sum of all prime no between " + n1 + " and " + n2 + " is " + sum);
		System.out.println("count of all prime no between " + n1 + " and " + n2 + " is " + count);
	}

}
