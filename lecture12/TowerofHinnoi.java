package lecture12;

public class TowerofHinnoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHinnoi(3, "A", "C", "B");

	}
	
	public static void towerOfHinnoi(int n, String from, String to, String aux) {
		if(n==1)
		{
			System.out.println("Move 1 from "+from+" to "+to);
		}
		else
		{
			towerOfHinnoi(n-1, from, aux, to);
			System.out.println("Move "+n+" from "+from+" to "+to);
			towerOfHinnoi(n-1, aux, to, from);
		}
	}

}
