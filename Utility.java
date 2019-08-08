/******************************************************************************
 *  Purpose: This Program contains the logic of all the programs.
 *
 *  @author  Sunny Maurya
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
	
	/**
	 * @param array0
	 * @param array1
	 * @param array2
	 * @param array3
	 * @param array4
	 */
	public void getAverageOf5Values(double array0, double array1, double array2, double array3, double array4)
	{
		double sum=array0+array1+array2+array3+array4;
		double average=sum/5;
		System.out.println(average);
	}
	
	/**
	 * @param array0
	 * @param array1
	 * @param array2
	 * @param array3
	 * @param array4
	 */
	public void getMinimumOf5Values(double array0, double array1, double array2, double array3, double array4)
	{
		double min=Math.min(array0,array1);
		double min1=Math.min(array2,array3);
		double min2=Math.min(min,min1);
		double min3=Math.min(min2,array4);
		System.out.println(min3);
	}
	
	/**
	 * @param array0
	 * @param array1
	 * @param array2
	 * @param array3
	 * @param array4
	 */
	public void getMaximumOf5Values(double array0, double array1, double array2, double array3, double array4)
	{
		double max=Math.max(array0,array1);
		double max1=Math.max(array2,array3);
		double max2=Math.max(max,max1);
		double max3=Math.max(max2,array4);
		System.out.println(max3);
	}
	
	/**
	 * @param P
	 * @param Y
	 * @param R
	 */
	public void getPayment(double P, int Y, double R)
	{
		double n=12*Y;
		double r=R/(12*100);
		double payment=(P*r)/(1-(Math.pow(1+r, -n)));
		System.out.println(payment);
	}
	
	/**
	 * @param option
	 * @param temperature
	 */
	public void getConvertedTemperature(int option, int temperature)
	{
		switch(option)
		{
			case 1: int C;
					int F=temperature;
					C=(F-32)*5/9;
					System.out.println(C);
					break;
			
			case 2: C=temperature;
					F=(C*9/5)+32;
					System.out.println(F);
					break;
					
			default: System.out.println("Enter the correct option!!!");
		}
	}
}
