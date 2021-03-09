package lecture7;

public class BarGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,9,5,7};
		barGraph(arr);

	}
	
	public static int maximum(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	public static void barGraph(int[] arr) {
		int max = maximum(arr);
		int row = 1;
		while(row <= max) {
			
			for(int i = 0; i < arr.length; i++)
			{
				if(row > max-arr[i])
				{
					System.out.print("| ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			row += 1;
		}
	}

}
