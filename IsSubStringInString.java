package com.bridgelabz.functional;

import java.util.*;

public class IsSubstringInString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		String subString=scanner.nextLine();
		//int a=0;
		for(int j=0;j<subString.length();j++)
		{
			for(int i=0;j<string.length();i++)
			{
				if(subString.charAt(j)==string.charAt(i))
					 //a=i;
				System.out.println(i);
			}
		}
	}
}
