package lecture21;

public class Sieves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		
		boolean arr[] = new boolean[n+1];
		for(int i = 2; i <= n; i++)
		{
			if(arr[i] == false)
			{
//				System.out.println(i);
				int j = 2*i;
				while(j<=n)
				{
					arr[j] = true;
					j += i;
				}
			}
		}
		
		for(int i = 2; i <= n; i++)
		{
			if(arr[i] == false)
			{
				System.out.print(i+" ");
			}
		}

	}

}
