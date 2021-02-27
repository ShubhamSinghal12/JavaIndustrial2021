package lecture2;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8965432;
		int rotations = 50;
		
		int nod = 0;
		int i = 1;
		while(i <= n)
		{
			nod++;
			i = i*10;
		}
		
		System.out.println(nod);
		int ans = 0;
		rotations = rotations%nod;
		if(rotations < 0)
		{
			rotations = nod + rotations;
		}
		
//		for(int rot = 1; rot <= rotations; rot++)
//		{
//			int rem = n%10;
//			ans = rem*(int)Math.pow(10, nod-1) + (n/10);
//			n = ans;
//		}
		
		int multi = (int)Math.pow(10, rotations);
		int a = n%multi;
		int b = n/multi;
		ans = a*(int)Math.pow(10, nod-rotations)+b;
		
		System.out.println(ans);

	}

}
