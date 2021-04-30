package lecture26;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Case 1
		Parent obj = new Parent();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		
		obj.fun();
		obj.fun1();
		
		System.out.println(obj);
		
		//Case 2
		
		Parent obj1 = new Child();
		
		System.out.println(obj1.d);
		System.out.println(((Child)obj1).d);
		System.out.println(obj1.d1);
		System.out.println(((Child)obj1).d2);
		
		obj1.fun();
		obj1.fun1();
		((Child)obj1).fun2();
		
		//Case 3
//		Child obj2 = new Parent();
		
		
		//Case 4
		
		Child obj2 = new Child();
		
		System.out.println(obj2.d);
		System.out.println(((Parent)obj2).d);
		
		obj2.fun();
		((Parent)obj2).fun();
		obj2.fun2();
		
		
		
		

	}

}
