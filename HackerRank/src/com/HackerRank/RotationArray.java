package com.HackerRank;

public class RotationArray {

	public void ra(int[] a, int k)
	{
		 int count=0;
		 int[] result=new int[a.length];
	        while(count<k)
	        {
	            for(int i=0;i<a.length;i++)
	            {
	                if(i>=a.length-1)
	                {
	                    result[0]=a[a.length-1];
	                }
	                else
	                {
	                    result[i+1]=a[i];
	                }
	                
	            }
	            count++;
	        }
	        
	        for(int i=0;i<a.length;i++)
	        {
	        	System.out.println("element"+ result[i]);
	        }

	}
	public static void main(String args[])
	{
		RotationArray r=new RotationArray();
		int[] a= {3,1,2};
		r.ra(a, 2);
	}
}
