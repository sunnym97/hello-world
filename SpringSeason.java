/******************************************************************************
 *  Purpose: This program tells whether the given day & month falls under the
 *  		 spring season or not.
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		int[] array=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
			System.out.println(array[i]);
		}
		int d=array[0];
		int m=array[1];
		Utility utility=new Utility();
		utility.isSpringSeason(d, m);
	}
}
