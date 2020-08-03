package com.Strings;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String args[])
	{
		String s="D";
		HashMap<String, Integer> val = new HashMap<>();
		val.put("I", 1);
		val.put("V", 5);
		val.put("X", 10);
		val.put("L", 50);
		val.put("C", 100);
		val.put("D", 500);
		val.put("M", 1000);
		StringBuilder sb = new StringBuilder(s);
//		System.out.println(val.get(String.valueOf(sb.charAt(0))));
		int sum=0;
		int flag=0;
		if(s.length()<2)
		{
			sum = sum+ val.get(String.valueOf(sb.charAt(0)));
		}
		else
		{
			for(int i=0;i<=s.length()-2;i++)
			{
				if(val.get(String.valueOf(sb.charAt(i))) < val.get(String.valueOf(sb.charAt(i+1))))
				{
					sum=sum+ (  val.get(String.valueOf(sb.charAt(i+1)))  -  val.get(String.valueOf(sb.charAt(i)))  );
					flag=0;
					i++;
					if(i+1>=s.length()-2 && i<=s.length()-2)
					{
						flag=1;
					}
					
					
				}
				else
				{
					sum=sum + val.get(String.valueOf(sb.charAt(i))) ;
					flag=1;
					
				}
			}
			if(flag==1)
			{
				sum=sum+val.get(String.valueOf(sb.charAt(s.length()-1))); 
			}
		}
		
		System.out.println(sum);
		
		
		
	}
}
