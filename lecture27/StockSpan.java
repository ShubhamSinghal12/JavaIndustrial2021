package lecture27;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,70,80,90,100,20,10,25,30};
		
		int ans[] = new int[arr.length];
		
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[i] >= arr[st.peek()])
			{
				st.pop();
			}
			
			if(st.isEmpty())
			{
				ans[i] = i+1;
			}
			else
			{
				ans[i] = i-st.peek();
			}
			
			st.push(i);
		}
		
		System.out.println(Arrays.toString(ans));		

	}

}
