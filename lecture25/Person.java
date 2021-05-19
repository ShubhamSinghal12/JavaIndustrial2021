package lecture25;

public class Person {

	private String name;
	private int age;
	
	
//	public Person() {
//		
//	}
	
	public Person(){
		
		this("-",0);
		
	}
	
	public Person(String myname,int myage){
		setName(myname);
		setAge(myage);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age){
		
		try {
			if( age < 0)
			{
				throw new Exception("Age is negative");
			}
			this.age = age;
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage()+" Setting age to 0");
			this.age = 0;
		}
		int[] ar = new int[1];
		System.out.println(ar[2]);
	}

	public void introduceYourself() {
		System.out.println("Hi I am "+ name);
		System.out.println("My age is "+ age);
	}
	
	
	
}
