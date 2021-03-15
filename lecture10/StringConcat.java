package lecture10;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "hello ";
//		String s2 = "bye";
//		String x = new String("hi ");
//		String y = new String("hi ");
//		String s3 = s1+s2;
//		String s4 = s1.concat(s2);
//		
//		System.out.println(s3);
//		System.out.println(s4);
//		
//		System.out.println(x==y);
//		System.out.println(x.equals(y));
//		
//		System.out.println(x == s1);
//		System.out.println(x.equals(s1));
//		
//		s1 = s1.replace('l','q');
//		System.out.println(s1);

		String a = "hello";
		long start = System.currentTimeMillis();
		for(int i = 1; i <= 100000; i++)
		{
			a = a+i;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}

}
