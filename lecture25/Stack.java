package lecture25;

public class Stack {
	
	
	protected int[] arr;
	protected int tos;
	
	public Stack(int size) {
		arr = new int[size];
		tos = -1;
	}
	
	public Stack() {
		this(10);
	}
	
	public boolean isEmpty()
	{
		if(tos == -1)
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
		return tos+1;
	}
	
	public boolean isFull()
	{
		if(tos == arr.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Stack overflow");
		}
		
		tos++;
		arr[tos] = ele;
	}
	
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack underflow");
		}
		
		int t = arr[tos];
		tos--;
		return t;
	}
	
	public int peek() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack underflow");
		}
		
		return arr[tos];
		
	}
	
	public void display()
	{
		for(int i = tos; i >= 0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	

}
