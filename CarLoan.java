/******************************************************************************
 *  Purpose: This program basically calculates the Loan payment by using compound interest.
 *
 *  @author  Sunny Maurya
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		double[] array=new double[args.length];
		for(int i=0;i<args.length;i++)
		{
			array[i]=Double.parseDouble(args[i]);
			//System.out.println(array[i]);
		}
		double P=array[0];
		int Y=(int)array[1];
		double R=array[2];
		Utility utility=new Utility();
		utility.getPayment(P, Y, R);
	}
}
