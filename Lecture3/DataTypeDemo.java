package Lecture3;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 100;
		short s = 1000_0;
		int i = 10;
		long l =10;

//		Case1
//		b = (byte)s;
//		b = i;
//		b = l;
//		
		s = b;
//		s = i;
//		s = l;
		
		i = b;
		i = s;
//		i = l;
		l = 10l;
//		l = b;
//		l = s;
//		l = i;
//		
		
		//Case2 Explicit Type Casting
		
		// Case3
		int a = (int)1000_000_0001L;
		
		
		//Case4
		float f = 3.14f;
		
		//case5
		
		i = (int)f;
		
//		f = i;
//		System.out.println(i +" "+ f);
		
		
		//Case 6
		boolean bo = i == 10;
		if(bo)
		{
			////
		}
		
		//Case 7
		int t = 'a';
		char ch = (char)t;
		ch = (char)(ch + 1);
		int y = ch+1;
		ch++;
//		System.out.println((char)y);
		
		
		//Case 8
		
		System.out.println(10+20+"Hello"+ 10+20); 
		System.out.println(2+'a'+5);
		System.out.println(2+" "+5);
		System.out.println("A" + 'a'+"B");
		System.out.println("A" + "\t"+"B"); 
		System.out.println((int)'\t');		
		
		

	}

}
