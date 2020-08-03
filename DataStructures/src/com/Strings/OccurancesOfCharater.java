package com.Strings;

public class OccurancesOfCharater {

	public static void main(String args[])
	{
		String s= new String("premchand is a fucker pppp");
		char[] a= s.toCharArray();
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!=' ')
				{
					count++;
				}
			}
			System.out.println(a[i]+" count is "+ count);
			count=1;
		}
	}
}
