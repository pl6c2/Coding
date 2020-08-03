package com.LinkedList;

public class DeleteAlternateNodes {
	
	public static void deleteAlternate(Node n)
	{
		Node temp=n;
		while(temp!=null && temp.next!=null)
		{
			temp.next=temp.next.next;
			temp=temp.next;
		}
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}

	public static void main(String[] args) {
		Node n;
	       n=new Node(5);
	       n.next=new Node(7);
	       n.next.next=new Node(10);
	       n.next.next.next=new Node(14);
	       
	       deleteAlternate(n);

	}

}
