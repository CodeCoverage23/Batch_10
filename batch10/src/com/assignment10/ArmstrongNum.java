package com.assignment10;
import java.util.Scanner;
public class ArmstrongNum {
public boolean isArmStrong(int n){
	int digit= 0;
	int last = 0;
	int sum = 0;
	
	int temp = n;
	
	while(temp>0) {
		digit++;
		temp/=10;
	}
	temp = n;
	while(temp>0) {
		last = temp % 10;
		sum += (Math.pow(last ,  digit));
		temp/=10;
		
	}
	if(sum==n) {
		return true;
	}
	else {
	return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		ArmstrongNum a = new ArmstrongNum();
		
		if(a.isArmStrong(n)) {
			System.out.println(n+ " is a Armstrong Number");
		}else {
			System.out.println(n+ " is not a Armstorng Number");
		}
	sc.close();
	}

}
