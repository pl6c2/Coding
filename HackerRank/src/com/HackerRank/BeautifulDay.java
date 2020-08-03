package com.HackerRank;

public class BeautifulDay {

	public static void main(String[] args) {


		 int a=0,b = 0,count=0,k=6;
	        for(int x=20;x<=23;x++)
	        {
	            int d=x;
	            while(x > 0)
	          {
	            b = x % 10;
	            a = a * 10 + b;
	            x = x / 10;
	          }
	             if(Math.abs(d-b)%k==0)
	            {
	                count=count+1;
	            }
	        }
	        System.out.println(count);

	}

}
