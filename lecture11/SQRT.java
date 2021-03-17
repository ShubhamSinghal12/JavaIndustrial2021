package lecture11;

public class SQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		
		// case 1
		
		int i = 1;
		while(i*i<=n)
		{
			i++;
		}
		System.out.println(i-1);
		
		
		//case 2
		int si = 1;
		int ei = n;
		int ans = 1;
		while(si<=ei)
		{
			int mid = (si+ei)/2;
			if(mid*mid <= n)
			{
				ans = mid;
				si = mid+1;
			}
			else
			{
				ei = mid-1;
			}
		}
		System.out.println(ans);
		
		
		//case 3
		float fsi = 0;
		float fei = n;
		int count = 100;
		while(count-- >= 1)	{
			float mid = (fsi+fei)/2;
			if(mid*mid >= n-0.0001 && mid*mid <= n+0.0001)
			{
				System.out.println(mid);
				break;
			}
			else if(mid*mid < n)
			{
				fsi = mid;
			}
			else
			{
				fei = mid;
			}
		}

	}

}
