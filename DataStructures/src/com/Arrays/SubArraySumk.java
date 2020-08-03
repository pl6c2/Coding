package com.Arrays;

public class SubArraySumk {

	public static void main(String[] args) {
		
		int[] nums= {1,1,3,2,4};
		int left=0,right=0,sum=0,result=0;
		int k=5;
		while(left<=right)
		{
			sum=sum+nums[right];
			if(sum==k)
			{
				result++;
				if(right==nums.length-1)
				{
					left++;
					right=left;
					sum= nums[right];
					
				}
				right++;
			}
			else
			{
				if(right==nums.length-1)
				{
					left++;
					right=left;
					sum= nums[right];
					
				}
				right++;				
			}
		}
		System.out.println(result);

	}

}
