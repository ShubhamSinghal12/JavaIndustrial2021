package lecture14;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(permutations1("abc"));
		p2("abc","");

	}
	
	public static ArrayList<String> permutations1(String ques){
		
		if(ques.length() == 0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		
		char ch = ques.charAt(0);
		ArrayList<String> al = permutations1(ques.substring(1));
		ArrayList<String> rr = new ArrayList<String>();
		
		for(String st : al) {
			for(int i = 0; i <= st.length(); i++)
			{
				String nr = st.substring(0,i) + ch + st.substring(i);
				rr.add(nr);
			}
		}
		return rr;
	}
	
	public static void p2(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < ques.length(); i++)
		{
			String nq = ques.substring(0,i)+ques.substring(i+1);
			p2(nq, ans+ques.charAt(i));
		}
	}

}
