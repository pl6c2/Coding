package com.HackerRank;

public class HackerRankInAString {

	public static void main(String args[])
	{
		String s="hhaacckkekraraannk";
		char[] c=s.toCharArray();
		
		char[] h={'h','a','c','k','e','r','r','a','n','k'};
	       
	       int count=0;
	       String result=null;
	       for(int i=0;i<c.length;)
	       {
	           for(int j=0;j<h.length && i<c.length;)
	           {
	              if(c[i]==h[j])
	              {
	            	  System.out.println("j"+j);
	                count++;
	                i++;
	                j++;
	                
	              }
	              else
	              {
	            	 System.out.println("i"+i);
	                i++;
	                
	              }
	           }
	       }
	       if(count==h.length)
	       {
	           result="YES";
	       }
	       else
	       {
	           result="NO";
	       }
	       System.out.println(result);
	}
}
