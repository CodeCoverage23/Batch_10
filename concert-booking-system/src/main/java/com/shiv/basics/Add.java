package com.shiv.basics;

import java.util.Scanner;

import com.shiv.arrays.BasicsConst;

public class Add {
	public static void main(String[] args) {
		/*int a=5,b=4;
		int c =a+b;
		 System.out.println(c)*/;
		 
		 System.out.println("enter no");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			if(n == 1) {
				System.out.println(BasicsConst.CODE_1);	
			}else if(n == 2) {
				System.out.println(BasicsConst.CODE_2);
			}else if(n == 3) {
				System.out.println(BasicsConst.CODE_3);
			}
		 boolean b1=true;
		 if( f1(true)){
			 System.out.println("C");
			 
		 }
		
		
		}

	public static boolean f1(boolean b) {
		try {
			if(b == true){
				 System.out.println("A");
			 }
			 System.out.println("B");
			 return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 System.out.println("B");
		}
		return false;//return false;
	}
	 
	

}




























