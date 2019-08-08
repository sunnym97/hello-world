package com.bridgelabz.functional;
import java.util.*;
public class HappyNumber {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int quo1=num/10;
		int rem1=num%10;
		int temp=(quo1*quo1+rem1*rem1);
		
		while(temp!=1)
		{
			int qou2=temp/10;
			int rem2=temp%10;
			temp=(qou2*qou2+rem2*rem2);
		}
		if(temp==1)
			System.out.println("Happy number");
		scanner.close();
	}

}
