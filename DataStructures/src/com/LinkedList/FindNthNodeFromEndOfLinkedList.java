package com.LinkedList;

//class Node {
//	int data;
//	Node next;
//	Node(int data)
//	{
//		this.data=data;
//		
//	}
//}

public class FindNthNodeFromEndOfLinkedList {
	
	public static void findNthNode(Node n, int pos)
	{
		Node temp=n;
		Node cur=n;
		for(int i=1;i<pos;i++)
		{
			temp=temp.next;
		}
		while(temp.next!=null)
		{
			cur=cur.next;
			temp=temp.next;
		}
		System.out.println(cur.data);
	}

	public static void main(String[] args) {

	   Node n;
       n=new Node(1);
       n.next=new Node(2);
       n.next.next=new Node(3);
       n.next.next.next=new Node(4);
       
       findNthNode(n,4);

	}

}
