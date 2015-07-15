package ba.bitcamp.hajrudin.generic.programming.in.java;

public class NumberUtils {
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,6,8,9,7};
		System.out.println(NumberUtils.getMax(arr));
	}
}
