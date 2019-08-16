package com.bridgelabz.functional;

import java.util.Scanner;

public class LargestnSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

		int max, min;
		max = min = a[0];
		for (int i = 0; i < a.length; i++) {
			// Largest no.
			if (a[i] > max)
				max = a[i];
			// Smallest no.
			if (a[i] < min)
				min = a[i];
		}
		// Second Largest no.
		int max1 = a[0];
		int min1 = a[0];
		for (int j = 0; j < a.length; j++) {
			// 2nd Largest number
			if (max == max1)
				max1 = a[j + 1];
			if (max > a[j])
				if (a[j] > max1)
					max1 = a[j];
			// 2nd Smallest number
			if (min == min1)
				min1 = a[j + 1];
			if (min < a[j])
				if (a[j] < min1)
					min1 = a[j];
		}
		System.out.print("The largest no. is : ");
		System.out.println(max);
		System.out.print("Thr 2nd largest no. is : ");
		System.out.println(max1);
		System.out.print("The smallest no. is : ");
		System.out.println(min);
		System.out.print("Thr 2nd smallest no. is : ");
		System.out.println(min1);
		scanner.close();
	}

}
