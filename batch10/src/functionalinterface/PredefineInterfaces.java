package functionalinterface;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefineInterfaces {

	public static void main(String[] args) {
		
		// Predicate Interface - Conditional check..!!
		
//		Predicate<Integer> p = t -> t==100;
////		boolean test = p.test(90);
//		System.out.println(p.test(90));
//		System.out.println(p.test(100));
//		
//		Predicate<String> p2 = s -> s.contains("C");
//		System.out.println(p2.test("Code Coverrage"));
//		
//		// Function Interface - accepts the data and gives result..!!
//		
//		Function<Integer, String> f1 = i -> {
//			int c = i*i;
//			System.out.println(c);
//			return "String : " + c;
//		};
//		System.out.println(f1.apply(25));
		
//		Function<Integer, String> f2 = i -> i * i + " it is square of " + i;
//		System.out.println(f2.apply(9));
//		
//		Function<Integer, Integer> f3 = f -> f * f;
//		System.out.println(f3.apply(12));
//		
//		Function<String, String> f4 = s -> s.toUpperCase();
//		System.out.println(f4.apply("tushar"));
		
		// Consumer Interface - consume the data
		
//		Consumer<String> c1 = c-> System.out.println(c);
//		c1.accept("con interface");
		
//		Consumer<Integer> c2 = c ->{
//			int a= c+ 500;
//			System.out.println(a);
//		};
//		
//		c2.accept(44);
		
		// Supplier Interface - supplies the data
		
		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());
		
		Supplier<String> s2 = () ->UUID.randomUUID().toString();
		System.out.println(s1.get());		

	}

}
