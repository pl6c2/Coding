package com.Strings;

public class StudentAttendenceRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="PPALLL";
         boolean result=true;
         int count=0;
         
         for(int i=0;i<s.length();i++)
         {
        	 if(s.charAt(i)=='A')
        	 {
        		 count=count+1;
        	 }
        	
        	 else if(s.charAt(i)=='L')
        	 {
        		for(int j=i;j+3<=s.length();j++)
        		{
        			if(s.charAt(j)=='L' && s.charAt(j+1)=='L' && s.charAt(j+2)=='L')
        			{
        				result=false;
        			}
        		}
        	 }
         }
         
         if(count>2)
         {
        	 result=false;
         }
         System.out.println(result);
	}

}
