package lecture27;

import lecture26.DynamicQueue;

public class StackUsingQueue {
	
	DynamicQueue qt;
	
	public StackUsingQueue()
	{
		qt = new DynamicQueue();	
	}
	
	public boolean isEmpty()
	{
		return qt.isEmpty();
	}
	
	public int size()
	{
		return qt.size();
	}
	
	public boolean isFull()
	{
		return qt.isFull();
	}
	
	public void push(int ele) throws Exception
	{
		qt.enqueue(ele);
	}
	
	public int pop() throws Exception
	{
		int n = qt.size();
		while(n > 1)
		{
			qt.enqueue(qt.dequeue());
			n--;
		}
		
		int t = qt.dequeue();
		return t;	
	}
	
	public int peek() throws Exception
	{
		int n = qt.size();
		while(n > 1)
		{
			qt.enqueue(qt.dequeue());
			n--;
		}
		
		int t = qt.dequeue();
		qt.enqueue(t);
		
		return t;	
	}
	
	public void display() throws Exception
	{
		actualReverse();
		qt.display();
		actualReverse();
	}
	
	private void actualReverse() throws Exception
	{
		if(qt.isEmpty())
		{
			return;
		}
		
		int n = qt.dequeue();
		actualReverse();
		qt.enqueue(n);
		
	}

	
	

}
