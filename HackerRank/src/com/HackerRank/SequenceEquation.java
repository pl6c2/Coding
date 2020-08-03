package com.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {
	
	public int se(List<Integer> a)
	{
		int maxcount=0;
        int count=0;
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<a.size();j++)
            {
               if(Math.abs(a.get(i)-a.get(j)) <= 1)
               {
                   count++;
                   if(count>maxcount)
                   {
                       maxcount=count;
                   }
               }
             }
             count=0;
        }
        return maxcount;
		
	}
	
	public static void main(String args[])
	{
		SequenceEquation t=new SequenceEquation();
		List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(4);
        a.add(4);
        a.add(4);
        a.add(5);
		System.out.println(t.se(a));
		
	}

}
