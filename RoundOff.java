package com.bridgelabz.functional;

import java.util.Scanner;

public class RoundOff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be rounded off: ");
		double number = scanner.nextDouble();

		int roundNumber = (int) number;

		if ((number - roundNumber) >= 0.5) {
			roundNumber = roundNumber + 1;
			System.out.print("The rounded value is: ");
			System.out.println(roundNumber);
		} else {
			System.out.print("The rounded value is: ");
			System.out.println((int) number);
		}

		double num = number * 100;
		double a = (int) num;
		num = a / 100;
		
		if ((number - num) >= 0.005) {
			num = num + 0.01;
			System.out.print("The rounded value upto two decimal places is: ");
			System.out.println(num);
		} else {
			System.out.print("The rounded value upto two decimal places is: ");
			System.out.println(num);
		}
		scanner.close();
	}
}
