package lecture9;

import java.util.ArrayList;

public class SumofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {9,9,5,4};
		int[] a2 = {6,5};
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = a1.length-1;
		int j = a2.length-1;
		int c = 0;
		while(i >= 0 || j >= 0)
		{
			int sum = 0;
			if(i >= 0)
			{
				sum += a1[i];
				i -= 1;
			}
			
			if(j >= 0)
			{
				sum += a2[j]; 
				j -= 1;
			}
			sum += c;
			c = sum/10;
			al.add(0,sum%10);
		}
		if(c > 0)
			al.add(0,c);
		System.out.println(al);

	}

}
