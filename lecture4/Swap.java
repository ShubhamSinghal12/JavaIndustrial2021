package lecture4;

public class Swap {
	
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
		int b = 20;
		
		System.out.println(val+" "+b);
		swap(val,b);
		System.out.println(val+" "+b);

	}
	
	
	public static void swap(int val, int b) {
		int t = Swap.val;
		Swap.val = b;
		b = t;
//		val = t;
	}

}
