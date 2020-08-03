package com.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Insert {
	
	public static void insertele(Node n, Node entry)
	{
		Node head=n;
		Queue<Node> q=new LinkedList<Node>();
		q.add(head);
		while(!q.isEmpty())
		{
		    Node temp=q.poll();
			if(temp.left==null)
			{
				temp.left=entry;
				break;
			}
			else
			{
				q.add(temp.left);
			}
			
			if(temp.right==null)
			{
				temp.right=entry;
				break;
			}
			else
			{
				q.add(temp.right);
			}
			System.out.println(temp.data);
		}
		
		
		
	}

	public static void main(String[] args) {
		Node b;
		b= new Node(1); 
        b.left = new Node(2); 
        b.right = new Node(3); 
        b.left.left = new Node(4); 
        b.left.right = new Node(5); 
        
        Node entry=new Node(9);
        insertele(b, entry);
        

	}

}
