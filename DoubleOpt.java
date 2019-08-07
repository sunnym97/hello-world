import java.util.Scanner;
public class DoubleOpt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of foll operations:");
		int op=sc.nextInt();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		switch(op) 
		{
			case 0: 
				Double d=a+b*c;
				System.out.println(d);
					break;
			case 1: 
				Double e=a*b+c;
				System.out.println(e);	
					break;
			case 2: 
				Double f=c+a/b;
				System.out.println(f);
					break;
			case 3:
				Double g=a%b+c;
				System.out.println(g);
					break;
			default: System.out.println("pls enter correct operation");
		}
	}
}
