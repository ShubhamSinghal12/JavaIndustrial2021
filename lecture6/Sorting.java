package lecture6;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 1, 3, 2, 4};
		System.out.println(Arrays.toString(arr));
//		selectionSort(arr);
//		bubbleSort(arr);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 4));

	}

	public static void swap(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++)
		{
			int min = i;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[j] < arr[min])
				{
					min = j;
				}
			}
			swap(arr,min,i);
		}
	}

	public static void bubbleSort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr, j, j+1);
					count += 1;
				}
			}
			if(count == 0)
				break;
		}
	}

	public static void insertionSort(int[] arr) {
		for(int i = 1; i<arr.length; i++)
		{
			int numToInsert = arr[i];
			int j = i-1;
			while(j >=0 && arr[j] > numToInsert)
			{
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1] = numToInsert;
		}
	}


	public static int binarySearch(int[] arr,int ele) {
		int low = 0;
		int high = arr.length-1;
		while(low <= high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == ele)
			{
				return mid;
			}
			else if (arr[mid] > ele)
			{
				high = mid -1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
}
