import java.util.*;
public class PrintThreeNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		System.out.print("Hi ");
		//System.out.print(str[str.length-1]);
		for(int i=str.length-1;i>0;i--)
			System.out.print(str[i]+", ");
		System.out.print("and "+str[0]+".");
	}

}
