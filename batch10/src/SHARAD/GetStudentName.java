/*
	* Assignment No.3
	*
	* Program - Design separate method as String getStudentName(String name)
	* which return student name to that method and print it on console.
	*/

package SHARAD;

public class GetStudentName {

	//public class Test {
	//Design the method with argument or parameter
	String getStudentName(String name) { 
	return name;
	}
	public static void main(String[] args) {
		GetStudentName test = new GetStudentName(); 
	String s = test.getStudentName("viraj"); 
	System.out.println("student name>>" + s); 
	}
	}

