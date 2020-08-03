package com.HackerRank;

public class JumpingOnClouds {

	public static int cloud(int[] c)
	{
		 int jump=0,i=0;
	        while(i<c.length-1)
	        {
	             if(c[i+1]==0)
	             {
	            	 if(i>=c.length-2)
	            	 {
	            		 i=i+1;
	            		 jump=jump+1;
	            	 }
	            	 else
	            	 {
	            		 if(c[i+2]==0)
	            		 {
	            			 i=i+2;
	            			 jump=jump+1;
	            		 }
	            		 else
	            		 {
	            			 i=i+1;
	            			 jump=jump+1;
	            		 }
	            	 }
	             }
	             else
	             {
	            	 i=i+2;
	            	 jump=jump+1;
	             }
	           
	        }

	        return jump;
		
	}
	public static void main(String args[])
	{
		int[] a= {0,0,1,0,0,1,0};
		System.out.println(cloud(a));
	}
}
