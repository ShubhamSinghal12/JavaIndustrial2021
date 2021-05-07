package lecture28;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28} , k = 3;
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i <= arr.length-k; i++)
		{
			boolean neg = false;
			for(int j = i; j < i+k; j++)
			{
				if(arr[j] < 0)
				{
					System.out.print(arr[j]+" ");
					neg = true;
					break;
				}
			}
			if(neg == false)
			{
				System.out.println("0 ");
			}
			
		}
		
		Queue<Integer> qt = new LinkedList<Integer>();
		
		for(int i = 0; i < k; i++)
		{
			if(arr[i] < 0)
			{
				qt.add(i);
			}
		}
		
		if(qt.isEmpty())
		{
			System.out.print("0 ");
		}
		else
		{
			System.out.print(arr[qt.peek()]+" ");
		}
		
		for(int i = k ;i < arr.length;i++)
		{
			if(arr[i] < 0)
			{
				qt.add(i);
			}
			
			if(qt.peek() <= i-k)
			{
				qt.remove();
			}
			
			if(qt.isEmpty())
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print(arr[qt.peek()]+" ");
			}
		}
			
		
		
		
		
		

	}

}
