package lecture12;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subsequencesAscii("abc"));

	}

	public static ArrayList<String> subsequences(String s) {
		if (s.length() == 0) {
			return new ArrayList<String>(Arrays.asList(""));
		}
		char ch = s.charAt(0);
		ArrayList<String> al = subsequences(s.substring(1));
		ArrayList<String> ans = new ArrayList<String>();
		
		for(String st : al)
		{
			ans.add(st);
			ans.add(ch+st);
		}
		
		return ans;
	}
	
	public static ArrayList<String> subsequencesAscii(String s) {
		if (s.length() == 0) {
			return new ArrayList<String>(Arrays.asList(""));
		}
		char ch = s.charAt(0);
		ArrayList<String> al = subsequencesAscii(s.substring(1));
		ArrayList<String> ans = new ArrayList<String>();
		
		for(String st : al)
		{
			ans.add(st);
			ans.add(ch+st);
			ans.add((int)ch+st);
		}
		
		return ans;
	}

}
