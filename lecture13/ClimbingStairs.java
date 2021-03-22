package lecture13;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(csCount(5,0,""));

	}
	
	public static void cs(int n, int step, String ans)
	{
		if(step  == n)
		{
			System.out.println(ans);
			return;
		}
		
		if(step > n)
		{
			return;
		}
		cs(n,step+1,ans+"1 ");
		cs(n,step+3,ans+"3 ");
		cs(n,step+5,ans+"5 ");
	}
	
	public static int csCount(int n, int step, String ans)
	{
		if(step  == n)
		{
			System.out.println(ans);
			return 1;
		}
		
		if(step > n)
		{
			return 0;
		}
		int count = 0;
		count += csCount(n,step+1,ans+"1 ");
		count += csCount(n,step+3,ans+"3 ");
		count += csCount(n,step+5,ans+"5 ");
		return count;
	}


}
