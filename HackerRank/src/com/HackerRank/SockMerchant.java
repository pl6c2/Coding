package com.HackerRank;

import java.util.Arrays;
import java.util.*;

public class SockMerchant {

	public static void main(String[] args) {
		int[] ar1={10,20,20,10,10,30,50,10,20};
		Arrays.sort(ar1);
		int realCount=0,count=0;

		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<ar1.length-1;i++)
		{
			if(ar1[i]!=ar1[i+1])
			{
				l.add(ar1[i]);
			}
		}
		
		l.add(ar1[ar1.length-1]);
		
		
		int[] ar2=new int[l.size()];
		for(int i = 0; i < l.size(); i++)
		{
			ar2[i] = l.get(i);
		}
		
		for(int i=0;i<ar2.length;i++)
		{
			for(int k=0;k<ar1.length;k++)
			{
				if(ar2[i]==ar1[k])
				{
					count=count+1;
				}
			}
			realCount=realCount+(count/2);  
            count=0;
		}
		
		System.out.println(realCount);
        
	}

}
