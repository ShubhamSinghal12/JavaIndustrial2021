package lecture27;

import lecture26.DynamicStack;

public class StackReverse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DynamicStack st = new DynamicStack();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		st.display();
		displayReverse(st);
		System.out.println();
		st.display();
		
		ActualReverse(st);
		st.display();
		

	}
	
	//O(n)
	public static void displayReverse(DynamicStack st) throws Exception
	{
		if(st.isEmpty())
		{
			return;
		}
		
		int n = st.pop();
		displayReverse(st);
		System.out.print(n+" ");
		st.push(n);
		
		
	}
	
	//O(n)
	public static void ActualReverse(DynamicStack st) throws Exception
	{
		DynamicStack temp = new DynamicStack();
		while(!st.isEmpty())
		{
			temp.push(st.pop());
		}
		arHelper(st,temp);
	}
	
	public static void arHelper(DynamicStack st, DynamicStack temp) throws Exception{
		
		if(temp.isEmpty())
		{
			return;
		}
		
		int n = temp.pop();
		arHelper(st,temp);
		st.push(n);
	}
	
	

}
