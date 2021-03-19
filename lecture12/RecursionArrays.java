package lecture12;

public class RecursionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,-12,3000,4};
//		printArrays(arr, 2);
//		printReverse2(arr, arr.length-1);
//		printArraysReverse(arr, 2);
//		System.out.println(arraysMaxTail(arr, 0, Integer.MIN_VALUE));
		System.out.println(arraysMax(arr, 0));

	}
	
	public static void printArrays(int[] arr,int id) {
		if(id == arr.length)
		{
			return;
		}
		
		System.out.print(arr[id]+" ");
		printArrays(arr, id+1);
	}
	
	public static void printArraysReverse(int[] arr, int id) {
		if(id == arr.length)
		{
			return;
		}
		
		printArraysReverse(arr, id+1);
		System.out.print(arr[id]+" ");
		
	}
	public static void printReverse2(int[] arr,int id) {
		if(id == -1)
		{
			return;
		}
		else
		{
			System.out.print(arr[id]+" ");
			printReverse2(arr, id-1);
		}
	}

	public static int arraysMaxTail(int[] arr,int id, int max) {
		if(id == arr.length)
		{
			return max;
		}
		else
		{
			if(arr[id] > max)
			{
				max = arr[id];
			}
			return arraysMaxTail(arr, id+1, max);
		}
	}

	public static int arraysMax(int[] arr,int id) {
		if(id == arr.length-1)
		{
			return arr[id];
		}
		int max = arraysMax(arr, id+1);
		if(max > arr[id])
		{
			return max;
		}
		else
			return arr[id];
			
	}

}
