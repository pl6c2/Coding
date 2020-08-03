package com.Strings;

public class Duplicates {

	public static void main(String args[])
	{
		String s=new String("Hello I am I Hello I");
		String[] s1=s.split(" ");
		int count=1;
//		for(String a:s1)
//		{
//			System.out.println(a);
//		}
		
		System.out.println(s1.length);
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
					System.out.println(s1[i]+ "  "+ count);
				}
			}
			count=1;
		}
		
	}
}
