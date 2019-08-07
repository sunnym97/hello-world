/******************************************************************************
 *  Purpose: To print the following Double operations a + b *c, a * b + c, c + a / b, and
 *  		 a % b + c.
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;
public class DoubleOpt {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select one of the foll operations:");
		System.out.println("1. a+b*c");
		System.out.println("2. a*b+c");
		System.out.println("3. c+a/b");
		System.out.println("4. a%b+c");
		int option=scanner.nextInt();
		System.out.println("Enter the value of a:");
		double a=scanner.nextDouble();
		System.out.println("Enter the value of b:");
		double b=scanner.nextDouble();
		System.out.println("Enter the value of c:");
		double c=scanner.nextDouble();
		Utility utility=new Utility();
		utility.getDoubleOperations(option, a, b, c);
		scanner.close();
	}
}
