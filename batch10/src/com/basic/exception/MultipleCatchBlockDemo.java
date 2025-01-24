package com.basic.exception;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {

		try {
			String s1 = "1";

			System.out.println(s1 + 1);

			int i = Integer.parseInt(s1);

			System.out.println(i + 1);

			int a = 10 / 0;

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Rest of the code");

	}

}
