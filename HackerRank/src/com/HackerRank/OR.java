package com.HackerRank;

public class OR {
	
	public void funor(int[] a, int[] b)
	{
		int[] result=new int[a.length];
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==0 && b[i]==0)
			{
				result[i]=0;
			}
			else
			{
				result[i]=1;
			}
		}
		
		for(int j=0;j<result.length;j++)
		{
			System.out.println(result[j]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] a= {1,0,0,0,1,0};
		 int[] b= {1,0,1,1,1,1};
		 OR o=new OR();
		 o.funor(a,b);
	}

}
