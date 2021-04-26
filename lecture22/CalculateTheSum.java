package lecture22;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateTheSum {

	public static int mod = 1000000000+7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		System.out.println(Arrays.toString(arr));
		for(int i = 1; i <= q; i++)
		{
			int x = sc.nextInt();
			arr = operation(arr, x);
			System.out.println(Arrays.toString(arr));
		}
		
		int sum = 0;
		for(int i:arr)
		{
			sum = (sum+i)%mod;
		}
		System.out.println(sum);
	}
	
	public static int[] operation(int[] arr, int x)
	{
		int[] ans = new int[arr.length];
		for(int i = 0; i <arr.length; i++)
		{
			int j = 0;
			if(i<x)
			{
				j = arr.length+i-x;
			}
			else
			{
				j = i-x;
			}
			
//			int j = (arr.length+i-x)%arr.length;
			
			ans[i] = (arr[i]+arr[j])%mod;
		}
		
		return ans;
	}

}
