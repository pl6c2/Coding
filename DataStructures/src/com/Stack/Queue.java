package com.Stack;

public class Queue {

	int front;
	int rear;
	int size=10;
	int a[]=new int[size];
	Queue()
	{
		front=0;
		rear=-1;
	}
	public void enqueue(int data)
	{
		if(rear>=size)
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear++;
			a[rear]=data;
		}
	}
	
	public void dequeue()
	{
		rear--;
	}
	
	public void display()
	{
		for(int i=rear;i>=front;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		Queue q=new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.display();
		
	}
}
