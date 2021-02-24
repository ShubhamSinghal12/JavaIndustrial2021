package Lecture1;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int flag = 0;
		while(i < n) {
			if(n%i == 0)
			{
				flag = 1;
//				break;
			}
			i += 1;
		}
		if(flag == 0)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
	}

}
