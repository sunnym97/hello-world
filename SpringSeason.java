/******************************************************************************
 *  Purpose: This program .
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

public class SpringSeason {

	public static void main(String[] args) {
		int[] array=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
			System.out.println(array[i]);
		}

	}

}
