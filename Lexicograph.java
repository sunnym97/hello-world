package com.bridgelabz.functional;

import java.util.Scanner;

public class Lexicograph {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string1=scanner.nextLine();
		String string2=scanner.nextLine();
		int string1length=string1.length();
		int string2length=string1.length();
		int maxlength;
		if(string1length>string2length)
			maxlength=string1length;
		else
			maxlength=string2length;
		
		if(string1.equals(string2))
			System.out.println("0");
		
		for(int i=0;i<maxlength;i++) {
			
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
