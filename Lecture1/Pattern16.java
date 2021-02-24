package Lecture1;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int nsp = n-1;
		int nst = n;
		int row = 1;
		while(row <= 2*n-1) {
			
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
			
			if(row < n) {
				nst -= 1;
				nsp -= 1;
			}
			else
			{
				nst += 1;
				nsp += 1;
			}
			
			row += 1;
			System.out.println();
		}

	}

}
