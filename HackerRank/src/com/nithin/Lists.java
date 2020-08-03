package com.nithin;

import java.util.ArrayList;

public class Lists {
	
	public static void main(String args[])
	{
		int[] ar= new int[5];
		ar[0]=1;
		System.out.println(ar.length);
		
		ArrayList<String> arr = new ArrayList<String>(5); 
		arr.add("prem");
		arr.add("nithin");
		arr.add("ravi");
		arr.add("shashank");
		arr.add("sunil");
		ArrayList<String> arr1 = new ArrayList<String>(3); 
		arr1.add("prem");
		arr1.add("nithin");
		arr1.add("ravi");
		
		
		for(int i=0; i< arr.size(); i++)
		{
			for(int j=0; j<arr1.size();j++)
			{
				if(arr.get(i).equals(arr1.get(j)))
				{
					arr.remove(i);
					System.out.println(arr);
				}
			}
		}
		
		
	}

}
