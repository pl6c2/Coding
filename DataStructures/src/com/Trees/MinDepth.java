package com.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
	
	public static int mindepth(Node n)
	{
		int count=0;
		Node head=n;
		Queue<Node> q=new LinkedList<Node>();
		q.add(head);
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			if(temp.left==null && temp.right==null)
			{
				count++;
//				System.out.println(temp.data);
				break;
			}
			else
			{
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		Node b;
		b= new Node(1); 
        b.left = new Node(2); 
        b.right = new Node(3); 
        b.left.left = new Node(4); 
        b.left.right = new Node(5); 
        System.out.println(mindepth(b));

	}

}
