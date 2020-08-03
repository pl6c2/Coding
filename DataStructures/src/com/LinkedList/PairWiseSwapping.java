package com.LinkedList;

public class PairWiseSwapping {
	
	public static void pairswap(Node n)
	{
		Node temp=n;
		int t;
		while(temp!=null && temp.next!=null)
		{
			t=temp.data;
			temp.data=temp.next.data;
			temp.next.data=t;
			
			temp=temp.next.next;
		}
		
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	public static void main(String args[])
	{
		Node n;
	       n=new Node(5);
	       n.next=new Node(7);
	       n.next.next=new Node(10);
	       n.next.next.next=new Node(14);
	       
	       pairswap(n);
	}

}
