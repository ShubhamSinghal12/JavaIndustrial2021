package lecture28;

public class BuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,1,5,3,6,4};
		int maxp = 0;
		int minsofar = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(minsofar > arr[i])
			{
				minsofar = arr[i];
			}
			
			else
			{
				int profit = arr[i]-minsofar;
				if(maxp < profit)
				{
					maxp = profit;
				}
			}
			
//			for(int j = i-1; j >= 0; j--)
//			{
//				int profit = arr[i]-arr[j];
//				if(profit > maxp)
//				{
//					maxp = profit;
//				}
//			}
		}
		System.out.println(maxp);

	}

}
