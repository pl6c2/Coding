package com.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PractiseLOT {
	
	public static int findheight(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		return Math.max(findheight(n.left), findheight(n.right))+1;
		
	}

	public static void main(String[] args) {
		
		 Node n; 
		 n=new Node(1);
		 n.left = new Node(2); 
		 n.right = new Node(3); 
	     n.left.left = new Node(4); 
	     n.left.right = new Node(5);
	     
	  System.out.println( findheight(n));

	}

}
