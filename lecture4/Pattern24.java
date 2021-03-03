package lecture4;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = 1;
		int nsp = n-1;
		int row = 1;
		int val = 1;
		while(row<=n) {
			val = row;
//			print(nsp,"  ");
//			print(nst, val+" ");
			
			int csp = 1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp += 1;
			}
			
			int cst = 1;
			while(cst<=nst)
			{
				System.out.print(val+" ");
				if(cst<=nst/2)
					val += 1;
				else
					val -= 1;
				cst += 1;
			}
			
			
			nst += 2;
			nsp -= 1;
			row += 1;
//			val += 1;
			System.out.println();
		}

	}
	
	public static void print(int n,String pt) {
		for(int i = 1; i <= n; i++)
		{
			System.out.print(pt);
		}
	}

}