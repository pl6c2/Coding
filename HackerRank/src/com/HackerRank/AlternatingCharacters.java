package com.HackerRank;

public class AlternatingCharacters {

	public static void main(String[] args) {
		
		String s= "AAABBB";
		int count=0,del=0;
		for(int i=0,j=1;i<s.length() && j<s.length();)
		{
			while(j<s.length() && s.charAt(i)==s.charAt(j))
			{
				count++;
				j++;
			}
			i=j;
			j++;
			if(count>0)
			{
				del=del+count;
			}
			count=0;
			
		}
		System.out.println(del);
	}
}
