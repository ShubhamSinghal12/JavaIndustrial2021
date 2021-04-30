package lecture26;

import lecture25.Queue;

public class DynamicQueue extends Queue{
	
	@Override
	public void enqueue(int ele) throws Exception
	{
		if(isFull())
		{
			int na[] = new int[arr.length*2];
			for(int i = 1; i<=size ;i++)
			{
				na[i-1] = arr[(front+i)%arr.length];
			}
			arr = na;
			front = -1;
		}
		super.enqueue(ele);
		System.out.println(arr.length);
	}

	
}
