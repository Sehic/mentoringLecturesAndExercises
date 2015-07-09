package ba.bitcamp.hajrudin.searching.and.sorting;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 33);
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int n = 7;
		binarySearch(arr,n);
	}

	private static int binarySearch(int[] arr, int n) {
		return 0;
	}
}
