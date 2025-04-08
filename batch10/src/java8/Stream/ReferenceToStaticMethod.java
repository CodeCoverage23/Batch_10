package java8.Stream;

import java.util.function.Function;

public class ReferenceToStaticMethod {
	
	public static int square(int n) {
		return n * n;
	}

	public static void main(String[] args) {
		Function<Integer, Integer> m= ReferenceToStaticMethod::square;
		System.out.println(m.apply(5));

	}

}
