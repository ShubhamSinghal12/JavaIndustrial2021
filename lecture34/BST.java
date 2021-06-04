package lecture34;


public class BST {
	
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
	
	public void create(int[] arr)
	{
		root = create(arr,0,arr.length-1);
	}
	
	private Node create(int[]arr,int low,int high) {
		
		if(low>high)
		{
			return null;
		}
		int mid = (low+high)/2;
		
		Node nn = new Node(arr[mid]);
		nn.left = create(arr, low, mid-1);
		nn.right = create(arr, mid+1, high);
		
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
		System.out.print("<-- "+node.data+" --> ");
		if(node.right != null)
		{
			System.out.print(node.right.data+" ");
		}
		System.out.println();
		
		display(node.left);
		display(node.right);	
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
		if(node.data > ele)
		{
			return search(node.left,ele);
		}
		else
		{
			return search(node.right,ele);
		}
		
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
		if(node.right == null)
		{
			return node.data;
		}
		else
		{
			return max(node.right);
		}
	}
	
	public int min()
	{
		return min(root);
	}
	private int min(Node node)
	{
		if(node == null)
		{
			return Integer.MAX_VALUE;
		}
		if(node.left == null)
		{
			return node.data;
		}
		else
		{
			return min(node.left);
		}
	}
	
	
	
	public boolean isBST()
	{
		return isBST(root);
	}
	
	private boolean isBST(Node node)
	{
		if(node == null)
		{
			return true;
		}
		
		boolean is = true;
		if(max(node.left) > node.data || min(node.right) < node.data)
		{
			is = false;
		}
		return is && isBST(node.left) && isBST(node.right);
		
	}
	
	
	private class isBSTPair{
		boolean isbst = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}
	
	public boolean isBST2()
	{
		return isBST2(root).isbst;
	}
	
	private isBSTPair isBST2(Node node)
	{
		if(node == null)
		{
			return new isBSTPair();
		}
		
		isBSTPair left = isBST2(node.left);
		isBSTPair right = isBST2(node.right);
		
		isBSTPair is = new isBSTPair();
		
		if(left.max > node.data || right.min < node.data)
		{
			is.isbst = false;
		}
		
		is.max = Math.max(node.data, Math.max(left.max, right.max));
		is.min = Math.min(node.data,Math.min(left.min, right.min));
		
		return is;
		
	}
	
	public boolean isBST3()
	{
		return isBST3(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean isBST3(Node node,int low, int high)
	{
		if(node == null)
		{
			return true;
		}
		if(node.data < low || node.data > high)
		{
			return false;
		}
		else
		{
			return isBST3(node.left,low,node.data) && isBST3(node.right,node.data,high);
		}
	}
	
	
	public void add1(int n)
	{
		if(root == null)
			root = new Node(n);
		else
			add1(root,n);
	}
	
	private void add1(Node node,int n) {
		
		if(node.data > n)
		{
			if(node.left == null)
			{
				Node nn = new Node(n);
				node.left = nn;
			}
			else {
				add1(node.left,n);
			}
		}
		else
		{
			if(node.right == null)
			{
				Node nn = new Node(n);
				node.right = nn;
			}
			else {
				add1(node.right,n);
			}
		}
		
	}
	
	public void add2(int n)
	{
		root = add2(root,n);
	}
	
	private Node add2(Node node,int n) {
		
		if(node == null)
		{
			return new Node(n);
		}
		
		if(node.data > n)
		{
			node.left = add2(node.left,n);
		}
		else
		{
			node.right = add2(node.right,n);
		}
		return node;
	}
	
	
	public void remove(int n)
	{
		remove(root,null,false,n);
	}
	
	private void remove(Node node,Node parent,boolean lr,int n)
	{
		if(node == null)
		{
			return;
		}
		if(node.data > n)
		{
			remove(node.left,node,true,n);
		}
		else if(node.data < n)
		{
			remove(node.right,node,false,n);
		}
		else
		{
			if(node.left == null && node.right == null)
			{
				if(lr)
				{
					parent.left = null;
				}
				else
				{
					parent.right = null;
				}
			}
			else if (node.right == null)
			{
				if(lr)
				{
					parent.left = node.left;
				}
				else
				{
					parent.right = node.left;
				}
			}
			else if (node.left == null)
			{
				if(lr)
				{
					parent.left = node.right;
				}
				else
				{
					parent.right = node.right;
				}
			}
			else
			{
				int max = max(node.left);
				node.data = max;
				remove(node.left,node,true,max);
			}
		}
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
	
	public void printDecreasing()
	{
		pd(root);
	}
	
	private void pd(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		pd(node.right);
		System.out.print(node.data+" ");
		pd(node.left);
		
	}
	
	static private int sum = 0;
	
	public void replaceWithlarger()
	{
		rwl(root);
	}
	private void rwl(Node node)
	{
		if(node == null)
		{
			return;
		}
		
		rwl(node.right);
		
		int t = node.data;
		node.data = sum;
		sum += t;
		
		rwl(node.left);

	}
	
	public void printInRange1(int low,int high)
	{
		pir1(root,low,high);
	}
	
	private void pir1(Node node,int low,int high)
	{
		if(node == null)
		{
			return;
		}
		
		pir1(node.left,low,high);
		if(node.data >= low && node.data <= high)
		{
			System.out.print(node.data+" ");
		}
		pir1(node.right,low,high);
		
	}
	
	public void printInRange2(int low,int high)
	{
		pir2(root,low,high);
	}
	
	private void pir2(Node node,int low,int high)
	{
		if(node == null)
		{
			return;
		}
		
		if(node.data > high)
		{
			pir2(node.left,low,high);
		}
		else if (node.data < low)
		{
			pir2(node.right,low,high);
		}
		else {
			
			pir2(node.left,low,high);
			System.out.print(node.data+" ");
			pir2(node.right,low,high);
		}
	}
	
	
	
	
	
	
	

}
