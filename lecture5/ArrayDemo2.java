package lecture5;

import java.util.Scanner;

public class ArrayDemo2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,4,5};
//		int[] arr2 = arr;
//		System.out.println(arr2[0]);
//		arr2[0] = 10000;
//		System.out.println(arr[0]);
		
		int arr3[] = new int[10];
		takeInput(arr3);
		display(arr3);

//		arr = arr3;
//		arr2 = arr3;
//		System.out.println(arr +" "+ arr2+" "+arr3);

	}
	
	public static void takeInput(int[] arr) {
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void display(int[] arr)
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
