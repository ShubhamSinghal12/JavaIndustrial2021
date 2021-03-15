package lecture10;

import java.util.Arrays;

public class StringQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printSubString("Hello");
//		System.out.println(isPalindrome("nitiN"));
//		System.out.println(palindromicSubString("Hello"));
		reverseWord2("sky is blue");

	}
	
	public static void printSubString(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i+1; j <= s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
	
	public static boolean isPalindrome(String s) {
		int si = 0;
		int ei = s.length()-1;
		while(si<ei)
		{
			if(s.charAt(si) == s.charAt(ei))
			{
				si++;
				ei--;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}

	public static int palindromicSubString(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i+1; j <= s.length(); j++) {
				if(isPalindrome(s.substring(i,j)))
				{
					count++;
				}
			}
		}
		
		return count;
	}

	public static void reverseWord(String s)
	{
		int j = s.lastIndexOf(' ');
		String ans = "";
		while(j != -1) {
			
			String prev = s.substring(0,j);
			
			String pr = s.substring(j+1);
			ans = ans+pr+" ";
			
			s = prev;
			j = s.lastIndexOf(' ');
		}
		ans = ans+s;
		System.out.println(ans);
	}
	
	public static void reverseWord2(String s) {
		String tokdae[] = s.split(" ");
		System.out.println(Arrays.toString(tokdae));
	}
}
