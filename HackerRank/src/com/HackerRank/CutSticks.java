package com.HackerRank;

import java.util.Arrays;

public class CutSticks {
	
	public static void cut(int[] arr)
	{
		Arrays.sort(arr);
		int min=arr[0];
		for(int i=0;i<arr.length;)
		{
			System.out.println(arr.length-i);
			min=arr[i];
			while(arr[i]==min)
			{
				i=i+1;
			}
			
		}
		
		
	}

	public static void main(String args[])
	{
		int[] arr= {5,4,4,2,2,8};
		cut(arr);
	}
}
