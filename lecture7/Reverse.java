package lecture7;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,1,4,3,6};
//		printReverse(arr);
		System.out.println(Arrays.toString(arr));
		reverse(arr,0,arr.length-1);
//		reverseK(arr, 4);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void printReverse(int[] arr)
	{
		for(int i = arr.length-1; i >= 0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverse(int[] arr,int a,int b)
	{
		int si = a;
		int ei = b;
		while(si < ei)
		{
			int t = arr[si];
			arr[si] = arr[ei];
			arr[ei] = t;
			
			si += 1;
			ei -= 1;
		}
	}

	public static void reverseK(int[] arr, int k)
	{
		double count = Math.ceil(arr.length*1f/k);
		for(int i = 0; i < count; i++)
		{
			int si = i*k;
			int ei = (i+1)*k-1;
			if(ei > arr.length-1)
			{
				ei = arr.length-1;
			}
			reverse(arr, si, ei);
		}
	}
}
