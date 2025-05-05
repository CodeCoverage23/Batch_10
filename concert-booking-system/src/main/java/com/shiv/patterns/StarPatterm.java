package com.shiv.patterns;

public class StarPatterm {

	public static void main(String[] args) {
		for(int i = 1;i<=5;i++){
			for(int j = 1;j<=i;j++){
				if(j>=2){
					System.out.print("$");
				}
				
					System.out.print("*");
				
			}
			System.out.println();
		}
		
		if("Welcome".trim()=="Welcome".trim()){
			System.out.print("Equal");
		}else{
			System.out.print("Not Equal");
		}
		
	}

}
