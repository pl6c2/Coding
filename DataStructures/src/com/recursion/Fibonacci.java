package com.recursion;

public class Fibonacci {
	
	public int fibo(int a)
	{
		int result=0;
		if(a==1)
		{
			return 0;
		}
		else if(a==2 || a==3)
		{
			return 1;
		}
		else
		{
		 result= fibo(a-1)+ fibo(a-2)+ fibo(a-3);
		}
		 return result;
	}
	
	public static void main(String args[])
	{
		Fibonacci f=new Fibonacci();
		System.out.println(f.fibo(34));
	}

}
