package lecture17;

public class Queen2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2DCombinationKill(new boolean[2][4], 0, 0, 2, "");
		

	}
	
	public static void q2DCombination(boolean board[][], int row, int col, int tq,String ans) {
		
		if(tq == 0)
		{
			System.out.println(ans);
			return;
		}
		
		if(col == board[0].length)
		{
			row += 1;
			col = 0;
		}
		if(row == board.length)
		{
			return;
		}
		
		//Queen placed
		board[row][col] = true;
		q2DCombination(board, row, col+1, tq-1, ans+"{"+row+"-"+col+"} ");
		board[row][col] = false;
		
		//Queen Not Placed
		q2DCombination(board, row, col+1, tq, ans);
		
		
		
	}
	
	public static void q2DCombinationKill(boolean board[][], int row, int col, int tq,String ans) {
		
		if(tq == 0)
		{
			System.out.println(ans);
			return;
		}
		
		if(col == board[0].length)
		{
			row += 1;
			col = 0;
		}
		if(row == board.length)
		{
			return;
		}
		
		//Queen placed
		board[row][col] = true;
		if(isItSafe(board,row,col))
		{
			q2DCombinationKill(board, row, col+1, tq-1, ans+"{"+row+"-"+col+"} ");
		}
		board[row][col] = false;
		
		//Queen Not Placed
		q2DCombinationKill(board, row, col+1, tq, ans);
		
		
		
	}
	
	public static boolean isItSafe(boolean board[][], int row, int col) {
		int c = 0;
		while(c<col)
		{
			if(board[row][c] == true)
			{
				return false;
			}
			c++;
		}
		int r = 0;
		while(r<row)
		{
			if(board[r][col] == true)
			{
				return false;
			}
			
			r++;
		}
		
		c = col-1;
		r = row-1;
		while(r>=0 && c>=0)
		{
			if(board[r][c] == true)
			{
				return false;
			}
			
			r--;
			c--;
		}
		
		c = col+1;
		r = row-1;
		while(r>=0 && c<board[0].length)
		{
			if(board[r][c] == true)
			{
				return false;
			}
			
			r--;
			c++;
		}
		
		return true;
		
	}
	
	
public static void nQueens(boolean board[][], int row, int col, int tq,String ans) {
		
		if(tq == 0)
		{
			System.out.println(ans);
			return;
		}
		
		if(col == board[0].length)
		{
			row += 1;
			col = 0;
		}
		if(row == board.length)
		{
			return;
		}
		
		//Queen placed
		board[row][col] = true;
		if(isItSafe(board,row,col))
		{
			nQueens(board, row+1, 0, tq-1, ans+"{"+row+"-"+col+"} ");
		}
		board[row][col] = false;
		
		//Queen Not Placed
		nQueens(board, row, col+1, tq, ans);
		
	}

}
