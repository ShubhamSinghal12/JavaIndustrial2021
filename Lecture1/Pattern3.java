package Lecture1;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		int row = 1;
		while(row<=n) {
			int cst = 1;
			while(cst<= nst)
			{
				System.out.print("* ");
				cst += 1;
			}
			
			row += 1;
			nst -= 1;
			System.out.println();
		}

	}

}
