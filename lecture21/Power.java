package lecture21;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2,7));

	}
	
	public static int power(int a, int b)
	{
		if(b == 0)
		{
			return 1;
		}
		else
		{
			int t = power(a,b/2);
			if(b%2 == 0)
			{
				return t*t;
			}
			else
			{
				return t*t*a;
			}
		}
	}

}
