package com.BST;

public class InsertInBST {
	
	public static TreeNode insertnew(TreeNode t, int data)
	{
		if(t==null)
		{
			t=new TreeNode(data);
			return t;
		}
		if(data<t.data)
		{
			t.left=insertnew(t.left,data);
		}
		if(data>t.data)
		{
			t.right=insertnew(t.right,data);
		}
		return t;
	}
	
	public static void inorder(TreeNode t)
	{
		 if (t != null) { 
			 inorder(t.left); 
	            System.out.println(t.data); 
	            inorder(t.right); 
	        } 
	}

	public static void main(String[] args) {

		TreeNode t=new TreeNode();
		t.data=6;
		t.left=new TreeNode(2);
		t.right=new TreeNode(8);
		
		insertnew(t, 1);
		inorder(t);
	}
	

}
