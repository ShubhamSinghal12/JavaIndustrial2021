package Lecture1;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print(" Enter a: ");
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();

		if (a >= b && a >= c) {int t = 1;
			System.out.println("a: " + a +" "+ t);
		}
		 else if (b >= c) {
			System.out.println("b: " + b);
		} else {
			System.out.println("c: " + c);
		}
	}

}
