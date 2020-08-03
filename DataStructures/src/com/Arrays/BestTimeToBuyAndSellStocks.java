package com.Arrays;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {

		int a[] = { 2,2,1};
		int minStock=Integer.MAX_VALUE, maxProfit=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<minStock)
			{
				minStock=a[i];
			}
			else
			{
				
				maxProfit=Math.max(a[i]-minStock,maxProfit);
			}
		}
		System.out.println(maxProfit);

	}

}
