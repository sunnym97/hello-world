import java.util.*;
public class IntOpt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of foll operations:");
		int op=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		switch(op) 
		{
			case 0: 
				int d=a+b*c;
				System.out.println(d);
					break;
			case 1: 
				int e=a*b+c;
				System.out.println(e);	
					break;
			case 2: 
				int f=c+a/b;
				System.out.println(f);
					break;
			case 3:
				int g=a%b+c;
				System.out.println(g);
					break;
			default: System.out.println("pls enter correct operation");
		}
	}
}
