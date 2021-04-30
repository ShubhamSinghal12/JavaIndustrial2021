package lecture25;

public class Queue {

	protected int[] arr;
	protected int front;
	protected int size;
	
	public Queue(int size)
	{
		arr = new int[size];
		front = -1;
		size = 0;
	}
	
	public Queue()
	{
		this(10);
	}
	
	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(size >= arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Queue overflow");
		}
		
		size++;
		arr[(front+size)%arr.length] = ele;
		
	}
	
	public int dequeue() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue underflow");
		}
		
		front = (front+1)%arr.length;
		int t = arr[front];
		size -= 1;
		if(size == 0)
		{
			front = -1;
		}
		return t;
	}
	
	public int getFront() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Queue underflow");
		}
		return arr[(front+1)%arr.length];
	}
	
	public void display()
	{
		for(int i = 1; i <= size;i++)
		{
			System.out.print(arr[(front+i)%arr.length]+" ");
		}
		System.out.println();
	}
	

}
