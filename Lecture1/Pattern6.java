package Lecture1;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		int nsp = 0;
		int row = 1;
		while(row<=n)
		{
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			int cst = 1;
			while(cst<= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			nsp += 2;
			nst -= 1;
			row += 1;
			System.out.println();
			
		}

	}

}
