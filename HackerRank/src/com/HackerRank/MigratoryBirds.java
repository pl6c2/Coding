package com.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
	
	public int fun(List<Integer> arr)
	{
		 int min=arr.get(0),count=0,maxcount=0;
         for(int i=0;i<arr.size();i++)
         {
             for(int j=0;j<arr.size();j++)
             {
                 if(arr.get(i)==arr.get(j))
                 {
                     count++;
                     if(maxcount<count)
                     {
                         maxcount=count;
                         if(min<arr.get(i))
                         {
                             min=arr.get(i);
                         }
                     }
                 }
             }
             count=0;
         }
         return min;
	}

	public static void main(String args[])
	{
		MigratoryBirds b=new MigratoryBirds();
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(4);
		l.add(5);
		l.add(3);
		System.out.println(b.fun(l));
		
		
	}
}
