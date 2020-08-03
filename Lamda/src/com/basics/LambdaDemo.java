package com.basics;

public class LambdaDemo {

	public static void main(String args[])
	{
		MyLamdaDemo addNum= ()-> System.out.println("Hi this is my first lamda");
//		we dont need to implement MyLamdaDemo using another class and overriding the function in that class.
//		we can do that here it self
		addNum.demo();
		
	}
}
