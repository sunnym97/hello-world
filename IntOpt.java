/******************************************************************************
 *  Purpose: To print the following integer operations a + b *c, a * b + c, c + a / b, and
 *  		 a % b + c.
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.*;
public class IntOpt {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select one of the foll operations:");
		System.out.println("1. a+b*c");
		System.out.println("2. a*b+c");
		System.out.println("3. c+a/b");
		System.out.println("4. a%b+c");
		int op=scanner.nextInt();
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		switch(op) 
		{
			case 1: 
				int d=a+b*c;
				System.out.println(d);
					break;
			case 2: 
				int e=a*b+c;
				System.out.println(e);	
					break;
			case 3: 
				int f=c+a/b;
				System.out.println(f);
					break;
			case 4:
				int g=a%b+c;
				System.out.println(g);
					break;
			default: System.out.println("pls enter correct operation");
		}
		scanner.close();
	}
}
