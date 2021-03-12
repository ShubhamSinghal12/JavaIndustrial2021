package lecture9;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 10;
//		Integer a = x; // Auto Boxing
//		Integer a1 = new Integer(3);
//		Integer a2 = Integer.valueOf(3);
//		int y = a2;// UnBoxing
//		
//		System.out.println(a);
//		a = a+a2;
//		System.out.println(a);
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.add(1, 100);
		
//		System.out.println(al.size());
//		System.out.println(al);
		
//		System.out.println(al.get(1));
		int x = al.set(1, 200);
		System.out.println(x);
		al.set(1, al.get(1)+100);
		System.out.println(al);
//		System.out.println(x);
		
		al.remove(1);
		System.out.println(al);
		
		for(int i:al)
		{
			System.out.println(i);
		}

	}
	
	

}
