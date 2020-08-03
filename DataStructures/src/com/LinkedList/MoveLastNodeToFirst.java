package com.LinkedList;

public class MoveLastNodeToFirst {
	
	public static void move(Node n)
	{
		Node temp=n,prev=null,next=null;
		while(temp!=null && temp.next!=null)
		{
			prev=temp;
			next=temp.next;
			temp=temp.next;
		}
		prev.next=null;
		next.next=n;
		
		while(next!=null)
		{
			System.out.println(next.data);
			next=next.next;
		}
		
	}

	public static void main(String[] args) {
		
		Node n;
	       n=new Node(5);
	       n.next=new Node(7);
	       n.next.next=new Node(10);
	       n.next.next.next=new Node(14);
	       
	       move(n);

	}

}
