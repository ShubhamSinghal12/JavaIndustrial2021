package lecture8;

public class PrintArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
//		waveVertical(arr);
//		waveHorizontal(arr);
		spiral(arr);

	}

	public static void waveVertical(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i] + " ");
				}
			}
			else {
				for(int j = arr.length-1; j >= 0; j--)
				{
					System.out.print(arr[j][i] + " ");
				}
			}
		}
	}

	public static void waveHorizontal(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			}
			else {
				for(int j = arr[0].length-1; j >= 0; j--)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

	public static void spiral(int[][] arr)
	{
		int min_row = 0,max_row = arr.length-1;
		int min_col = 0,max_col = arr[0].length-1;
		
		int total_ele = arr.length * arr[0].length;
		int count = 0;
		
		while(count<total_ele) {
		
			for(int i = min_col; i <= max_col; i++)
			{
				System.out.print(arr[min_row][i]+" ");
				count++;
			}
			min_row++;
			
			for(int i = min_row; i <= max_row; i++)
			{
				System.out.print(arr[i][max_col]+" ");
				count++;
			}
			max_col--;
			
			for(int i = max_col; i>=min_col; i--)
			{
				System.out.print(arr[max_row][i]+" ");
				count++;
			}
			max_row--;
			
			for(int i = max_row; i >= min_row; i--)
			{
				System.out.print(arr[i][min_col]+" ");
				count++;
			}
			min_col++;
			
		}
	}
}
