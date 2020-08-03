package com.HackerRank;



public class FlatLand {
	
	public void fun(int n, int[] c)
	{
		int min=0, max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				int d= Math.abs(i-c[j]);
				min=d;
				if(d<min)
				{
					min=d;
				}
			}
			if(min>max)
			{
				max=min;
			}
//			min=0;
		}
		
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FlatLand f=new FlatLand();
        int[] a= {0,4};
        f.fun(5,a);
	}

}
