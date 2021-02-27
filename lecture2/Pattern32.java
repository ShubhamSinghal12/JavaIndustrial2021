package lecture2;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = 1;
		int row = 1;
		int val = 1;
		while (row <= 2 * n - 1) {

			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print(val + " ");
				}
				cst += 1;
			}
			
			row += 1;

			if (row <= n) {
				nst += 2;
				val += 1;
			} else {
				nst -= 2;
				val -= 1;
			}

			
			System.out.println();
//			val += 1;

		}

	}

}
