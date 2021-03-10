package lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2Ddemo {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		
//		int[][] arr = {{1, 0, 0, 0}, {0, 0, 2, 0}, {3, 0, 0, 0}};
		arr[0][0] = 1;
		arr[1][2] = 2;
		arr[2][0] = 3;
//		arr[2] = new int[1];
		
//		input(arr);
//		print(arr);
		printEFL(arr);
//		System.out.println(Arrays.deepToString(arr));
		
	}
	
	public static void print(int[][] arr) {
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void input(int[][] arr) {
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
//			System.out.println();
		}
	}
	
	public static void printEFL(int[][] arr)
	{
		for(int[] x: arr)
		{
			for(int i: x)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
