/*
Assignment No. 7: Program-3
Design method to print factors of given number( Enter no = 6 then
factors should be displayed like 1,2,3,6.
*/

package Assignment7;
import java.util.Scanner;
public class Que3 {

	public static void getFactors(int number) {
			int i = 1;
			while (i <= number) 
			{
			if (number % i == 0) // checks if number is divisible by i or not 
			{
			System.out.println(i); 
			}
			i++;
			}
			
	}
		public static void main(String[] args) {
			
			System.out.println("Enter a number");
			Scanner sc = new Scanner(System.in); 
			int number = sc.nextInt(); 
			System.out.println("The Factors of " + number + " are "); 
			getFactors(number); 
}
}