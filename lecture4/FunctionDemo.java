package lecture4;

public class FunctionDemo {

//	public static void addition() {
//		int a = 10;
//		int b = 20;
//		int sum = a+b;
//		subtraction();
//		System.out.println(sum);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
//		addition();
		int x = 10;
		int y = 20;
//		int s = addition(10, 20);
		System.out.println(addition(x, y));
//		subtraction();
		System.out.println("Bye");

//		int a = addition(10, 20) + 1000;

	}
	
//	public static void addition(int a, int b) {
//		int sum = a + b;
//		System.out.println(sum);
//		subtraction(10,20);
//	}
	
	public static int addition(int a, int b) {
//		int sum = a + b;
//		System.out.println(sum);
//		subtraction(10,20);
		return a+b;
	}
	
	public static void subtraction(int a,int b) {
		a = 100;
		int diff = b - a;
		System.out.println(diff);
//		addition();
	}
	
//	public static void subtraction() {
//		int a = 10;
//		int b = 20;
//		int diff = b - a;
//		System.out.println(diff);
////		addition();
//	}
	

}
