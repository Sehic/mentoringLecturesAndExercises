package ba.bitcamp.hajrudin.searching.and.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr));
		boolean temp = true;
		while (temp) {
			temp = false;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					temp = true;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}
}
