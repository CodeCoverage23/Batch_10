
//Design method public int getReverseNumber(int num) which return 
	//	int value to that method and result print into main method.

package Assignment7;
import java.util.Scanner;  
public class Que4 {
	
    
    public static void getReverseNumber(int number)   
    {  
    if (number < 10)   
    {  
    
    System.out.println(number);  
    return;  
    }  
    else   
    {  
    System.out.print(number % 10);  
    getReverseNumber(number/10);  
    }  
    }  
    public static void main(String args[])  
    {  
    System.out.print("Enter the number to reverse: ");  
    Scanner sc = new Scanner(System.in);  
    int num = sc.nextInt();  
    System.out.print("The reverse of the given number is: ");  
    
    getReverseNumber(num);  
    }  
    }


