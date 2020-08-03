package com.Arrays;

import java.util.Scanner;

public class Nikitha {
	
	
//	static final int SECRET_NUM = 11;
//	static final double PAY_RATE = 18.35;
//	static final double hoursWorked=10;
//	public static void main ( String [] arg )
//	{
//	int one , two ;
//	double first , second;
//	one = 18;
//	two = 11;
//	first = 25;
//	int three=10;
//	second = first * three ;
//	second = 2 * SECRET_NUM ;
////	SECRET_NUM = SECRET_NUM + 3; // u can’t change final variables.
//	System . out . println ( first + " " + second + " "
//	+ SECRET_NUM );
//	double paycheck;
//	paycheck = hoursWorked * PAY_RATE;
//	System . out . println (" Wages = " + paycheck );
	
	
	public static void main(String args[])
	{
		double total=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Input element "+ (i+1));
			Double d= sc.nextDouble();
			total = total+ d;
		}
		
		System.out.println((int)total);
		
	}

	}

