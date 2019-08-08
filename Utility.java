/******************************************************************************
 *  Purpose: This Program contains the logic of all the programs.
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.Utility;

import static java.lang.Math.*;

public class Utility {
	/**
	 * @param option is the integer value taken from the user to select the option.
	 * @param a is the integer value taken from the user
	 * @param b is the integer value taken from the user
	 * @param c is the integer value taken from the user
	 */
	public void getIntegerOperations(int option,int a,int b,int c)
	{
		switch(option) 
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
	}
	
	/**
	 * @param option is the integer value taken from the user to select the option.
	 * @param a is the double value taken from the user
	 * @param b is the double value taken from the user
	 * @param c is the double value taken from the user
	 */
	public void getDoubleOperations(int option,double a,double b,double c)
	{
		switch(option) 
		{
			case 1: 
				Double d=a+b*c;
				System.out.println(d);
					break;
			case 2: 
				Double e=a*b+c;
				System.out.println(e);	
					break;
			case 3: 
				Double f=c+a/b;
				System.out.println(f);
					break;
			case 4:
				Double g=a%b+c;
				System.out.println(g);
					break;
			default: System.out.println("pls enter correct operation");
		}
	}
	
	/**
	 * @param year 
	 */
	public void checkLeapYear(int year)
	{
		if(year<1582)
			System.out.println("Not a Leap Year");
		if((year%4==0) && (year%100!=0) || (year%400==0))
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public void getSquareRoots(int a, int b, int c)
	{
		int delta = b*b-4*a*c;
		double root1_x=(-b+sqrt(delta))/(2*a);
		double root2_x=(-b-sqrt(delta))/(2*a);
		System.out.println(root1_x);
		System.out.println(root2_x);
	}
	
	/**
	 * @param d
	 * @param m
	 */
	public void isSpringSeason(int d, int m) 
	{
		if((((d>=20)&&(d<32))&&(m==3))||((d<=20)&&(m==6))||((d<31)&&(m==4))||((d<32)&&(m==5)))
			System.out.println("true");
			else
				System.out.println("false");
	}
	
	/**
	 * @param x
	 * @param y
	 */
	public void getDistancefromOrigin(int x, int y)
	{
		double distance=sqrt(pow(x,x)+pow(y,y));
		System.out.println(distance);
	}
	
	/**
	 * @param dice1
	 * @param dice2
	 */
	public void getSumOfTwoDice(int dice1, int dice2) 
	{
		int sum=dice1+dice2;
		System.out.println(sum);
	}
}
