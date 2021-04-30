package lecture26;

import lecture25.Stack;

public class DynamicStack extends Stack {
	
	
	public DynamicStack()
	{
		super(5);
	}
	
	public DynamicStack(int size)
	{	
		super(size);
	}
	
	public void push(int ele) throws Exception
	{
		if(isFull())
		{
			int na[] = new int[arr.length*2];
			for(int i = 0; i <= arr.length-1; i++)
			{
				na[i] = arr[i];
			}
			
			arr = na;
		}
		
//		tos++;
//		arr[tos] = ele;
		
		super.push(ele);
//		System.out.println(arr.length);

	}

}
