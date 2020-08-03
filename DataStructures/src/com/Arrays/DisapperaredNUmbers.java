package com.Arrays;

import java.util.ArrayList;

public class DisapperaredNUmbers {
	
	public static void main(String args[])
	{
		int nums[]= {4,3,2,7,8,2,3,1};
		 ArrayList<Integer> a=new ArrayList<Integer>();
	        ArrayList<Integer> b=new ArrayList<Integer>();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            a.add(nums[i]);
	        }
	        int min=1,max=nums.length;
	       
	        
	        for(int i=min;i<=max;i++)
	        { 
	              if(!a.contains(i))
	              {
	                  b.add(i);
	              }
	          
	        }
	        
	        System.out.println(b);
	}

}
