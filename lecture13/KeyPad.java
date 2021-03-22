package lecture13;

public class KeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keyPadCombination("789", "");

	}
	
	public static String keyPad(char ch)
	{
		if(ch == '1')
		{
			return "ABC";
		}
		else if(ch == '2')
		{
			return "DEF";
		}
		else if(ch == '3')
		{
			return "GHIJ";
		}
		else if(ch == '4')
		{
			return "KLMN";
		}
		else if(ch == '5')
		{
			return "OPQ";
		}
		else if(ch == '6')
		{
			return "RST";
		}
		else if(ch == '7')
		{
			return "UV";
		}
		else if(ch == '8')
		{
			return "WX";
		}
		else
		{
			return "YZ";
		}
		
		
	}

	public static void keyPadCombination(String ques, String ans) {
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		String t = keyPad(ques.charAt(0));
		for(int i = 0; i < t.length(); i++)
		{
			keyPadCombination(ques.substring(1), ans+t.charAt(i));
		}
	}
}
