package com.HackerRank;

public class Gemstones {

	public static void main(String args[])
	{
		String[] s= {"abcdde","baccd","eeabg"};
		char[] c= {'a','b','c','d','e','f','g','h','i'};
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<s.length;j++)
			{
				for(int k=0;k<s[j].length();k++)
				{
					if(c[i]==s[j].charAt(k))
					{
						
					}
				}
			}
		}
	}
}
