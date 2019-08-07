/******************************************************************************
 *  Purpose: This program takes a year as input and outputs the Year is a Leap Year or 
 *  		 not a Leap Year.
 *
 *  @author  Sunny
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.*;

import com.bridgelabz.Utility.Utility;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year greater than 1581");
		int year=scanner.nextInt();
		Utility utility=new Utility();
		utility.checkLeapYear(year);
		scanner.close();
	}
}
