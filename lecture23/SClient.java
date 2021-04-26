package lecture23;

public class SClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Student s1 = new Student();
		
//		System.out.println(s.name+" "+s.age);
		
		s.name = "Amit";
		s.age = 15;
		
		s1.name = "Rohit";
		s1.age = 30;
		
		
		System.out.println(s.name+" "+s.age);
		System.out.println(s1.name+" "+s1.age);
		
		Test2(s, s1);
		
		
		System.out.println(s.name+" "+s.age);
		System.out.println(s1.name+" "+s1.age);
		
	}
	
	public static void Test1(Student s,Student s1)
	{
		Student temp = s;
		s = s1;
		s1 = temp;
		
	}
	
	public static void Test2(Student s,Student s1)
	{
		s = new Student();
		String tempName = s.name;
		s.name = s1.name;
		s1.name = tempName;
		
		s1 = new Student();
		int tempAge = s.age;
		s.age = s1.age;
		s1.age = tempAge;
		
	}
	
	

}
