package lecture10;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
//		StringBuilder sb1 = sb;
		sb.append("ll");
		System.out.println(sb);
//		System.out.println(sb1);
		sb.insert(2, "abc");
		System.out.println(sb);
		sb.setCharAt(2, 'x');
		System.out.println(sb);
		
		long start = System.currentTimeMillis();
		for(int i = 1; i <= 100000; i++)
		{
			sb.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);

		
	}

}
