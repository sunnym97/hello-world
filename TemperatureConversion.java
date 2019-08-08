/******************************************************************************
 *  Purpose: This program, given the temperature in fahrenheit as input, outputs the temperature in 
 *  		 Celsius or viceversa.
 *
 *  @author  Sunny Maurya
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.*;

import com.bridgelabz.Utility.Utility;
public class TemperatureConversion {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature in °C or °F:");
		int temperature=scanner.nextInt();
		System.out.println("Choose to convert the given temperature into the foll temperatures:");
		System.out.println("1. °C");
		System.out.println("2. °F");
		int option=scanner.nextInt();
		Utility utility=new Utility();
		utility.getConvertedTemperature(option, temperature);
		scanner.close();
	}
}
