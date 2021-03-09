package lecture7;

import java.util.Arrays;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,0,4};
		int[] inv = inverse(arr);
		System.out.println(Arrays.toString(inv));

	}
	
	public static int[] inverse(int[] arr) {
		int[] inv = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			inv[arr[i]] = i;
		}
		return inv;
	}

}
