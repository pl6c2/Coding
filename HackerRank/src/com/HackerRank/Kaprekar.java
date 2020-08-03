package com.HackerRank;

public class Kaprekar {
	
	public void fun(int p, int q)
	{
		for(int i=p;i<=q; i++)
        {
            int d=0, sum=0;
            int k=i;
            int flag=1;
            while(k>0)
            {
                k=k/10;
                d=d+1;
            }
            k=i*i;

            while(k>0)
            {
                int a= k%(int)Math.pow(10, d); 
                sum= sum+a;
                k= k/(int)Math.pow(10, d);
                
            }
            
            if(sum==i)
            {
               System.out.print(sum+ " ");
               flag=0;
            }

            
        }
       
	}

	public static void main(String args[])
	{
		Kaprekar k=new Kaprekar();
		k.fun(1,100);
	}
}
