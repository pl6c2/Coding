package com.Trees;


public class HeightofBT {
	 static int maxheight=0;
	
	public static int height(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		
		int leftheight=height(n.left);
		int rightheight=height(n.right);
		
		
		return Math.max(leftheight, rightheight)+1;
	}

	public static void main(String args[])
	{
		Node b;
		b= new Node(1); 
        b.left = new Node(2); 
        b.right = new Node(3); 
        b.left.left = new Node(4); 
        b.left.right = new Node(5); 
        System.out.println(height(b));
        
	}
}
