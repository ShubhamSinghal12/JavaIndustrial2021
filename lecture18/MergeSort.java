package lecture18;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] a = {1,5,6,8,12};
//		int[] b = {2,3,7,9,10,13};
//		
//		int[] r = merge(a, b);
//		System.out.println(Arrays.toString(r));
		
		int arr[] = {3,9,8,4,1,10};
		System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length-1)));

	}
	
	public static int[] merge(int[] a, int[] b)
	{
		int [] result = new int[a.length+b.length];
		
		int i = 0;
		int j = 0;
		int r = 0;
		while(i<a.length && j<b.length)
		{
			if(a[i] <= b[j])
			{
				result[r] = a[i];
				i++;
			}
			else
			{
				result[r] = b[j];
				j++;
			}
			r++;
		}
		
		while(i<a.length)
		{
			result[r] = a[i];
			i++;
			r++;
		}
		
		while(j<b.length)
		{
			result[r] = b[j];
			j++;
			r++;
		}
		
		return result;
		
	}

	public static int[] mergeSort(int[] arr,int si, int ei)
	{
		if(si == ei)
		{
			int[] r = new int[1];
			r[0] = arr[si];
			return r;
		}
		
		int mid = (si+ei)/2;
		int[] sr = mergeSort(arr, si, mid);
		int[] fr = mergeSort(arr, mid+1, ei);
		
		
		return merge(sr, fr);
		
	}
}
