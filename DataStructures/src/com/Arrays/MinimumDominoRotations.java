package com.Arrays;

public class MinimumDominoRotations {
	
	public static int result=0;
	
	public static void rotations(int[] a, int[] b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i] || a[i]==a[i+1] || b[i]==b[i+1])
			{
				if(a[i]==a[i+1] || b[i]==b[i+1] )
				{
					i=i+1;
				}
			}
			else
			{
				if(a[i]==b[i+1])
				{
					result++;
					i=i+1;
				}
				else
				{
					result=-1;
					break;
				}
			}
		}
		
		System.out.println(result);
	}
	
	

	public static void main(String[] args) {
		
		int[] A = {1,2,1,1,1,2,2,2};
		int[] B = {2,1,2,2,2,2,2,2};
		
		rotations(A,B);

	}

}
