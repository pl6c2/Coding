package com.Arrays;

public class WaterContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {1,8,6,2,5,4,8,3,7};
		int left = 0, right = height.length - 1, tempArea = 0, maxArea = 0;
		while(left < right) {
			tempArea = Math.min(height[left], height[right]) * (right - left);
			if ( tempArea > maxArea) {
				maxArea = tempArea;
			}
			int temp = (height[left] < height[right]) ? left++ : right-- ; 
			
		}
		System.out.println(maxArea);
	}

}

//int maxarea=0,temparea=0;
//for(int i=0;i<height.length-1;i++)
//{
//    for(int j=i+1;j<height.length;j++)
//    {
//        temparea=Math.min(height[i],height[j]) * (j-i);
//        if(temparea>maxarea)
//        {
//            maxarea=temparea;
//        }
//    }
//}
//return maxarea;
