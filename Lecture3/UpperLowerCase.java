package Lecture3;

import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("Upper");
		}
		else if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("Lower");
		}
		else
		{
			System.out.println("Invalid");
		}
		if(ch == '?')
		{
			System.out.println("Question Mark");
		}

	}

}
