package lecture8;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		print(arr);
		transpose(arr);
		System.out.println();
		print(arr);

	}

	public static void transpose(int[][] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
	}

	public static void print(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	
}
