package lecture14;

public class LexoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lexoCount(1001, 0);
	}
	
	public static void lexoCount(int n,int val)
	{
		if(val > n)
		{
			return;
		}
		System.out.println(val);
		int i = 0;
		if(val == 0)
			i = 1;
		while(i <= 9) {
			lexoCount(n, val*10+i);
			i++;
		}
	}

}
