package com.LinkedList;

public class FindLoop {
	
	public static void findLoopInLinkedList(Node n)
	{
		Node head=n;
		if(head==null || head.next==null)
		{
			System.out.println("No cycle");
		}
		Node slowpt=head,fastpt=head;
		while(fastpt==null || fastpt.next==null)
		{
			slowpt=slowpt.next;
			fastpt=fastpt.next.next;
			if(slowpt==fastpt)
			{
				System.out.println("there is a loop");
				break;
			}
		}
//		System.out.println(slowpt.data);
		
	}

	public static void main(String[] args) {

		 Node n;
	       n=new Node(1);
	       n.next=new Node(2);
	       n.next.next=new Node(3);
	       n.next.next.next=new Node(4);
	       n.next.next.next.next=n.next;
	       
	       
	       findLoopInLinkedList(n);

	}

}
