package SHARAD;

public class FirstCharacter {

	
	    public static void
	    firstCharacter(String str)
	    {
	 int n = str.length();
	 
	       char first = str.charAt(0);
	 
	        System.out.println("First Charcter is : " + first);
	      }
	    public static void main(String args[])
	    {
	       
	        String str = "SHARAD";
	 firstCharacter(str);
}
}
