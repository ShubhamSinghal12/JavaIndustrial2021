package lecture29;

public class OuterClass {
	
	private int x = 10;
	
	
	public void value()
	{
		System.out.println(x);
	}
	
	public class InnerClass{
		int y = 20;
		
		public void Innervalue() {
			System.out.println(y+" "+x);
		}
	}

}
