package com.HackerRank;

public class MinDistance {

	public int minDistance(int[] a)
	{
		
		int min;
	       min= a.length;
	       System.out.println(min);
	       for(int i=0;i< a.length;i++)
	       {
	           for(int j=i+1;j<a.length-1;j++)
	           {
	              if(a[i]==a[j])
	              {
	                  if((j-i)<min)
	                  {
	                      min= j-i;
	                  }
	              }
	           }
	       }
	       return min;

	}
	public static void main(String args[])
	{
		int a[]= {7, 1, 3 ,4, 1 ,7};
		MinDistance m=new MinDistance();
		System.out.println(m.minDistance(a));
	}
}
