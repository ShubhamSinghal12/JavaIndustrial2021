package lecture11;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PD(10000);
//		PI(3);
//		PDI(3);
//		System.out.println(factorial(5));
//		System.out.println(factorialTail(5, 1));
//		System.out.println(power(5, 3));
//		System.out.println(powerTail(5, 3, 1));
		
		System.out.println(fib(4));
		System.out.println(fibTail(4, 0, 1));

	}
	
	public static void PD(int n)
	{
		if(n == 0)
			return;
		else
		{
			System.out.print(n+" ");
			PD(n-1);
		}
	}
	
	public static void PI(int n) {
		if(n == 0)
			return;
		else
		{
			PI(n-1);
			System.out.println(n);
		}
	}
	public static void PDI(int n) {
		if( n == 1)
			System.out.println(1);
		else
		{
			System.out.println(n);
			PDI(n-1);
			System.out.println(n);
		}
	}

	public static int factorial(int n)
	{
		if(n == 1)
			return 1;
//		int ans = n*factorial(n-1);
		
		return n*factorial(n-1);
	}
	
	public static int factorialTail(int n,int ans)
	{
		if(n == 1)
		{
			return ans;
		}
		else
		{
			return factorialTail(n-1,ans*n);
		}
	}
	
	public static int power(int a, int b)
	{
		if(b == 0)
			return 1;
		else
		{
			return a*power(a,b-1);
		}
	}
	public static int powerTail(int a, int b,int ans)
	{
		if(b == 0)
			return ans;
		else
		{
			return powerTail(a,b-1,a*ans);
		}
	}


	public static int fib(int n) {
		if(n <= 1)
			return n;
		int a = fib(n-1);
		int b = fib(n-2);
		return a+b;
	}
	
	public static int fibTail(int n, int a, int b) {
		if(n == 0)
			return a;
		else
			return fibTail(n-1,b,a+b);
	}
}
