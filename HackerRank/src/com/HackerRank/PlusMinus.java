package com.HackerRank;



import java.util.Scanner;

public class PlusMinus {

	static void plusminus(int arr[],int n)
	{
		 double plus=0,minus=0,zero=0;
	        int pcount=0,mcount=0,zcount=0;
	        for(int i=0;i<n;i++)
	        {
	           if(arr[i]>0)
	           {
	               pcount=pcount+1;
	           
	           }
	            else if(arr[i]<0)
	            {
	                mcount=mcount+1;
	            }
	            else
	            {
	                zcount=zcount+1;
	            }
	        }
	        System.out.println(pcount);
	        System.out.println(mcount);
	        System.out.println(zcount);
	        
	        
	            plus=pcount/n;
	        minus=mcount/n;
	        zero=zcount/n;
	        System.out.println(plus);
	        System.out.println(minus);
	        System.out.println(zero);
	        
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=5;
		int[] arr = new int[n];
		 for (int i = 0; i < n; i++) {
			 System.out.println("enter element");
	           arr[i] = sc.nextInt();
	        }
		 plusminus(arr,n);
		
	}
}
