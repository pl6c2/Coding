package com.Strings;

public class BinaryToDecimal {
	
	public void binaryTodecimal(String a)
	{
		int sum=0,k=0;
	
		char[] c=a.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{	
			int a1=Integer.parseInt(String.valueOf(c[i])); 
			sum = (int) (sum + a1 * Math.pow(2, k));
			k++;
		}
		
		System.out.println(sum);
	}
	
	
	public void decimalTobinary(String b)
	{
		
	}
	
	public static void main(String args[])
	{
		BinaryToDecimal o=new BinaryToDecimal();
		o.binaryTodecimal("000");
	}

}
