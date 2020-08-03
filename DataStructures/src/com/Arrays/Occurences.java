package com.Arrays;

public class Occurences {
	
	public static void main(String args[])
	{
		int a[]= {3,2,3};
		int count=0;
		int frequent=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					if(count > frequent)
					{
						frequent=a[i];
						
					}
				}
			}
			System.out.println("Occurences of"+ a[i]+ ":"+ count);
			count=0;
		}
		
		System.out.println(frequent);
	}
	

}
