package com.HackerRank;

public class DrawingBook {

	public static void main(String[] args) {
		int n=100,f=50,count=1,result=0;
		for(int i=1;i<n;i++)
		{
			count=count+2;
			if(count>=f)
			{
				result=i;
				break;
			}
			
		}
		System.out.println(result);
		

	}

}
