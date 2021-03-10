package lecture8;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(search(arr, 100));

	}

	public static boolean search(int[][] arr, int ele) {

		int i = 0;
		int j = arr[0].length - 1;
		while (i < arr.length && j >= 0) {
			if (arr[i][j] == ele) {
				return true;
			} else if (arr[i][j] > ele) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

}
