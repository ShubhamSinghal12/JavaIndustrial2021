package lecture7;

import java.util.Arrays;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		rotateK(arr,2);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void rotate_1(int[] arr)
	{
		int temp = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	public static void rotate(int[] arr,int rot)
	{
		rot = rot%arr.length;
		if(rot<0)
			rot += arr.length;
		for(int i = 1; i <= rot; i++)
		{
			rotate_1(arr);
		}
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
	
	public static void rotateK(int[] arr,int rot)
	{
		reverse(arr, 0, arr.length-rot-1);
		reverse(arr, arr.length-rot, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}
}
