/******************************************************************************
 *  Purpose: This program prints five uniform random values between 0 and 1,their average value, and 
 *  		 their minimum and maximum value.
 *
 *  @author  Sunny Maurya
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		double array[]=new double[10];
		System.out.println("The five uniform random values are:");
		for(int i=0;i<5;i++)
		{
			array[i]=Math.random();
			System.out.println(array[i]);
		}
		Utility utility=new Utility();
		System.out.println("The average value of these random values are:");
		utility.getAverageOf5Values(array[0], array[1], array[2], array[3], array[4]);
		
		System.out.println("The minimum random value is:");
		utility.getMinimumOf5Values(array[0], array[1], array[2], array[3], array[4]);
		
		System.out.println("The maximum random value is:");
		utility.getMaximumOf5Values(array[0], array[1], array[2], array[3], array[4]);
		
	}

}
