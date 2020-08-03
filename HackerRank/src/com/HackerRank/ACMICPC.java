package com.HackerRank;

public class ACMICPC {
	
	int max=0, count=0;
	public void acm(String[] topics)
	{
		for(int i=0;i<topics.length;i++)
		{
			for(int j=i+1;j<topics.length;j++)
			{	
			int bitc= bitcount(or(topics[i], topics[j]));
			System.out.println(bitc);
			if(bitc>max)
			{
				max=bitc;
				count=1;
			}
			else if(bitc == max)
			{
				count++;
			}	
			}
		}
		System.out.println("max"+ max+ count);
	}
	
	public char[] or(String a, String b)
	{
		char[] result=new char[a.length()];
		for(int i=0; i<a.length();i++)
		{
			if(a.charAt(i)=='0' && b.charAt(i)=='0')
			{
				result[i]='0';
			}
			else
			{
				result[i]='1';
			}
		}
		return result;
	}
	
	public int bitcount(char[] result)
	{
		int count=0;
		for(int i=0;i<result.length;i++)
		{
			if(result[i]=='1')
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		String[] topics= {"10101","11100","11010","00101"};
		ACMICPC a=new ACMICPC();
		a.acm(topics);
		
	}

}
