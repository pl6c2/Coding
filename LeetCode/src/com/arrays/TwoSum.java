package com.arrays;

import java.util.HashMap;

public class TwoSum {
	
	public static void twoSum(int a[],int target)
	{
		int[] result=new int[2];
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(target-a[i]))
			{
				result[0]=h.get(target-a[i]);
				result[1]=i;
				System.out.println(result[0]+" "+ result[1]);
				break;
			}
			else
			{
				h.put(a[i], i);
			}
		}
	}

	public static void main(String[] args) {
		
		int[] a= {2,7,11,15};
		int target=9;
		twoSum(a,target);

	}

}
