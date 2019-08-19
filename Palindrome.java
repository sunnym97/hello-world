package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string1=scanner.nextLine();
		String string2="";
		Utility utility=new Utility();
		boolean b=utility.palindrome(string1,string2);
		if(b==true)
			System.out.println("palindome");
		else
			System.out.println("Not a palindrome");
		
		scanner.close();
	}
	
	public boolean palindrome(String string1,String string2)
	{
		boolean flag=true;
		for(int i=string1.length()-1;i>=0;i--)
		{
			string2=string2+string1.charAt(i);
		}
		for(int i=0;i<string1.length();i++)
		{
			if(string1.charAt(i)==string2.charAt(i))
				flag=true;
			else {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
