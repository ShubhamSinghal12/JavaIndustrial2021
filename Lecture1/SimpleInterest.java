package Lecture1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int r = sc.nextInt();
		int y = 3;
		
		int amount = (p*r*y)/100;
		
		System.out.println("Amount: "+amount);
		

	}

}
