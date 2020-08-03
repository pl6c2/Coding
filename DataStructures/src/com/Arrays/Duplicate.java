package com.Arrays;

public class Duplicate {
	
	public static void main(String args[])
	{
		int a[]= {2,2,3,3,2,4,3};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
//					a[j]=0;
					System.out.println(a[i]);
					break;
				}
			}
		}
		
	}

}
