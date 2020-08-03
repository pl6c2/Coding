package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		
		int[] nums= {2,2,1};
		 HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	        int result=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            h.put(nums[i], h.getOrDefault(nums[i],0)+1);
	        }
	        
	        for(Map.Entry m: h.entrySet())
	        {
	           if((int)m.getValue()==1)
	           {
	               result=(int)m.getKey();
	           }
	        }
	        
	        System.out.println(result);

	}

}
