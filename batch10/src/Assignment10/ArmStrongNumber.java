/* Assignment No. 10:
	Program-3
	Write java program to check whether number is Armstrong or not.
	(A positive number is called Armstrong number if it is equal to the sum of cubes of its digits
	for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.
	*/

package Assignment10;
import java.util.Scanner;
public class ArmStrongNumber {
	
	public boolean isArmstrongNumber(int input) {
	int tempValue = input;
	int sum = 0; 
	while (input != 0) {
	int remainder = input % 10; 
	sum = sum + (remainder * remainder * remainder); // sum of all cube of digit
	input = input / 10;
	}
	
	if (sum == tempValue)
	return true;
	else
	return false;
	}
	public static void main(String[] args) {
	ArmStrongNumber armStrongNumber = new ArmStrongNumber();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int value = sc.nextInt();
	
	if (armStrongNumber.isArmstrongNumber(value))
	System.out.println(value + " is armstrong number.");
	else
	System.out.println(value + " is not armstrong number.");
	}
	}


