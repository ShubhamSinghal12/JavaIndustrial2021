package Lecture1;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int t = a+i*d;
			System.out.print(t);
			System.out.print(" ");
			i = i + 1;
		}

	}

}
