package lecture16;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] arr1 = new int[n];
			int arr2[] = new int[m];
			
			for(int i = 0; i < n; i++)
			{
				arr1[i] = sc.nextInt();
			}
			
			for(int i = 0; i < m; i++)
			{
				arr2[i] = sc.nextInt();
			}
			
			
			int i = 0;
			int j = 0;
			int pathi = 0, pathj = 0, ans = 0;
			while(i < arr1.length && j < arr2.length)
			{
				if(arr1[i] == arr2[j])
				{
					ans += Math.max(pathi, pathj);
					ans += arr1[i];
					pathi = 0;
					pathj = 0;
					i += 1;
					j += 1;
					
				}
				else if(arr1[i] > arr2[j])
				{
					pathj += arr2[j];
					j += 1;
					
				}
				else if(arr1[i] < arr2[j])
				{
					pathi += arr1[i];
					i += 1;
				}
			}
			
			while(i<arr1.length)
			{
				pathi += arr1[i];
				i += 1;
			}
			
			while(j<arr2.length)
			{
				pathj += arr2[j];
				j +=1;
			}
			ans += Math.max(pathi, pathj);
			
			System.out.println(ans);
			
		}
	}
	
	

}
