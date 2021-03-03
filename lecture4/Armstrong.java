package lecture4;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArmstrong(1000);
//		System.out.println(isArmstrong(150));
	}
	
	
	public static void printArmstrong(int n) {
		
		for(int i = 1; i <= n; i++)
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isArmstrong(int n) {
		int ans = 0;
		int org = n;
		int nod = numberOfDigits(n);
		while(n!=0)
		{
			int rem = n%10;
			ans = ans + (int)Math.pow(rem, nod);
			n = n/10;
		}
		if(ans == org)
			return true;
		else 
			return false;
	}
	
	public static int numberOfDigits(int n) {
		int nod = 0;
		while(n!=0)
		{
			nod += 1;
			n = n/10;
		}
		return nod;
	}

}
