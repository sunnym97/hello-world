package com.bridgelabz.functional;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		if(n==0)
			System.out.println(0);
		if(n==1)
			System.out.println(1);
		int fibo=fib(n);
		System.out.println(fibo);
		scanner.close();
	}
	public static int fib(int n)
	{
		int a=0,b=1,c=0;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

}
