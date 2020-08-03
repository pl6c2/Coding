package com.Arrays;

import java.util.ArrayList;

public class TwoSum {

	public static void main(String[] args) {
	
		int[] a= {2, 7, 11, 15};
		int target=9;
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
//					System.out.println(i+""+j);
					l.add(i);
					l.add(j);
				}
			}
		}
		
		System.out.println("result "+l.get(0)+l.get(1));
		
		
		

	}

}
