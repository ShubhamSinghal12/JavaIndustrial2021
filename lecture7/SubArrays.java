package lecture7;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,-4,4};
//		subArrays(arr);
//		subArrays2(arr);
		kanades(arr);

	}
	public static int print(int[] arr,int a,int b) {
		int sum = 0;
		for(int i = a; i <= b; i++)
		{
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println(" Sum: "+ sum);
		return sum;
	}
	
	public static void subArrays(int[] arr)
	{
		int max_sum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++)
		{
			for(int j = i ; j < arr.length; j++)
			{
				int sum = print(arr, i, j);
				if(sum > max_sum)
				{
					max_sum = sum;
				}
			}
		}
		System.out.println("Max Sum: "+ max_sum);
	}
	
	public static void subArrays2(int[] arr)
	{
		int max_sum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length;i++)
		{
			int sum = 0;
			for(int j = i ; j < arr.length; j++)
			{
				sum += arr[j];
				if(sum > max_sum)
				{
					max_sum = sum;
				}
			}
		}
		System.out.println("Max Sum: "+ max_sum);
	}

	public static void kanades(int[] arr) {
		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			if(sum > max_sum)
			{
				max_sum = sum;
			}
			if(sum < 0)
			{
				sum = 0;
			}
		}
		System.out.println("Max Sum: "+max_sum);
	}
}
