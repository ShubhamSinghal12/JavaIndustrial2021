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
		
		if(node.left != null)
		{
			System.out.print(node.left.data+" ");
		}
		System.out.print("--> "+node.data+" --> ");
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
	public boolean isbalanced()
	{
		return isbalanced(root);
	}
	
	private boolean isbalanced(Node node)
	{
		if(node == null)
		{
			return true;
		}
		boolean isb;
		isb = isbalanced(node.left) && isbalanced(node.right);
		if(isb)
		{
			int left = ht(node.left);
			int right = ht(node.right);
			
			if(Math.abs(left-right) > 1)
				isb = false;
		}
		return isb;
	}
	
	private static boolean isb = true;
	public boolean isbalanced2()
	{
		isb = true;
		isbalanced(root);
		return isb;
	}
	
	private int isbalanced2(Node node)
	{
		if(node == null)
		{
			return -1;
		}
		int h = -1;
		if(isb)
		{
			int leftht = isbalanced2(node.left);
			int rightht = isbalanced2(node.right);
			h = Math.max(h, leftht);
			h = Math.max(h, rightht);
			
			
			if(Math.abs(leftht-rightht) > 1)
				isb = false;
		}
		return h+1;
	}
	
	private class isbal{
		int ht = -1;
		boolean isb = true;
	}
	
	public boolean isbalanced3()
	{
		return isbalanced3(root).isb;
	}
	
	private isbal isbalanced3(Node node)
	{
		if(node == null)
		{
			return new isbal();
		}
		
		isbal left = isbalanced3(node.left);
		isbal right = isbalanced3(node.right);
		
		isbal nn = new isbal();
		nn.isb = left.isb && right.isb;
		if(nn.isb)
		{
			if(Math.abs(left.ht-right.ht) > 1)
				nn.isb = false;
		}
		
		nn.ht = Math.max(nn.ht, left.ht);
		nn.ht = Math.max(nn.ht, right.ht);
		
		nn.ht += 1;
		return nn;
	}
	
	public int diameter1()
	{
		return diameter1(root);
	}
	
	//Returns diameter
	private int diameter1(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		
		int left_dia = diameter1(node.left);
		int right_dia = diameter1(node.right);
		
		int dia = ht(node.left) + ht(node.right) + 3;
		
		dia = Math.max(dia, left_dia);
		dia = Math.max(dia, right_dia);
		
//		System.out.println(node.data+" "+dia);
		return dia;
	}
	
	private static int dia = 0;
	public int diameter2()
	{
		dia = 0;
		diameter2(root);
		return dia;
	}
	
	//Returns Height
	private int diameter2(Node node)
	{
		if(node == null)
		{
			return -1;
		}
		
		int left_ht = diameter2(node.left);
		int right_ht = diameter2(node.right);
		
		int dia = left_ht + right_ht + 3;
		
		if(dia > BinaryTree.dia)
		{
			BinaryTree.dia = dia;
		}
		
		int h = -1;
		h = Math.max(h, left_ht);
		h = Math.max(h, right_ht);
		
//		System.out.println(node.data+" "+dia);
		
		return h+1;
	}
	
	private class Diameter{
		int ht = -1;
		int dia = 0;
	}
	
	public int diameter3()
	{
		return diameter3(root).dia;
	}
	
	private Diameter diameter3(Node node)
	{
		if(node  == null)
		{
			return new Diameter();
		}
		
		Diameter left = diameter3(node.left);
		Diameter right = diameter3(node.right);
		
		Diameter nn = new Diameter();
		
		nn.dia = left.ht + right.ht + 3;
		
		nn.dia = Math.max(nn.dia, left.dia);
		nn.dia = Math.max(nn.dia, right.dia);
		
		
//		nn.ht = -1;
		
		nn.ht = Math.max(nn.ht, left.ht);
		nn.ht = Math.max(nn.ht, right.ht);
		
		nn.ht += 1;
		
		return nn;
	}
	
	public void createTreeUsingPreandIn(int[] pre,int[] in)
	{
		root = ct(pre,in,0,pre.length-1,0,in.length-1);
	}
	
	private Node ct(int[] pre,int[] in,int prelow,int prehigh,int inlow,int inhigh)
	{
		if(inlow > inhigh)
		{
			return null;
		}
		
		int r = pre[prelow];
		Node nn = new Node(r);
		
		int count = 0;
		int ri = 0;
		for(int i = inlow; i <= inhigh; i++)
		{
			if(in[i] == r)
			{
				ri = i;
				break;
			}
			count++;
		}
		
		nn.left = ct(pre, in, prelow+1, prelow+count, inlow, ri-1);
		nn.right = ct(pre, in, prelow+count+1, prehigh, ri+1, inhigh);
		
		return nn;
		
	}
	
	
}
