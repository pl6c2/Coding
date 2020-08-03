package com.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int nums[]= {3,6,1,12,14,6,7};
		
		sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}

	}
	
	static void sort(int[] nums)
	{
		int len=nums.length;
		if(len<2)
			return;
		int mid=len/2;
		int[] left=new int[mid];
		int[] right=new int[len-mid];
		for(int i=0;i<mid;i++)
		{
			left[i]=nums[i];
		}
		for(int i=mid;i<len;i++)
		{
			right[i-mid]=nums[i];
		}
		sort(left);
		sort(right);
		merge(left,right,nums);
	}
	
	static void merge(int[] left, int[] right, int[] nums)
	{
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<=right[j])
			{
				nums[k]=left[i++];
			}
			else
			{
			     nums[k]=right[j++];	
			}
			k++;
		}
		while(i<left.length)
		{
			nums[k++]=left[i++];
		}
		while(j<right.length)
		{
			nums[k++]=right[j++];
		}
	}

}
