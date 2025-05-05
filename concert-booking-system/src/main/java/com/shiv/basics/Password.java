package com.shiv.basics;

import java.util.ArrayList;
import java.util.Iterator;

/*public class Password {
 int bal;
	
	 static  public void   main(String[] args) {
		try {
			int num1,num2;
			num2=10;
			for(num1=-1;num1<5;++num1){
				num2=(num2/num1);
				System.out.println(num1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("E");
		} 
		
	}
	 
	 public void printA(float...floata){
		 System.out.println("aa");
	 }
	
	 public void printA(int a[]){
		 System.out.println("bb");
	 }
	
	class Car{
		
	}
}*/



 class Password {
    public static void main(String args[])
    {
  
        // Creating an object of ArrayList Object
        ArrayList<String> arr
            = new ArrayList<String>();
  
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
  
        try {
            // Printing the elements
            System.out.println(
                "ArrayList: ");
            Iterator<String> iter
                = arr.iterator();
  
            while (iter.hasNext()) {
  
                System.out.print(iter.next()
                                 + ", ");
  
                // ConcurrentModificationException
                // is raised here as an element
                // is added during the iteration
                System.out.println(
                    "\n\nTrying to add"
                    + " an element in "
                    + "between iteration\n");
                arr.add("Five");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
