package com.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		
		 Node n; 
		 n=new Node(1);
		 n.left = new Node(2); 
		 n.right = new Node(3); 
	     n.left.left = new Node(4); 
	     n.left.right = new Node(5);
		
		Queue<Node> q=new LinkedList<>();
		Node temp=n;
		q.add(temp);
		while(!q.isEmpty())
		{
			Node removed=q.poll();
			System.out.println(removed.data);
			if(removed.left!=null)
			{
				q.add(removed.left);
			}
			if(removed.right!=null)
			{
				q.add(removed.right);
			}
		}
		
 
	}

}
