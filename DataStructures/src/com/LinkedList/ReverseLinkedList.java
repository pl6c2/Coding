package com.LinkedList;

public class ReverseLinkedList {
	
	public static void reverse(Node n)
	{
		Node prev=null;
		Node cur=n;
		Node next;
		while(cur!=null)
		{
		   next=cur.next;
		   cur.next=prev;
		   prev=cur;
		   cur=next;
		}
		n=prev;
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
	       n.next.next.next=new Node(12);
	       
	       reverse(n);

	}

}
