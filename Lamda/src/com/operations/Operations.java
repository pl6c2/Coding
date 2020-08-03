package com.operations;

public class Operations {
	
	public int fun(int a, Operation o)
	{
		return o.addition(a);
	}
	
	public int arraysum(int[] b, ArraySum a)
	{
		return a.arraysum(b);
		
	}
	
	public static void main(String args[])
	{
		Operation add = a -> a+a;
		Operation mul= a-> a*a;
		
		Operations op=new Operations();
		
		System.out.println(op.fun(4, add));
		
		int b[]= {1,2,3,4,5};
		int sum=0;
		ArraySum as= something -> {
			for(int i:b)
			{
				System.out.println(i);
			}
			return sum;
		};
		
		op.arraysum(b, as);
		
		
	}

}

interface ArraySum {

	public int arraysum(int[] a);
	
}