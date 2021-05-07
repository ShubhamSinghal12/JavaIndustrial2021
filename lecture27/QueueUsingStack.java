package lecture27;

import lecture26.DynamicStack;

public class QueueUsingStack {
	
	DynamicStack st = new DynamicStack();
	
	public boolean isEmpty()
	{
		return st.isEmpty();
	}
	
	public boolean isFull()
	{
		return st.isFull();
	}
	
	public int size()
	{
		return st.size();
	}
	
	public void enqueue(int ele) throws Exception
	{
		st.push(ele);	
	}
	
	public int dequeue() throws Exception
	{
		if(st.size()==1)
		{
			int t = st.pop();
			return t;
		}
		
		int n = st.pop();
		int t = dequeue();
		st.push(n);
		
		return t;
		
	}
	
	public int getFront() throws Exception
	{
//		st.display();
		if(st.size() == 1)
		{
			int t = st.peek();
			return t;
		}
		
		int n = st.pop();
		int t = getFront();
		st.push(n);
		
		return t;
	}
	
	public void display() throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		
		int n = st.pop();
		display();
		System.out.print(n+" ");
		st.push(n);
		
		
	}


}
