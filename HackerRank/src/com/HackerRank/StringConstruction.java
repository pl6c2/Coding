package com.HackerRank;

public class StringConstruction {

	public static void main(String[] args) {
		
		String s="abcabc";
		String p=s.charAt(0)+ "";
		boolean flag=true;
		int count=1;
		
		for(int i=1;i<s.length();i++)
		{
			for(int j=0;j<p.length();j++)
			{
				if(s.charAt(i)==p.charAt(j))
				{
					p=p+""+s.charAt(i);
					flag=false;
					System.out.println(p);
					break;
				}
			}
			if(flag!=false)
			{
				p=p+""+s.charAt(i);
				count++;
				System.out.println(p);
			}
			flag=true;
		}
		System.out.println(count);

	}

}
