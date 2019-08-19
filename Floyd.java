package com.bridgelabz.functional;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		scanner.close();
	}

}
