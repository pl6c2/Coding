package com.HackerRank;

public class StrangeCounter {
	
	public static int fun(long t)
	{
		 int count=3,counter=4,value=0;
         for(int i=1;i<=t;i++)
         {
            if(i<count+value+1)
            {
                counter=counter-1;
            }
            else
            {
               counter=count*2;
               count=count*2;
               value=i-1;
            }
         }
         return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(15));		

	}

}
