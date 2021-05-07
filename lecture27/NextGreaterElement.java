package lecture27;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,11,8,9,1,2,10,3,2,4};
		
		int ans[] = new int[arr.length];
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < arr.length; i++)
		{
			while(!st.isEmpty() && arr[i] > arr[st.peek()])
			{
				ans[st.pop()] = arr[i];
			}
			
			st.push(i);
		}
		
		while(!st.isEmpty())
		{
			ans[st.pop()] = -1;
		}
		
		System.out.println(Arrays.toString(ans));

	}

}
