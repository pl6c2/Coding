package com.HackerRank;

public class LongestSubString {

	public static void main(String[] args) {
		//longest substring without repeating its characters.
		String s="aaa";
		int count=0,maxcount=0;
		for(int i=0,j=0;i<s.length()-1 && j<s.length()-1 ;)
		{
			while(j<s.length()-1 && s.charAt(i)!=s.charAt(j+1))
			{
				count++;
				if(count>=maxcount)
				{
					maxcount=count;
				}
				j++;
			}
			count=0;
			i++;
		}
		System.out.println(maxcount+1);
        
	}

}
