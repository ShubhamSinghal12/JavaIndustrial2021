package lecture29;

public class LinkedList {
	
	private class Node{
		
		int data;
		Node next;
		
		
		Node(int val)
		{
			data = val;
			next = null;
		}
		
		Node(){
			this(0);
		}
	}
	
	private Node head;
	private int size;
	private Node tail;
	
	//O(n)
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	//O(n) if size O(1)
	public int size()
	{
		Node temp = head;
		int count = 0;
		while(temp != null)
		{
			count += 1;
			temp = temp.next;
		}
		return count;
		//return size
	}
	
	//O(1)
	public boolean isEmpty() {
		
		if(head == null)
			return true;
		else
			return false;
	}
	
	//O(1)
	public int getFirst() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("LL underflow");
		}
		
		return head.data;
		
	}
	
	//O(n) if tail We can do it in O(1)
	public int getLast() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("LL underflow");
		}
		
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		return temp.data;
	}
	
	//O(n)
	public int getAt(int id) throws Exception
	{
		
		if(id < 0 || id >= size())
		{
			throw new Exception("Invalid Index");
		}
		
		Node temp = head;
		while(id > 0)
		{
			temp = temp.next;
			id--;
		}
		
		return temp.data;	
		
	}
	
	//O(n)
	private Node getNodeAt(int id)
	{
		
		Node temp = head;
		while(id > 0)
		{
			temp = temp.next;
			id--;
		}
		
		return temp;		
	}

	//O(1)
	public void addFirst(int val)
	{
		Node nn = new Node(val);
		
//		if(isEmpty())
//		{
//			head = nn;
//			return;
//		}
		
		nn.next = head;
		head = nn;
		//size++
	}
	
	//O(n) if tail We can do it in O(1)
	public void addLast(int val) {
		
		if(isEmpty())
		{
			addFirst(val);
			return;
		}
		
//		Node temp = head;
//		
//		while(temp.next != null)
//		{
//			temp = temp.next;
//		}
//		
		
		Node nn = new Node(val);
		Node temp = getNodeAt(size()-1);
		temp.next = nn;
		//size++
		
		
	}
	
	//O(n)
	public void addAt(int val, int id) throws Exception{
		
		if(id < 0 || id > size())
		{
			throw new Exception("Invalid Index");
		}
		
		Node temp = getNodeAt(id-1);
		Node nn = new Node(val);
		
		nn.next = temp.next;
		temp.next = nn;
		//size++
		
	}
	
	//O(1)
	public int removeFirst() throws Exception{
		
		if(isEmpty())
		{
			throw new Exception("LL is Empty");
		}
		
		int td = head.data;
		head = head.next;
		//size--
		return td;
	}
	
	//O(n)
	public int removeLast() throws Exception{
		
		if(isEmpty())
		{
			throw new Exception("LL is Empty");
		}
		
		int s = size();
		if(s == 1)
		{
			return removeFirst();
		}
		
		Node temp = getNodeAt(s-2);
		int td = temp.next.data;
		temp.next = null;
		
		//size--
		
		return td;
	}
	
	//O(n)
	public int removeAt(int id) throws Exception{
		
		if(id < 0 || id >= size())
		{
			throw new Exception("Invalid Index");
		}
		
		if(id == 0)
		{
			return removeFirst();
		}
		
		Node temp = getNodeAt(id-1);
		
		int td = temp.next.data;
		temp.next = temp.next.next;
		
		//size--
		
		return td;
		
	}
	
	

}
