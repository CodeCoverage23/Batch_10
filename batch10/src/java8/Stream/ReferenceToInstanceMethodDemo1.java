package java8.Stream;


//Perticular Object
import java.util.function.Consumer;

public class ReferenceToInstanceMethodDemo1 {
	public void print(String m) {
		System.out.println(m);
	}

	public static void main(String[] args) {
	
		ReferenceToInstanceMethodDemo1 obj = new ReferenceToInstanceMethodDemo1();
		Consumer<String> m1 = obj::print;
		m1.accept("Hello Method Reference");

	}

}
