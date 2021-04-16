package lecture21;

public class Ploynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] poly = {1,0,1,0,0,1};
		int x = 5;
		int n = 5;
		int ans = 0;
		for(int i = 0; i <= n; i++)
		{
			ans = ans+ poly[i]*(int)Math.pow(x, i);//O(nlgn)
		}
		
		System.out.println(ans);
		ans = 0;
		int pow = 1;
		for(int i = 0; i <= n; i++)
		{
			ans = ans+poly[i]*pow;//O(nlgn)
			pow = pow*x;
		}
		
		System.out.println(ans);

	}
	
	
	
	

}
