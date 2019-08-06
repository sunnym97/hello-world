/*1. Write a program “ PrintThreeNames.java ” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
and Alice.".*/

import java.util.*;
public class PrintThreeNames {

	public static void main(String[] args) {
		System.out.print("Hi ");
		for(int i=args.length-1;i>0;i--)
			System.out.print(args[i]+", ");
		System.out.print("and "+args[0]+".");
	}
}
