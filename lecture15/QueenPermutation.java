package lecture15;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		qp(new boolean[4],2,0,"");
//		qc(new boolean[4],2,0,"",-1);
		qc2(new boolean[4],2,0,"",0);
		

	}
	
	
	public static void qp(boolean board[], int tq, int qpsf,String ans) {
		if(qpsf == tq)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < board.length; i++)
		{
			if(board[i] == false)
			{
				board[i] = true;
				qp(board, tq, qpsf+1, ans+"q"+qpsf+"b"+i+" ");
				board[i] = false;
			}
		}
	}
	
	
	public static void qc(boolean board[], int tq, int qpsf,String ans,int lastplaced) {
		if(qpsf == tq)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i = lastplaced+1; i < board.length; i++)
		{
			if(board[i] == false)
			{
				board[i] = true;
				qc(board, tq, qpsf+1, ans+"q"+"b"+i+" ",i);
				board[i] = false;
			}
		}
	}

	public static void qc2(boolean board[], int tq, int qpsf,String ans, int bid) {

		if(tq == qpsf)
		{
			System.out.println(ans);
			return;
		}
		if(bid >= board.length)
		{
			return;
		}
		
		//Place
		board[bid] = true;
		qc2(board, tq, qpsf+1, ans+"q"+"b"+bid+" ", bid+1);
		board[bid] = false;
		
		//Not Place
		qc2(board, tq, qpsf, ans, bid+1);
		
	}
}
