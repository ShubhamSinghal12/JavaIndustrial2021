package Lecture1;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1;
		int nst = 1;
		int row = 1;
		while(row <= n) {
			
			int csp = 1;
			while(csp <= nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			int cst = 1;
			while(cst<= nst)
			{
				if(cst%2 != 0)
					System.out.print("* ");
				else
					System.out.print("! ");
				cst += 1;
			}
			
			nst += 2;
			nsp -= 1;
			row += 1;
			System.out.println();
		}

	}

}
