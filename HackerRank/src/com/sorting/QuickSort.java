package com.sorting;

public class QuickSort {
	static int partition(int[] a, int start, int end)
	{
		int pivot=a[end];
		int pi=start;
		for(int i=start;i<end;i++)
		{
			if(pivot>=a[i])
			{
				int temp=a[i];
				a[i]=a[pi];
				a[pi]=temp;
				pi++;
			}
		}
		int temp1=a[pi];
		a[pi]=a[end];
		a[end]=temp1;
		
		return pi;
		
	}
	
	static void quicksort(int[] a, int start, int end)
	{
		if(start<end)
		{
			int pindex=partition(a,start,end);
			quicksort(a,start,pindex-1);
			quicksort(a,pindex+1,end);
			
		}
	}

	public static void main(String args[])
	{
		int[] a= {7,6,5,4,3,2,1,0};
		quicksort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}
