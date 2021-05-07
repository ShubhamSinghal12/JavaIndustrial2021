package lecture28;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,11,8,9,1,2,10,3,2,4};
		
		int ans[] = new int[arr.length];
		for(int i = 0; i < ans.length; i++)
		{
			ans[i] = -2;
		}
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i <= 2*arr.length; i++)
		{
			while(!st.isEmpty() && arr[i%arr.length] > arr[st.peek()])
			{
				ans[st.pop()] = arr[i%arr.length];
			}
			
			st.push(i%arr.length);
		}
		
		while(!st.isEmpty())
		{
			int i = st.pop();
			if(ans[i] == -2)
				ans[i] = -1;
		}
		
		System.out.println(Arrays.toString(ans));

	}

}
