package com.Arrays;

public class ReverseAndMinMax {
	
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		System.out.println(a);
		for(int i=0;i<a.length/2;i++)
		{
			int temp=a[i];
			a[i]= a[a.length-1-i];
			a[a.length-1-i]= temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]< min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("min is"+ min + "max is"+ max);
		
	}

}
