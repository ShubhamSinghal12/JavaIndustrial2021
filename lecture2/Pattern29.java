package lecture2;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1;
		int nst = 1;
		int row = 1;
		int val = 1;
		while(row<=n) {
//			val = row;
			int csp = 1;
			while(csp <= nsp) {
				System.out.print("  ");
				csp += 1;
			}
			
			int cst = 1;
			while(cst<=nst) {
				if(cst == 1 || cst == nst) {
					System.out.print(val + " ");
				}
				else {
					System.out.print("* ");
				}
				cst += 1;
			}
			
			nsp -= 1;
			nst += 2;
			row += 1;
			val += 1;
			System.out.println();
		}
	}
}
