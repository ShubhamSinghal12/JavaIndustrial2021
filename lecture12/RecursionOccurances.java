package lecture12;

import java.util.ArrayList;

public class RecursionOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 3, 8, 7 };
		System.out.println(firstOccurance(arr, 0, 2));
		System.out.println(lastOccurance(arr, 0, 2, -1));
		System.out.println(allOccurances(arr, 0, 100));

	}

	public static int firstOccurance(int[] arr, int id, int ele) {
		if (id == arr.length) {
			return -1;
		}

		if (arr[id] == ele)
			return id;
		else
			return firstOccurance(arr, id + 1, ele);
	}

	public static int lastOccurance(int[] arr, int id, int ele, int ans) {
		if (id == arr.length) {
			return ans;
		}
		if (arr[id] == ele) {
			ans = id;
		}
		return lastOccurance(arr, id + 1, ele, ans);

	}

	public static ArrayList<Integer> allOccurances(int[] arr, int id, int ele){
		if(id == arr.length)
		{
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> al = allOccurances(arr, id+1, ele);
		if(arr[id] == ele)
		{
			al.add(id);
		}
		return al;
	}
}
