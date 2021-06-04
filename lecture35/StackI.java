package lecture35;

public interface StackI extends StackII{
	
	//Abstract function
	public static int s = 10;
	public void push(int n);
	public int pop();
	public static void hello()
	{
		System.out.println("Hello");
	}

}
