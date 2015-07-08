package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.Arrays;

public class Task7 {
	public static void main(String[] args) {
		getArray(10,3,2,6);
	}

	private static void getArray(int i, int j, int k, int l) {
		int []arr=new int [i];
		Arrays.fill(arr, -1);
		Arrays.fill(arr, k, l+1, j);
		System.out.println(Arrays.toString(arr));
	}
}
