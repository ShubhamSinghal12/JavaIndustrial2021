package Lecture1;

public class PascalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int i = 0;
		while(i < n) {
			int cob = 1;
			float j = 1;
			while(j <= i+1) {
				System.out.print(cob+" ");
				cob = (int)(((i-j+1)/j)*cob);
				j += 1;
			}
			i += 1;
			System.out.println();
			
		}

	}

}
