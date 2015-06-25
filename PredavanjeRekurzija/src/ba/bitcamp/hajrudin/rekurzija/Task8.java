package ba.bitcamp.hajrudin.rekurzija;

import java.util.Arrays;

public class Task8 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

	public static void fillArray(int[] arr, int n) {
		arr[n] = n;
		fillArray(arr, n, n - 1, 1, true);
		fillArray(arr, n, n + 1, 1, false);
	}

	private static void fillArray(int[] arr, int n, int i, int j, boolean a) {
		if (i < 0 || i == arr.length) {
			return;
		}
		
		arr[i] = arr[n] - j;
		j += 1;
		
		if (a) {
			fillArray(arr, n, i - 1, j, true);
		} else {
			fillArray(arr, n, i + 1, j, false);
		}

	}

}
