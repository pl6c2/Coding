package com.HackerRank;

import java.util.Arrays;

public class PriyankaAndToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] w= {1,2,3,4,5,10,11,12,13};
		int count=1;
		Arrays.sort(w);
		for(int i=0;i<w.length;i++)
		{
			for(int j=i+1;j<w.length;j++)
			{
				if(w[i]+4>=w[j])
				{
					
				}
				else
				{
					count++;
					i=j;
				}
			}
		}
		System.out.println(count);
		

	}

}
