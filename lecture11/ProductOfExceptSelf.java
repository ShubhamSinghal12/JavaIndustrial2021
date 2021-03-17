package lecture11;

import java.util.Arrays;

public class ProductOfExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4};
		
		int ans[] = new int[nums.length];
		
		ans[0] = 1;
		for(int i = 1; i <nums.length; i++)
		{
			ans[i] = nums[i-1]*ans[i-1];
		}
		System.out.println(Arrays.toString(ans));
		
		int t = 1;
		for(int i = nums.length-1; i >= 0; i--)
		{
			ans[i] = ans[i]*t;
			t = t*nums[i];
		}
		System.out.println(Arrays.toString(ans));

	}

}
