package ba.bitcamp.hajrudin.array.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,10,11,12));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0));
		System.out.println("      "+list.toString());
		for(int i = 0; i < 360; i++){
			int a = list.get((int)(Math.random()*list.size()));
			list2.set(a, list2.get(a)+1);
		}
		
		System.out.println(list2.toString());
		
	}
}
