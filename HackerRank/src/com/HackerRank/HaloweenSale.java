package com.HackerRank;

public class HaloweenSale {
	
	public int halloweensale(int p, int d, int m, int s)
	{
		int count=0;
        while(s>=m)
        {
            if(count==0)
            {
                s=s-p;
                count= count+1;
            }
            else
            {
            	if(p>m)
            	{
            		 p=p-d;
            		 s=Math.abs(s-p);
                   count=count+1;
            	}
            	else
            	{
            		s=s-m;
            		count=count+1;
            		System.out.println("s value"+ s+ " " + "count "+ count);
            	}
               
               
            }
        }

        return count;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HaloweenSale h=new HaloweenSale();
		System.out.println(h.halloweensale(16, 2, 1, 9981));

	}

}
