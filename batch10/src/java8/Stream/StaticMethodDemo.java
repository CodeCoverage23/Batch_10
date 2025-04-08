package java8.Stream;

interface Logger{
	static void log(String msg){
		System.out.println("Logging : " + msg);
	}
}


public class StaticMethodDemo {

	public static void main(String[] args) {
		Logger.log("Hello, java 8");

	}

}
	