package com.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {

	static int minimumdif(int[] a)
	{
		int mindef=999999999;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]<=mindef)
			{
				mindef=a[i+1]-a[i];
			}
		}
		return mindef;
	}
	public static void main(String args[])
	{
		int[] a= {-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854,-520,-470};
		Arrays.sort(a);
		List<Integer> l=new ArrayList<Integer>();
		
		int mindif=minimumdif(a);
		
		System.out.println(mindif);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]<=mindif)
			{
				System.out.print(a[i]+" "+a[i+1]+" ");
			}
		}
		
		
	}
}
