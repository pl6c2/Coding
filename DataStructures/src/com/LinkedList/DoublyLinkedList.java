package com.LinkedList;
class DLLNode
{
	int data;
	DLLNode prev;
	DLLNode next;
	DLLNode(int data)
	{
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}

public class DoublyLinkedList {
	
	public static void insertAtHead(DLLNode head, DLLNode newnode) {
		newnode.next=head;
		head.prev=newnode;
	}
	
	
	public static void printList(DLLNode head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static void main(String args[])
	{
		DLLNode d;
	    d= new DLLNode(1);
	    insertAtHead(d,new DLLNode(2));
	    printList(d);
	    
	    
	}

}
