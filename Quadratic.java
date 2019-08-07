/******************************************************************************
 *  Purpose: This program finds the roots of the equation a*x*x+b*x+c.
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.*;
import com.bridgelabz.Utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("To find the roots of the equation a*x*x+b*x+c");
		System.out.println("Enter the value of coefficient a:");
		int a=scanner.nextInt();
		System.out.println("Enter the value of coefficient b:");
		int b=scanner.nextInt();
		System.out.println("Enter the value of coefficient c:");
		int c=scanner.nextInt();
		Utility utility=new Utility();
		utility.getSquareRoots(a, b, c);
		scanner.close();
	}

}
