package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		ArrayList<Character> days = new ArrayList<>(Arrays.asList('A','B','C','D'));
		System.out.println(days);
		shift(days);
		System.out.println(days);
		shift(days);
		System.out.println(days);
	}

	private static void shift(ArrayList<Character> days) {
		for(int i = days.size()-2; i>=0; i--){
			days.set(i+1, days.get(i));
		}
		
	}

}
