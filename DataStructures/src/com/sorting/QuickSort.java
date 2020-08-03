package com.sorting;

public class QuickSort {
	public static void main(String args[])
	{
		int[] nums= {2,8,6,5,39,10};
		quicksort(nums, 0, nums.length-1);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}
	
	static void quicksort(int[] nums, int start, int end)
	{
		if(start>=end)
			return;
		
		int pindex=partition(nums, start, end);
//		System.out.println(pindex);
		quicksort(nums, start, pindex-1);
		quicksort(nums, pindex+1, end);
		
		
	}
	
	static int partition(int[] nums, int start, int end)
	{
		int pivot=nums[end];
		int index=start;
		for(int i=start;i<end;i++)
		{
			if(pivot>=nums[i])
			{
				int temp=nums[i];
				nums[i]=nums[index];
				nums[index]=nums[i];
				index++;
			}
		}
		 int temp = nums[index]; 
	      nums[index] = nums[end]; 
	      nums[end] = temp; 
		return index;
		
	}

}
