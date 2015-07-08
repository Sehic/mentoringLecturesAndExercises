package ba.bitcamp.hajrudin.array.list.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
	
	private static ArrayList<String> days = new ArrayList<>(Arrays.asList("","Pon","Ut","Sri","Cet","Pet","Sub","Ned")); 
	
	public static void main(String[] args) {
		try{
		String s = getDay(7);
		System.out.println(s);
		}catch(IndexOutOfBoundsException e){
			System.out.println("Taj dan ne postoji!");
		}
	}

	private static String getDay(int i) {
		if(i<1 || i>7){
			throw new IndexOutOfBoundsException();
		}
		return days.get(i); 
	}
}
