package lecture9;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {1,1,2,5,5,7,7,8,10,10};
		int[] a2 = {1,3,3,7,7,7,7,10,13,15};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 0, j = 0;
		while(i < a1.length && j < a2.length)
		{
			if(a1[i] == a2[j])
			{
				al.add(a1[i]);
				i += 1;
				j += 1;
			}
			else if(a1[i] < a2[j])
			{
				i += 1;
			}
			else
			{
				j += 1;
			}
		}
		System.out.println(al);

	}

}
