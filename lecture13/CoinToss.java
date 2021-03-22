package lecture13;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(coinToss(3));
		coinToss2(3, "",true);

	}
	
	public static ArrayList<String> coinToss(int n){
		if (n == 0) {
			return new ArrayList<String>(Arrays.asList(""));
		}
		ArrayList<String> al = coinToss(n-1);
		ArrayList<String> ans = new ArrayList<String>();
		
		for(String st : al)
		{
			ans.add(st+'H');
			ans.add(st+'T');
		}
		
		return ans;
	}
	
	public static void coinToss2 (int ques, String ans, boolean flag)
	{
		if(ques == 0)
		{
			System.out.println(ans);
			return;
		}
		if(flag)
		{
			coinToss2(ques-1,ans+"H",false);
		}
		coinToss2(ques-1,ans+"T",true);
	}

}
