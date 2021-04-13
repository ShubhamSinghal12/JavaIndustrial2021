package lecture19;

public class TimeComplexity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int n = 1000000;
		int k = 7;
		
		while(i<=n)
		{
			i++;
		}
		
		while(i<=n)
		{
			i+=2;
			//i+=3;
		}
		
		while(i<=n)
		{
			i+=k;
		}
		
		
		//-------------------------------------
		
		
		while(i<=n)
		{
			i *= 2;
		}
		
		while(i<=n)
		{
			i *= 3;
			//i *= 2;
		}
		
		while(i<=n)
		{
			i *= k;
		}
		
		//-----------------------------------------
		
		while(n > 0)
		{
			n /= 2;
		}
		
		while(n > 0)
		{
			n /= 3;
		}
		
		while(n > 0)
		{
			n /= k;
		}
		
		
		//-----------------------------------------
		
		while(n > 0)
		{
			n -= 1;
		}
		
		while(n > 0)
		{
			n -= 3;
			//n -= 2;
		}
		
		while(n > 0)
		{
			n -= k;
		}
		
				

	}

}
