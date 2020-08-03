package com.Stack;

public class Stack1 {
	
	int max=10;
	int a[]=new int[max];
	int top;
	
	Stack1() {
		top=-1;
	}
	
	public void push(int data)
	{
		if(top>=max)
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			a[top]=data;
		}
	}
	
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			top--;
		}
	}

	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println("elements of a stack "+a[i]);
		}
	}
	public static void main(String args[])
	{
		Stack1 s=new Stack1();
		s.push(3);
		s.push(4);
		s.pop();
		s.display();
	}
}

