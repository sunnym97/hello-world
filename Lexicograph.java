package com.bridgelabz.functional;

import java.util.Scanner;

public class Lexicograph {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string1=scanner.nextLine();
		String string2=scanner.nextLine();

		int diff=0;
		if(string1.length()<string2.length())
			diff=string2.length()-string1.length();
		if(string1.length()>string2.length())
			diff=string1.length()-string2.length();
		for(int i=1;i<=diff;i++)
		{
			if(string1.length()<string2.length())
				string1=string1+" ";
			if(string1.length()>string2.length())
				string2=string2+" ";
		}
		
		if(string1.equals(string2))
			System.out.println("0");
		
		for(int i=0;i<string1.length();i++) {
			
			if(string1.charAt(i)>string2.charAt(i)) {
				System.out.println("1");
				break;
			}
				
			if(string1.charAt(i)<string2.charAt(i)) {
				System.out.println("-1");
				break;
			}
				
			if(string1.charAt(i)==string2.charAt(i)) {
				continue;
			}
				
		}
		scanner.close();
		
	}

}
