package com.HackerRank;

public class FunnyString {

	public static void main(String args[])
	{
		int count=0;
		String s="lmnop";
		StringBuffer s1=new StringBuffer(s);
		StringBuffer s2=new StringBuffer(s1.reverse());
		System.out.println(s+" "+s2);
		for(int i=0;i<s.length()-1;i++)
		{
			if( Math.abs((int)s.charAt(i)-(int)s.charAt(i+1)) == Math.abs((int)s2.charAt(i)-(int)s2.charAt(i+1)) )
			{
				count++;
			}
		}
		if(count==s.length()-1)
		{
			System.out.println("Funny");
		}
		else
		{
			System.out.println("Not Funny");
		}
	}
}
