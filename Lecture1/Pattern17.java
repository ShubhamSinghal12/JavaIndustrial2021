package Lecture1;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n/2;
		int nsp = 1;
		int row = 1;
		while(row <= n)
		{
			int cst = 1;
			while(cst<= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			
			cst = 1;
			while(cst<= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			if(row <= n/2) {
				nst -= 1;
				nsp += 2;
			}
			else
			{
				nst += 1;
				nsp -= 2;
			}
			
			row += 1;
			System.out.println();
		}

	}

}
