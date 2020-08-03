package com.Arrays;

public class SecondLargest {

	public static void main(String args[])
	{
		int a[]= {10,11,13,1,2,3,15};
		int max=a[0], second=0;
		for(int i=0;i<a.length;i++)
		{
		  if(max<a[i])
		  {
			  second=max;
			  max=a[i];
		  }
		}
		System.out.println(max+"and"+ second);
	}
}
