package lecture24;

public class Person {

	String name;
	int age;
	final int id;
	static int noOfPersons = 0;
	
	
//	public Person() {
//		
//	}
	
	public Person() {
		
		this("-",0,2);
		
//		name= "-";
//		age = 0;
//		id = 2;
//		noOfPersons++;
	}
	
	public Person(String myname,int myage,int myid) {
		
		name = myname;
		age = myage;
		id = myid;
		noOfPersons++;
	}
	
	public Person(Person p)
	{
		name = p.name;
		age = p.age;
		id = p.id;
		noOfPersons++;
	}
	
//	
//	public Person(String myname) {
//		name = myname;
//	}
//	
	public void introduceYourself() {
		name = "ABC";
		System.out.println("Hi I am "+ name);
		System.out.println("My age is "+ age);
	}
	
	public void sayHi(String name) {
		System.out.println(this.name +" says hi to "+ name);
	}
	
	public void fun()
	{
		introduceYourself();
	}
	
	
	public static void fun2()
	{
		System.out.println("funnnnnn");
	}

}
