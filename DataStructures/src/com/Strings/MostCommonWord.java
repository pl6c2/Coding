package com.Strings;

import java.util.ArrayList;

public class MostCommonWord {

	public static void main(String args[])
	{
		String s1="Bob hit a ball, the hit BALL flew far after it was hit.";
		String s2=s1.replaceAll("[^a-zA-Z0-9]", " ").replace("  ", " ").toLowerCase();
		System.out.println(s2);
		int count=0;
		int maxcount=0;
		int k=0;
		String[] a=s2.split(" ");
		ArrayList<String> l=new ArrayList<String>();
		l.add("hit");
		l.add("bob");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(l.contains(a[j]))
				{
				}
				else
				{
//					System.out.println(a[i]+" & "+ a[j]);
					if(a[i].equalsIgnoreCase(a[j]))
					{
						System.out.println("okay");
						count=count+1;
						if(count>maxcount)
						{
							k=j;
							maxcount=count;
//							System.out.println(maxcount+ " "+ a[k]);
						}
					}
				}
			}
			count=0;
			
		}
		System.out.println(maxcount+ " "+ a[k]);
	}
}