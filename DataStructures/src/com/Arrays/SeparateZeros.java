package com.Arrays;

public class SeparateZeros {

	public static void main(String args[])
	{
		int[] a= {1,2,3,0,4,0,9,0,0,9};
		int pos=0;
		for(int i=0; i<a.length; i++){
	         if(a[i]!=0){
	            a[pos]=a[i];
	            pos++;
	         }
	      }
	      while(pos<a.length) {
	         a[pos] = 0;
	         pos++;
	      }
		
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
}
