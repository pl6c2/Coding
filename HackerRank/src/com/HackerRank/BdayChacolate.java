package com.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class BdayChacolate {

	public int fun(List<Integer> s,int d, int m)
	{
		int count=0,sum=0;
        for(int i=0;i<=s.size()-m;i++)
        {
            for(int j=i;j<i+m;j++)
            {
                sum=sum+s.get(j);
                System.out.println("sum "+sum);
            }
            if(sum==d)
            {
                count++;
            }
            sum=0;
        }

    return count;
	}
	public static void main(String args[])
	{
		BdayChacolate c=new BdayChacolate();
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		System.out.println(c.fun(l,4,1));
		
	}
}
