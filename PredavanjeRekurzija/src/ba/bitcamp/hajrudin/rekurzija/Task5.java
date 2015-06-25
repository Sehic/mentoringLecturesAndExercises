package ba.bitcamp.hajrudin.rekurzija;

import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {
		int [] arr = new int [6];
		fillArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void fillArray(int array[]){
		fillArray(array, 0);
	}
	private static void fillArray(int[] array, int i) {
		if(i==array.length){
			return;
		}
		array[i]=i+1;
		fillArray(array,i+1);
	}
}
