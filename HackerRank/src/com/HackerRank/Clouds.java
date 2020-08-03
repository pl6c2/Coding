package com.HackerRank;

public class Clouds {

	public int countEnergy(int a[], int k) {
		
	    int n=a.length;
        int e=100, i=0;
        while((i+k) % n != 0)
        {
        	e= e-1;
        	if(a[(i+k) % n] == 1) { 
        		e=e-2;
        	   System.out.println(e);
        	}
//        	else {
//        		e=e-1;
//        	}
        	
        	i=(i+k) % n;
        }
		return e-1;
		
	}
	
	public static void main(String args[]) {
		
//		int[] a = new int[]{ 0,1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0};
//		int[] a = new int[]{ 0,0, 1, 0, 0, 1, 1, 0};
		int[] a = new int[]{ 1,1,1,1,0};
		System.out.println(a);
		Clouds c= new Clouds();
		int energy= c.countEnergy(a, 1);
		System.out.println(" energy is " + energy);
	}
}
