package ba.bitcamp.hajrudin.lists.and.sets.maps.exercise;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0; i<20; i++){
			list1.add((int)(Math.random()*50+50));
		}
		
		System.out.println(list1);
		
		ListIterator<Integer> it = list1.listIterator();
		
		while(it.hasNext()){
			list2.add(it.next());
		}
		
		while(it.hasPrevious()){
			list2.add(it.previous());
		}
		
		System.out.println(list2);
	}
}
