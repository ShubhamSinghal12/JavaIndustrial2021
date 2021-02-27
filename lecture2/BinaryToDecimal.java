package lecture2;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1111101;
		int ans = 0;
		int multi = 1;
		while(n!=0)
		{
			int rem = n%10;
			ans  = ans + multi*rem;
			
			multi = multi*2;
			n = n/10;
		}
		System.out.println(ans);

	}

}
