package com.basic;

public class ContinueStmtDemo {

	public static void main(String[] args) {
		// continue
		int num = 12;
		int i = 1;
		while (i <= 10) {
			int b = num * i;
			i++;
			if (i == 5) {
				continue;
			}
			System.out.println(b);

		}
	}

}
