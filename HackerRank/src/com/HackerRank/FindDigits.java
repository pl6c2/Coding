package com.HackerRank;

public class FindDigits {
	
	public int findDigit(int a) {
		int count =0;
		int con=a;
		while(a>0) {
			int n= a%10;
			if(n!=0 && con % n == 0) {
				count = count+1;
				System.out.println(a + "gap "+a % n);
			}
			a= a/10;
//			System.out.println(a);
		}
		return count;
	}
	public static void main(String args[]) 
	{
		FindDigits f= new FindDigits();
		int result= f.findDigit(123456789);
		System.out.println(" result "+result);
	}

}
