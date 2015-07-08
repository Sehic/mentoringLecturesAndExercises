package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {
		String [] arr = getSort("Zaid","Camp","Bit","Auto");
		System.out.println(Arrays.toString(arr));
	}

	private static String[] getSort(String...s){
		Arrays.sort(s);
		return s;
	}
}
