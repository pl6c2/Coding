//package com.dynamicProgramming;
//
//public class Fibonacci {
//
//	int lookup[]=new int[10];
//	public void init(int n)
//	{
//		for(int i=0;i<=n;i++)
//		{
//			lookup[i]=null;
//		}
//	}
//	public int fibo(int n)
//	{
//		if(lookup[n] ==null)
//		{
//			if(n<=1)
//			{
//				lookup[n]=1;
//			}
//			else
//			{
//				lookup[n]= fibo(n-1)+ fibo(n-2);
//			}
//		}
//		return lookup[n];
//	}
//	
//	public static void main(String args[])
//	{
//		Fibonacci f=new Fibonacci();
//		f.init(4);
//		System.out.println(f.fibo(4));
//	}
//}
