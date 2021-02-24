package Lecture1;

import java.util.Scanner;

public class MinN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int i = 1;
		while(i <= n)
		{
			int a = sc.nextInt();
			if(a < min) {
				min = a;
			}
			i += 1;
		}
		System.out.println("Min: "+ min);

	}

}
