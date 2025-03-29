package functionalinterface;


//interface Inter {
//	void showMessage();
//}
//
//public class FunctionalInterfaceDemo {
//
//	public static void main(String[] args) {
//		Inter i = () -> System.out.println("Hello, java 8.!");
//		i.showMessage();
//	}
//
//}


interface Inter {
	public int showMessage(int a);
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Inter i = a -> a*a;
		int showMessage = i.showMessage(13);
			
			System.out.println(showMessage);
		
		
		
	}

}