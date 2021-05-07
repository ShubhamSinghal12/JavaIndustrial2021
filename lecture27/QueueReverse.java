package lecture27;

import lecture26.DynamicQueue;

public class QueueReverse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DynamicQueue qt = new DynamicQueue();
		qt.enqueue(1);
		qt.enqueue(2);
		qt.enqueue(3);
		qt.enqueue(4);
		qt.enqueue(5);
		
		qt.display();
		actualReverse(qt);
		qt.display();

	}
	
	public static void actualReverse(DynamicQueue qt) throws Exception
	{
		if(qt.isEmpty())
		{
			return;
		}
		
		int n = qt.dequeue();
		actualReverse(qt);
		qt.enqueue(n);
		
	}

}
