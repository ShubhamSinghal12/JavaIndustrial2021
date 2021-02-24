package Lecture1;

import java.util.Scanner;

public class Patter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp1 = 0;
		int nsp2 = n -2;
		int row = 1;
		while(row <= n)
		{
			int csp = 1;
			while(csp <= nsp1) {
				System.out.print("  ");
				csp += 1;
			}
			
			System.out.print("* ");
			
			csp = 1;
			while(csp <= nsp2) {
				System.out.print("  ");
				csp += 1;
			}
			
			if(row != n/2+1) {
				System.out.print("* ");
			}
			
			
			if(row <= n/2)
			{
				nsp1 += 1;
				nsp2 -= 2;
			}
			else
			{
				nsp1 -= 1;
				nsp2 += 2;
			}
			
			row += 1;
			System.out.println();
			
		}

	}

}
