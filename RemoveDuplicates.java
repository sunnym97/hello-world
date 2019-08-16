package com.bridgelabz.functional;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {1,1,2,3,2,5,6,5,1};
		int[] temp=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					temp[i]=a[i]++;
					System.out.println("char at "+temp[i]+" is "+a[i]);
			}
		}

	}

}
