package SHARAD;

public class LeapYear {
		boolean isLeapYr(int y)  
		{  
		 
		if((y % 100) == 0)  
		{  
		    if((y % 400) == 0)  
		    {  
		        return true;  
		    }  
		    else  
		    {  
		        return false;  
		    }  
		  		}  
		    
		if((y % 4) == 0)  
		{  
		    return true;  
		}  
		  return false;  
		}   
		public static void main(String args[])  
		{  
		LeapYear obj = new LeapYear();  
		   
		int year = 2024;  
		  
		if(obj.isLeapYr(year))  
		{  
		    System.out.println("The year " + year + " is a leap year.");  
		}  
		else  
		{  
		    System.out.println("The year " + year + " is not a leap year.");  
		}  
		  }  
		}


