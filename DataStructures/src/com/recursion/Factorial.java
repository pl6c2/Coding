package com.recursion;

public class Factorial {
	
	public int fact(int a)
	{
		int result=0;
		if(a<=1)
		{
			return 1;
		}
		else
		{
			result = a * fact(a-1);
		}
		return result;
		
	}

	public static void main(String args[])
	{
		Factorial f =new Factorial();
		System.out.println(f.fact(5));
	}
}
