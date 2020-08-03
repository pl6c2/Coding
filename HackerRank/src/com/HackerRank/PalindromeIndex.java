package com.HackerRank;

public class PalindromeIndex {

	static boolean isPalindrome(String a)
	{
		return a.equals(new StringBuilder(a).reverse().toString());
	}
	public static void main(String[] args) {
		
		String s="bcbc";
		int result=0;
		for(int i=0;i<s.length();i++)
		{
			String temp=s.substring(0,i)+s.substring(i+1);
			if(isPalindrome(temp))
			{
				result=i;
				System.out.println(temp);
				break;
			}
		}
		System.out.println(result);

	}

}
