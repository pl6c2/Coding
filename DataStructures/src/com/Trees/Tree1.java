package com.Trees;

class TreeDemo
{
	Node root;
	TreeDemo()
	{
		root=null;
	}
	public void add(int data)
	{
		if(root==null)
		{
			System.out.println("root is null");
			root=new Node(data);
			System.out.println(root.data);
		}
		else
		{
			root.left=new Node(data);
			System.out.println(root.left.data);
		}
	}
}

public class Tree1 {
	
	public static void main(String args[])
	{
		TreeDemo t1=new TreeDemo();
		t1.add(2);
		t1.add(3);
	}

}
