package lecture2;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 125;
		int ans = 0;
		int multi = 1;
		while(n!=0)
		{
			int rem = n%2;
			ans  = ans + multi*rem;
			
			multi = multi*10;
			n = n/2;
		}
		System.out.println(ans);

	}

}
