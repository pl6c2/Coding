package com.Arrays;

public class SubArrayProductLessThanK {

	public static void main(String[] args) {
		
		int nums[]= {10,5,2,6};
		int k=100;
		
		int right=0, left=0, sum=1, result=0;
		while(right<nums.length)
		{
			sum= sum * nums[left];
			if(sum<k)
			{
				result++;
				left++;
			}
			else
			{
				left++;
			}
			if(left==nums.length)
			{
				right++;
				left=right;
				sum=0;
			}
		}
		System.out.println(result);

	}

}




