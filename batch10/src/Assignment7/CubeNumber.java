/*
	Assignment No. 7: Program-2
	Design method public int getNumberCube(int num), return int value to that
	method and result should be print into main method
	*/

package Assignment7;
import java.util.Scanner;
public class CubeNumber {
	public static int getNumberCube(int num) {
		int result = num * num * num; 
		return result; 
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number>>");
		int number = sc.nextInt(); 
		int result = getNumberCube(number); 
		
		System.out.println("The Cube of number " + number + " is=" + result); 
		}	
	
}