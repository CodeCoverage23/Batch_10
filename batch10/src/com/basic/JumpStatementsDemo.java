package com.basic;

public class JumpStatementsDemo {

	public static void main(String[] args) {

		// break
		int num = 12;
		int i = 1;
		while (i <= 10) {
			int b = num * i;

			System.out.println(b);

			if (i == 5) {
				break;
			}

			i++;
		}

	}

	public int add() {
		return 10 + 20;
	}

}
