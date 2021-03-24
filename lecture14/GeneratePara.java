package lecture14;

public class GeneratePara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(3, "", 0, 0);

	}
	public static void generate(int n, String ans, int open, int close)
	{
		if(open == n && close == n)
		{
			System.out.println(ans);
			return;
		}
		if(open > n || close > open)
		{
			return;
		}
		
		generate(n, ans+'(', open+1, close);
		generate(n, ans+")", open, close+1);
	}

}
