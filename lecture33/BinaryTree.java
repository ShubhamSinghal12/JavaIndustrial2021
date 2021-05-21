package lecture33;

import java.util.ArrayList;
import java.util.Scanner;



public class BinaryTree {

public static Scanner sc = new Scanner(System.in);
	
	private class Node{	
		int data;
		Node left,right;
		
		public Node(int val)
		{
			data = val;
			left = right = null;	
		}
		
		public Node() {
			this(0);
		}
	}
	
	Node root;
	
	public void createTree()
	{
		root = createTree(null,false);
	}
	
	private Node createTree(Node parent,boolean ch)
	{
		
		if(parent == null)
		{
			System.out.println("Enter root value: ");
		}
		else
		{
			String child;
			if(ch == false)
				child = "left";
			else
				child = "right";
			System.out.println("Enter the value of "+child+" child of "+parent.data+" :");
		}
		
		int n = sc.nextInt();
		
		Node nn = new Node(n);
		
		System.out.println("Is there a left child of "+nn.data+" : ");
		boolean br = sc.nextBoolean();
		if(br)
		{
			nn.left = createTree(nn,false);
		}
		
		System.out.println("Is there a right child of "+nn.data+" : ");
		br = sc.nextBoolean();
		if(br)
		{
			nn.right = createTree(nn,true);
		}
		
		return nn;
		
	}
	
	public void display()
	{
		display(root);
	}
	
	private void display(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print(node.data+" --> ");
		
		if(node.left != null)
		{
			System.out.print(node.left.data+" ");
		}
		if(node.right != null)
		{
			System.out.print(node.right.data+" ");
		}
		System.out.println();
		
		display(node.left);
		display(node.right);	
	}
	
	public int size()
	{
		return size(root);
	}
	
	private int size(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		int count = 1;
		
		count += size(node.left);
		count += size(node.right);
		
		return count;
	}
	
	public int max()
	{
		return max(root);
	}
	
	private int max(Node node)
	{
		if(node == null)
		{
			return Integer.MIN_VALUE;
		}
		int max = node.data;
		
		max = Math.max(max, max(node.left));
		max = Math.max(max, max(node.right));
		
		return max;
	}
	
	public int ht()
	{
		return ht(root);
	}
	
	private int ht(Node node)
	{
		if(node == null)
			return -1;
		
		int h = -1;
		h = Math.max(h, ht(node.left));
		h = Math.max(h, ht(node.right));
		
		return h+1;
	}
	
	public boolean search(int ele)
	{
		return search(root,ele);
	}
	
	private boolean search(Node node,int ele)
	{
		if(node == null)
		{
			return false;
		}
		if(node.data == ele)
		{
			return true;
		}
		
		return search(node.left,ele) || search(node.right,ele);
	}
	
	public void preorder()
	{
		preorder(root);
	}
	
	private void preorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	public void postorder()
	{
		postorder(root);
	}
	
	private void postorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	public void inorder()
	{
		inorder(root);
	}
	
	private void inorder(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
		
	}
	
	
}
