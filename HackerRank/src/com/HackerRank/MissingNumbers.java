package com.HackerRank;
import java.util.ArrayList;
import java.util.Collections;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[] arr= {7,2,5,3,5,3};
		int[] brr= {7,2,5,4,6,3,5,3};
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			a.add(arr[i]);
		}
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int j=0;j<brr.length;j++)
		{
			b.add(brr[j]);
		}
		
		for(int k=0;k<a.size();k++)
		{
			for(int m=0;m<b.size();)
			{

				if(a.get(k).compareTo(b.get(m))==0)
				{
					b.remove(m);
					m=0;
					break;
				}
				else
				{
					m++;
				}
			}
		}	
		Collections.sort(b);
		for(int c=0;c<b.size();c++)
		{
			System.out.println("result"+ b.get(c));
		}
		int[] result=new int[b.size()];
		
		for(int i=0;i<result.length;i++)
		{
			result[i]=b.get(i);
		}
		
	}

}
