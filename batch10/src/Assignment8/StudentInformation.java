


package Assignment8;
import java.util.Scanner;
public class StudentInformation {

	public static void main(String[] args) {
	System.out.println("enter the  number of student : ");
	Scanner sc= new Scanner(System.in);
int number = sc.nextInt();
for(int i=1;i<=number;i++) {
	getUserInput();
	
}
	}
	public static void getUserInput() {
		Student student=new Student();
		System.out.println("enter the student details >> ");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first Name >>");
		String firstName = sc.nextLine();
		System.out.println("enter the last Name >>");
		String lastName = sc.nextLine();
		System.out.println("enter the city >>");
		String city = sc.nextLine();
		System.out.println("enter the mobile  number >>");
		long  mobileNumber = sc.nextLong();
		getStudentInformation(firstName,lastName,city,mobileNumber,student.country);
	}
	public static  void getStudentInformation(String firstName,String lastName,String City,long mobileNumber,String country)
	{
		System.out.println("Student Information");
		System.out.println("firstName :"+firstName);
		System.out.println("lastName :"+lastName);
		System.out.println("city :"+City);
		System.out.println("mobileNumber :"+mobileNumber);
		System.out.println("country :"+country);
		
	}

}
