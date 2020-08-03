package com.LinkedList;

public class DisplayLinkedListFromEnd {
	
	public static void display(Node n) {
		if(n==null)
		{
			return;
		}
		display(n.next);
		System.out.println(n.data);
	}

	public static void main(String[] args) {
		
		Node n;
	       n=new Node(5);
	       n.next=new Node(7);
	       n.next.next=new Node(10);
	       n.next.next.next=new Node(5);
	       
	       display(n);

	}

	

}
