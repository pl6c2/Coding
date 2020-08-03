package com.LinkedList;


public class InsertNodeInSortedLinkedList {
	
	public static void insertNode(Node n, Node newOne)
	{
		Node cur=n;
		Node temp=null;
		while(cur.next==null)
		{
			if(cur.data<newOne.data)
			{
				temp=cur;
				cur=cur.next;
			}
		}
		newOne.next=cur;
//		temp.next=newOne;
		
		while(cur.next==null)
		{
			System.out.println(cur.data);
			cur=cur.next;
		}
	}

	public static void main(String[] args) {
		
		 Node n;
	       n=new Node(5);
	       n.next=new Node(7);
	       n.next.next=new Node(10);
	       n.next.next.next=new Node(5);
	       
	       Node newOne=new Node(4);
	       
	       insertNode(n,newOne);

	}

}
