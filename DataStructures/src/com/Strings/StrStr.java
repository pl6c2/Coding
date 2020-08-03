package com.Strings;

public class StrStr {

	public static void main(String args[])
	{
		String s1="a";
		String s2="";
		int result=-1;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		 if(c1.length==0 && c2.length==0)
	        {
	            result=0;
	        }
		 else
		 {
			 for(int i=0;i<c1.length-1;i++)
				{
					for(int j=0;j<c2.length-1;j++)
					{
						if(c1[i]==c2[j])
						{
							for(int k=0;k<c2.length-1;k++)
							{
								if(c1[i+1]==c2[k])
								{
									result=i-k;
								}
								i=i+1;
							}
						}
						
					}
				}
		 }
		
		
		System.out.println(result);
		
	}
}
