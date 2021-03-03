package Lecture3;

import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int minF = 0;
		int maxF = 100;
		int step = 20;
		for(int i = minF; i <= maxF; i += step)
		{
			int c = (int)((5f/9)*(i-32));
			System.out.println(i+" -----> "+ c);
		}

	}

}
