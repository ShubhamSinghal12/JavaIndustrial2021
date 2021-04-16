package lecture19;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,30,15,10,70,20};
		System.out.println(partition(arr, 0, arr.length-1));
		System.out.println(Arrays.toString(arr));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void quickSort(int arr[], int si, int ei)
	{
		if(si>=ei)
		{
			return;
		}
		
		int pi = partition(arr, si, ei);
		
		quickSort(arr, si, pi-1);
		quickSort(arr, pi+1, ei);
		
	}
	
	
	public static int partition(int[] arr,int si,int ei)
	{
		int pi = si;
		Random r = new Random();
		int x = r.nextInt(ei-si)+si;
		
		int t = arr[x];
		arr[x] = arr[ei];
		arr[ei] = t;
		
		int pivot = arr[ei];
		for(int i = si; i <= ei; i++) //O(ei-si--->N)
		{
			if(pivot > arr[i])
			{
				t = arr[i];
				arr[i] = arr[pi];
				arr[pi] = t;
				pi++;
			}
			
		}
		
		t = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = t;
		
		return pi;
		
	}

}
