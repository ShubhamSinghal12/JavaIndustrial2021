package lecture23;

public class Axis_Orbit_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st = "aabaa";
		
		int count = 0;
		//ODD
		for(int i = 0; i < st.length(); i++)
		{
			count++;
			int li = i-1;
			int ri = i+1;
			while(li >= 0 && ri <st.length() && st.charAt(li) == st.charAt(ri))
			{
				count++;
				li--;
				ri++;
			}
		}
		System.out.println(count);
//		System.out.println(palindromicSubString(st));
		
		
		//Even
		for(float i = 0.5f; i < st.length(); i++)
		{
			int li = (int)(i-0.5f);
			int ri = (int)(i+0.5f);
			while(li >= 0 && ri <st.length() && st.charAt(li) == st.charAt(ri))
			{
				count++;
				li--;
				ri++;
			}
		}
		
		System.out.println(count);
		System.out.println(palindromicSubString(st));

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
			for(int j = i+2; j <= s.length(); j+=2) {
				String st = s.substring(i,j);
				if(isPalindrome(st))
				{
					count++;
				}
			}
		}
		
		return count;
	}

}
