package lecture18;

import java.util.Arrays;

public class Sudoko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		sudoko(grid, 0, 0);

	}
	
	public static void sudoko(int[][] grid, int row, int col)
	{
		if(col == grid[0].length)
		{
			row += 1;
			col = 0;
		}
		if(row == grid.length)
		{
			display(grid);
			return;
		}
		
		if(grid[row][col] != 0)
		{
			sudoko(grid, row, col+1);
			return;
		}
		
		for(int val = 1; val <= 9; val++)
		{
			if(isItSafe(grid,row,col,val))
			{
				grid[row][col] = val;
				sudoko(grid, row, col+1);
				grid[row][col] = 0;
			}
		}
		
	}
	
	public static boolean isItSafe(int[][] grid, int row, int col, int val) {
		
		int c = 0;
		while(c < 9)
		{
			if(val == grid[row][c])
				return false;
			c++;
		}
		
		int r = 0;
		while(r < 9)
		{
			if(val == grid[r][col])
				return false;
			r++;
		}
		
		r = row-row%3;
		c = col-col%3;
		
		for(int i = r; i< r+3; i++)
		{
			for(int j = c; j<c+3; j++)
			{
				if(grid[i][j] == val)
					return false;
			}
		}
		
		return true;
	}

	public static void display(int[][] grid)
	{
		for(int[] ar:grid)
			System.out.println(Arrays.toString(ar));
	}
}
