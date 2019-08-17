package com.bridgelabz.functional;

import java.util.Scanner;

public class RoundOff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be rounded off: ");
		double number = scanner.nextDouble();
		System.out.println("Enter the decimal place to be rounded off: ");
		int decimal = scanner.nextInt();

		int roundNumber = (int) number;
		if ((number - roundNumber) >= 0.5) {
			roundNumber = roundNumber + 1;
			System.out.print("The rounded value is: ");
			System.out.println(roundNumber);
		} else {
			System.out.print("The rounded value is: ");
			System.out.println((int) number);
		}
		
		double power=1;
		  for(int i=0;i<decimal;i++)
		  {
		  power=power*10;
		 
		  }
		 

		double num = (number * power);
		double a = (int) num;
		num = (a / (power));
		if (decimal > 0) {
			if ((number - num) >= ((0.5) / (power))) {
				
				num = num + (1 / (power));
				num=(int)(num*(power));
				num=num/(power);
				System.out.print("The rounded value upto " + decimal + " places is: ");
				System.out.println(num);
			} 
			else {

				System.out.print("The rounded value upto " + decimal + " places is: ");
				System.out.println(num);
			}
		}
		scanner.close();
	}
}
