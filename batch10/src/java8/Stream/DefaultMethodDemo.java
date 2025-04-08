package java8.Stream;


interface Vechicle{
	default void start() {
		System.out.println("Can Start");
	}
}
class car implements Vechicle {}


public class DefaultMethodDemo{
	public static void main(String[] args) {
		car c = new car();
		c.start();
	}
}

