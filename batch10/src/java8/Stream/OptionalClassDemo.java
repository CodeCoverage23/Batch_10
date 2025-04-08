package java8.Stream;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		
		Optional<String> op = Optional.of("Hello java");
		
		if(op.isPresent()) {
			System.out.println("Value: " +op.get());
		}
		
		//By using Lambda Expression..!!
		
		op.ifPresent(value -> System.out.println("Using ifPresent: " +value));

	}

}
