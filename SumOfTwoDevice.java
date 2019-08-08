package com.bridgelabz.functional;
import static java.lang.Math.*;

import com.bridgelabz.Utility.Utility;
public class SumOfTwoDice {

	public static void main(String[] args) 
	{
		
		int dice1=(int)(random()*6);
		int dice2=(int)(random()*6);
		if((dice1==0))
			++dice1;
		if((dice2==0))
			++dice2;
		System.out.println(dice1);
		System.out.println(dice2);
		Utility utility=new Utility();
		utility.getSumOfTwoDice(dice1, dice2);
		

	}

}
