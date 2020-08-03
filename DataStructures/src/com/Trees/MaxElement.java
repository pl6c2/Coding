package com.Trees;

public class MaxElement {
	
	static int maxval=0;
	
	public static int maxele(Node n)
	{
		if(n!=null)
		{
			int leftmax=maxele(n.left);
			int rightmax=maxele(n.right);
			if(leftmax>rightmax)
			{
				maxval=leftmax;
			}
			else
			{
				maxval=rightmax;
			}
			if(n.data>maxval)
			{
				maxval=n.data;
			}
			
			
		}
		return maxval;
	}

	public static void main(String[] args) {
		
		Node b;
		b= new Node(1); 
        b.left = new Node(2); 
        b.right = new Node(3); 
        b.left.left = new Node(4); 
        b.left.right = new Node(5); 
        System.out.println(maxele(b));

	}

}
