package lecture5;

import java.util.Scanner;

public class ArraysQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Sum: "+sum(arr));
		System.out.println("Average: "+ (float)sum(arr)/arr.length);
		System.out.println("Max: "+ max(arr));
//		System.out.println("Min: "+ min(arr));
		int ele = sc.nextInt();
		find(arr, ele);
		int result = find(arr, ele);
		System.out.println("Found 10 at index: "+ result);

	}

	public static int sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;

	}

	public static int max(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		return max;
	}
//
//	public static int min(int[] arr) {
//
//	}
//	
	
	public static int find(int[] a, int ele) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == ele)
			{
				return i;
			}
		}
		return -1;
	}

}
