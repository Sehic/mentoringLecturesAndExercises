package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.Arrays;

public class Task4 {
	public static void main(String[] args) {
		boolean temp = nnnnn("BitCamp", 'f');
		System.out.println(temp);
	}

	private static boolean nnnnn(String s, char c) {
		char[] arr = new char [s.length()];
		for(int i=0; i<s.length(); i++){
			arr[i]=s.charAt(i);
		}
		int a =  Arrays.binarySearch(arr, c);
		if(a<0){
			return false;
		}
		return true;
		
	}
}
