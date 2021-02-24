package Lecture1;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		int nsp = n-2;
		int row = 1;
		while(row<=n)
		{
			if(row == 1 || row == n)
			{
				int cst = 1;
				while(cst <= nst)
				{
					System.out.print("* ");
					cst += 1;
				}
			}
			else
			{
				System.out.print("* ");
				int csp = 1;
				while(csp <= nsp)
				{
					System.out.print("  ");
					csp += 1;
				}
				System.out.print("* ");
			}
			
			row += 1;
			System.out.println();
		}

	}

}
