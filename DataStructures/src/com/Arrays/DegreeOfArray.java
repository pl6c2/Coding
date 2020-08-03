package com.Arrays;

import java.util.HashMap;

public class DegreeOfArray {

	public static void main(String[] args) {
		
		int[] nums= {1,2,2,3,1,4,2};
		
	       
		 HashMap<Integer, Integer> count = new HashMap<Integer, Integer>(), first = new HashMap<Integer, Integer>();
	        int res = 0, degree = 0;
	        
	        for (int i = 0; i < nums.length; ++i) 
	        {
	            first.putIfAbsent(nums[i], i);
	            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
	            
	            if (count.get(nums[i]) > degree)
	            {
	                degree = count.get(nums[i]);
	                res = i - first.get(nums[i]) + 1;
	            } 
	            else if (count.get(nums[i]) == degree)
	                res = Math.min(res, i - first.get(nums[i]) + 1);
	        }

	        System.out.println(res);
	}

}
