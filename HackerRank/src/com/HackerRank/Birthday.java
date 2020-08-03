package com.HackerRank;

public class Birthday {

	public static void main(String[] args) {
		
    int[] bday={1,2,1,3,2};
    int d=3,m=2;
		int sum=0,count=0;
		 for(int i=0;i<bday.length-1;i++)
	        {
	            for(int j=i;j<m+i;j++)
	            {
	                sum=sum+bday[j];
	            }
	            if(sum==d)
	            {
	                count=count+1;
	                sum=0;
	            }
	        }
	        System.out.println(count);
	}

}
