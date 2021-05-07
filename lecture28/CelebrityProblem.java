package lecture28;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[][] = {{0,1,1,1},{0,0,1,0},{0,0,0,0},{0,1,1,0}};
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < ar.length; i++)
		{
			st.push(i);
		}
		
		while(st.size() != 1)
		{
			int a = st.pop();
			int b = st.pop();
			
			if(ar[a][b] == 1)
			{
				st.push(b);
			}
			else
			{
				st.push(a);
			}
		}
		
		boolean cele = true;
		int a = st.pop();
		
		for(int i = 0; i< ar.length; i++)
		{
			if(i != a && (ar[a][i] != 0 || ar[i][a] != 1))
			{
				cele = false;
			}
		}
		
		if(cele)
		{
			System.out.println(a+" is a Celebrity");
		}
		else
		{
			System.out.println("No Celebrity");
		}
		
	}
	
	
	

}
