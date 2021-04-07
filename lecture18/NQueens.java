package lecture18;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nQueens(new boolean[5][5],0, 5,"");

	}
	
	public static boolean isItSafe(boolean board[][], int row, int col) {
		
		int c = 0;
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

	public static void nQueens(boolean board[][], int row, int tq,String ans)
	{
		if(tq == 0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int col = 0; col < board[0].length; col++)
		{
			board[row][col] = true;
			if(isItSafe(board,row,col))
			{
				nQueens(board, row+1, tq-1, ans+"{"+row+"-"+col+"} ");
			}
			board[row][col] = false;
		}
		
		
	}
	

}
