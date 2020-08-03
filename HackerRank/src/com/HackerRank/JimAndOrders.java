package com.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class JimAndOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,k=1;
		int[][] arr = {{8,1}, {4,2},{5,6}, {3,1}, {4,3} };
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				sum=sum+arr[i][j];
			}
			h.put(k, sum);
			k++;
			sum=0;
		}
		
//		for (Map.Entry mapElement : h.entrySet()) { 
//            int key = (int)mapElement.getKey(); 
//  
//            int value = ((int)mapElement.getValue()); 
//  
//            System.out.println(key + " : " + value); 
//        } 
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (Map.Entry mapElement : h.entrySet()) { 
  
            int value = ((int)mapElement.getValue()); 
            a.add(value);
        } 
		
		Collections.sort(a);
		int[] result=new int[arr.length];
		int r=0;
		for(int i:a)
		{
			for (Map.Entry mapElement : h.entrySet()) { 
				  
	            if(i==((int)mapElement.getValue()))
	            {
	            	result[r]=(int)mapElement.getKey();
	            	r++;
	            }
	        } 
		}
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
		
	}

}
