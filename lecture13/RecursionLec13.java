package lecture13;

public class RecursionLec13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsequences("abc", "");

	}
	
	public static void subsequences(String ques, String ans) {
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		
		String qt = ques.substring(1);
		subsequences(qt, ans);
		subsequences(qt, ans+ques.charAt(0));
	}

}
