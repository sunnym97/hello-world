package com.bridgelabz.functional;

import java.util.*;

public class IsSubstringInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 = scanner.nextLine();
		System.out.println("Enter the Substring");
		String str2 = scanner.nextLine();

		boolean b = IsSubstringInString.checkSubstring(str1, str2);
		if (b == true) {
			System.out.println(str2 + " is a substring of " + str1);
		} else
			System.out.println(str2 + " is not a substring of " + str1);
		scanner.close();
	}

	public static boolean checkSubstring(String str1, String str2) {
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int character[] = new int[26];

		for (int i = 0; i < str1.length(); i++) {

			character[str1.charAt(i) - 97]++;
		}
		for (int j = 0; j < str2.length(); j++) {

			character[str2.charAt(j) - 97]--;
		}
		boolean flagTake = true;
		for (int i = 0; i < character.length; i++) {

			if (character[i] == -1) {
				flagTake = false;
				break;
			}
		}
		return flagTake;
	}

}
