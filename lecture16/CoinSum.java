package lecture16;

import java.util.ArrayList;

public class CoinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = {2,3,5,6};
		int amount = 10;
//		coinSumArray(coins,amount,0,new ArrayList<Integer>());
		coinsumCR(coins, amount, "", 0);
		
	}
	
	public static void coinSum(int[] coins, int amount, int lastUsed,String ans) {
	
		if(amount == 0)
		{
			System.out.println(ans);
			return;
		}
		if(amount < 0)
		{
			return;
		}
		
		for(int i = lastUsed; i <coins.length;i++)
		{
			coinSum(coins, amount-coins[i], i, ans+coins[i]+" ");
		}
	}
	
	public static void coinSumArray(int[] coins, int amount, int lastUsed,ArrayList<Integer> ans) {
		
		if(amount == 0)
		{
			System.out.println(ans);
			return;
		}
		if(amount < 0)
		{
			return;
		}
		
		for(int i = lastUsed; i <coins.length;i++)
		{
			ans.add(coins[i]);
			coinSumArray(coins, amount-coins[i], i, ans);
			ans.remove(ans.size()-1);
			
		}
	}
	
	public static void coinsumCR(int[] coins, int amount, String ans, int ci) {
		if(amount == 0)
		{
			System.out.println(ans);
			return;
		}
		if(amount < 0 || ci >= coins.length)
		{
			return;
		}
		
		coinsumCR(coins, amount-coins[ci], ans+coins[ci]+" ", ci);
		
		
		coinsumCR(coins, amount, ans, ci+1);
		
	}

}
