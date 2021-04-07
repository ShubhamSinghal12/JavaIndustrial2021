package lecture18;

import java.util.Arrays;
import java.util.Scanner;

public class RatinMaze {

	public static int countAns = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String maze[] = new String[n];
		for(int i = 0; i < n; i++)
		{
			maze[i] = sc.next();
		}
		
		boolean board[][] = new boolean[n][m];
		mazePath(maze, board, 0, 0);
		System.out.println(countAns);

	}
	
	
	
	public static void mazePath(String[] maze, boolean board[][], int cr, int cc) {
		
//		System.out.println(cr+" "+cc);
		if(cr<0 || cr>=board.length || cc<0 || cc>=board[0].length 
				|| maze[cr].charAt(cc) == 'X' || board[cr][cc] == true)
		{
			return;
		}
		
		
		if(cr == board.length-1 && cc == board[0].length-1)
		{
			countAns += 1;
			board[cr][cc] = true;
			displayBoard(board);
			System.out.println();
			board[cr][cc] = false;
			return;
		}
		
		
		board[cr][cc] = true;
		
		mazePath(maze, board, cr, cc+1);
		mazePath(maze, board, cr+1, cc);
		mazePath(maze, board, cr, cc-1);
		mazePath(maze, board, cr-1, cc);
		
		
		board[cr][cc] = false;
		
		return;
	}
	
	public static void displayBoard(boolean board[][])
	{
		for(int i = 0; i < board.length; i++)
		{
			for( int j = 0; j < board[0].length; j++)
			{
				if(board[i][j])
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}


}
