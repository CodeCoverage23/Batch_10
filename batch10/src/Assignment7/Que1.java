//Design method to check whether the character is alphabet, digit and special symbol.
package Assignment7;
import java.util.Scanner; 
public class Que1 {
	public static void main(String[] args)
    {
        
      char ch;
 
      Scanner s=new Scanner(System.in);
      System.out.println("Input a character: ");
      ch = s.next().charAt(0);
 
      if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
    {
       System.out.println("This is an alphabet.");
    }
    else if(ch>='0' && ch<='9')
    {
       System.out.println("This is a digit.");
    }
    else
    {
        System.out.println("This is a special character.");
    }
}
}
