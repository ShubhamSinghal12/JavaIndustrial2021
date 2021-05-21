package lecture32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTrees {
	
	public static Scanner sc = new Scanner(System.in);
	
	private class Node{	
		int data;
		ArrayList<Node> child;
		
		public Node(int val)
		{
			data = val;
			child = new ArrayList<>();	
		}
		
		public Node() {
			this(0);
		}
	}
	
	Node root;
	
	public void createTree()
	{
		root = createTree(null,-1);
	}
	
	private Node createTree(Node parent,int child)
	{
		
		if(parent == null)
		{
			System.out.println("Enter root value: ");
		}
		else
		{
			System.out.println("Enter the value of "+child+" child of "+parent.data+" :");
		}
		
		int n = sc.nextInt();
		
		Node nn = new Node(n);
		
		System.out.println("Enter number of childern of this node: ");
		
		int c = sc.nextInt();
		for(int i = 0; i < c; i++)
		{
			Node ch = createTree(nn, i);
			nn.child.add(ch);
		}
		
		return nn;
		
		
	}

	public void display()
	{
		display(root);
	}
	
	private void display(Node node)
	{
		System.out.print(node.data+" --> ");
		for(Node val : node.child)
		{
			System.out.print(val.data+" ");
		}
		
		System.out.println();
		
		for(Node val: node.child)
		{
			display(val);
		}
		
	}
	
	public int size()
	{
		return size(root);
	}
	
	private int size(Node node)
	{
		int count = 1;
		
		for(Node val: node.child)
		{
			count += size(val);
		}
		
		return count;
	}
	
	public int max()
	{
		return max(root);
	}
	private int max(Node node)
	{
		int max = node.data;
		
		for(Node val: node.child)
		{
			max = Math.max(max, max(val));
		}
		
//		Math.max(max, node.data);
		
		return max;
	}
	
	public int ht()
	{
		return ht(root);
	}
	
	private int ht(Node node)
	{
		if(node.child.size() == 0)
			return 0;
		
		int h = 0;
		for(Node val: node.child)
		{
			h = Math.max(h, ht(val));
		}
		return h+1;
	}
	
	public boolean search(int ele)
	{
		return search(root,ele);
	}
	
	private boolean search(Node node, int ele)
	{
		if(node.data == ele)
		{
			return true;
		}
		
		for(Node val: node.child)
		{
			boolean p = search(val,ele);
			if(p)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public void preorder()
	{
		preorder(root);
	}
	
	private void preorder(Node node)
	{
		System.out.print(node.data+" ");
		
		for(Node val: node.child)
		{
			preorder(val);
		}
	}
	
	public void postorder()
	{
		postorder(root);
	}
	
	private void postorder(Node node)
	{	
		
		for(Node val: node.child)
		{
			postorder(val);
		}
		System.out.print(node.data+" ");
	}
	
	public void mirror()
	{
		mirror(root);
	}
	
	private void mirror(Node node)
	{	
		Collections.reverse(node.child);
		for(Node val : node.child)
		{
			mirror(val);
		}
	}
	
	public void levelOrder()
	{
		LinkedList<Node> qt = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node n = qt.removeFirst();
			System.out.print(n.data+" ");
			for(Node val:n.child)
			{
				qt.add(val);
			}
//			System.out.println();
		}
		System.out.println();
		
	}
	
	public void levelbylevelOrder()
	{
		LinkedList<Node> qt = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node n = qt.removeFirst();
			System.out.print(n.data+" ");
			for(Node val:n.child)
			{
				helper.add(val);
			}
			
			if(qt.isEmpty())
			{
				qt = helper;
				helper = new LinkedList<>();
				System.out.println();
			}
//			System.out.println();
		}
		System.out.println();
		
	}
	public void levelbylevelOrder2()
	{
		LinkedList<Node> qt = new LinkedList<>();
		int ct = 1, cthelp = 0;
		qt.add(root);
		while(!qt.isEmpty())
		{
			Node n = qt.removeFirst();
			ct--;
			System.out.print(n.data+" ");
			for(Node val:n.child)
			{
				qt.add(val);
				cthelp++;
			}
			
			if(ct == 0)
			{
				ct = cthelp;
				cthelp = 0;
				System.out.println();
			}
//			System.out.println();
		}
		System.out.println();
		
	}

}
