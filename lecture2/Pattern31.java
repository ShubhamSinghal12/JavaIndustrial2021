package lecture2;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nst = n;
		int val = n;
		int row = 1;
//		int stprint = n;
		while(row<=n) {
			int cst = 1;
			while(cst <= nst)
			{
				if(cst+row != n+1) {
					System.out.print(val+" ");
				}
				else {
					System.out.print("* ");
				}
				cst += 1;
				val -= 1;
			}
			
			row += 1;
			System.out.println();
			val = n;
//			stprint -= 1;
		}

	}

}
