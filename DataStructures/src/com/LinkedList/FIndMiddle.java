package com.LinkedList;

public class FIndMiddle {
	
	public static void findMiddleElement(Node head)
	{
		Node slow=head, fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
	}

	public static void main(String[] args) {
		 Node n;
	       n=new Node(5);
	       n.next=new Node(7);
	       n.next.next=new Node(10);
	       n.next.next.next=new Node(5);
	       n.next.next.next.next=new Node(13);
	       
	       findMiddleElement(n);

	}

}
