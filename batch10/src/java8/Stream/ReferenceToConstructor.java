package java8.Stream;

import java.util.function.Supplier;

//Reference to a constructor...

class Student{
	Student(){
		System.out.println("Student Object Created..!!");
	}
}
public class ReferenceToConstructor {

	public static void main(String[] args) {
		Supplier<Student> m = Student::new;
		m.get();

	}

}
