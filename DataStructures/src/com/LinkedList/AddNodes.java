package com.LinkedList;

class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		
	}
}

class LinkedList {
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node(data);
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	public void insertFirst(int data)
	{
		Node new1=new Node(data);
		Node temp;
		temp=head;
		head=new1;
		head.next=temp;
		
	}
	
	public void delete(int data)
	{
		Node currentnode=head, prev=null;
		if(currentnode!=null && currentnode.data==data)
		{
			head=currentnode.next;
			System.out.println("deleted Item "+data);
		}
		
		else
		{
			while(currentnode!=null && currentnode.data!=data)
			{
				prev=currentnode;
				currentnode=currentnode.next;
			}
			if(currentnode!=null)
			{
				prev.next=currentnode.next;
			}
			if(currentnode==null)
			{
				System.out.println("not present in the list");
			}
			
		}
		
		
	}
	
	int pos=0;
	public void deletepos(int position)
	{
		Node current=head, prev=null;
		if(pos==position)
		{
			head=current.next;
			System.out.println("Item delete at position"+ position + " is "+ current.data);
		}
		else
		{
			
			while(current!=null && pos!=position)
			{
				pos++;
				prev=current;
				current=current.next;
			}
			prev.next=current.next;
		}
	}
	
	
	public void show()
	{
		Node n1=head;
		while(n1!= null)
		{
			System.out.println(n1.data);
			n1=n1.next;
		}
		
	}
	
}
public class AddNodes {

	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.insert(4);
//		System.out.println("head"+l.head.data);
		l.insert(2);
		l.insert(3);
//		l.insert(10);
		l.show();
//		l.delete(4);
//		l.show();
//		l.insert(4);
//		l.delete(2);
//		l.delete(5);
//		l.show();
//		l.insert(2);
//		l.deletepos(2);
//		System.out.println("After Deletion at");
//		l.show();
		l.insertFirst(1);
		System.out.println("after Insertion");
		l.show();
		
		

	}
}
