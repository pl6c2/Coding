package com.HackerRank;


import java.util.ArrayList;
import java.util.List;

public class CompateTriplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
	{
		//System.out.println(a.get(0));
		int i,j,acount=0,bcount=0;
		List<Integer> res= new ArrayList<>();
		for(i=0;i<3;i++)
		{
			if(a.get(i) > b.get(i))
			{
				acount=acount+1;
			}
			else if(a.get(i) < b.get(i))
			{
				bcount=bcount+1;
			}
		}
		res.add(acount);
		res.add(bcount);
		return res;
		
	}
	public static void main(String args[])
	{
		//System.out.println("Hello");
		
        List<Integer> a = new ArrayList<>();

        List<Integer> b = new ArrayList<>();
        
        a.add(1);
        a.add(10);
        a.add(20);
        b.add(10);
        b.add(20);
        b.add(30);
        
        List<Integer> result = compareTriplets(a, b);
        for(int i:result)
        {
        	System.out.println(i);
        }

	}
}
