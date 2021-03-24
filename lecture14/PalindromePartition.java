package lecture14;

public class PalindromePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromePart("abcb", "");

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

	public static void palindromePart(String ques, String ans) {
		
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		
		for(int i = 1; i <= ques.length(); i++)
		{
			String ns = ques.substring(0,i);
			if(isPalindrome(ns))
			{
				palindromePart(ques.substring(i), ans+"-"+ns);
			}
		}
	}
}
