package com.Strings;

public class FirstNonRepeat {

	public static void main(String args[])
	{ 
		 String s="lllaa";
		 int count=0;
		 int result=0;
		 int freq=0;
		 
		 for(int i=0;i<s.length()-1;i++)
		 {
			 count=0;
			 for(int j=i+1;j<s.length()-1;j++)
			 {
				 if(s.charAt(i) == s.charAt(j))
				 {
					 count=1;
				 }
			 }
			 if(count==0)
			 {
				 result=i;
				 freq++;
				 break;
			 }
			 	 
		 }
		 if(freq==1)
		 {
			 result=-1;
		 }
		 System.out.println(result);
	}
}
