package com.nithin;

public class Kaprekar {
	
	public void showKaprekar(int p, int q)
	{
		for(int i=p;i<=q; i++)
        {
            int d=0, sum=0;
            int k=i;
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
               System.out.println(sum);
            }
            
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kaprekar k=new Kaprekar();
		k.showKaprekar(1,100);

	}

}
