/******************************************************************************
 *  Purpose: This program gives the distance of a point from origin.
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.Utility.Utility;
public class Distance {

	public static void main(String[] args) {
		int[] array=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
			System.out.println(array[i]);
		}
		int x=array[0];
		int y=array[1];
		Utility utility=new Utility();
		utility.getDistancefromOrigin(x, y);
	}
}
