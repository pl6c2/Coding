package com.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SherlockAndArray {

	public static void main(String[] args) {
		
         List<Integer> a=new ArrayList<Integer>();
         a.add(1);
         a.add(2);
         a.add(3);
         int sum=0,lsum=0;
         for(int i:a)
         {
        	 sum=sum+i;
         }
         
         for(int j:a)
         {
        	 if(2*lsum==sum-j)
        	 {
        		 System.out.println("YES");
        	 }
        	 else
        	 {
        		lsum=lsum+j; 
        	 }
         }
         
         
	}

}
