package com.Arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String args[])
	{
		int[] a= {1,2,1,3,3,2,4,5,6,7};
        int count=1;
		HashMap<Integer,Integer> h=new HashMap<>();
		
		for(int i:a)
		{
			if(h.get(i)==null)
			{
				h.put(i,1);
			}
			else
			{
				h.put(i, h.get(i)+1);
			}
		}
		
		Set<Entry<Integer, Integer>> entrySet = h.entrySet();
		for(Entry<Integer,Integer> e:entrySet)
		{
			System.out.println(e.getKey()+ " value is "+ e.getValue());
		}
	}
	
}
