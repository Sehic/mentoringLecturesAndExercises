package ba.bitcamp.hajrudin.lists.and.sets.maps.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<Character> hset = new HashSet<>();
		while(true){
			String s = input.nextLine();
			if(s.equalsIgnoreCase("end")){
				break;
			} else {
				for(int i = 0; i<s.length(); i++)
				hset.add(s.charAt(i));
			}
		}
		
		int count = 0;
		Iterator<Character> it = hset.iterator();
		
		while(it.hasNext()){
			count++;
			it.next();
		}
		
		System.out.println(count);
		
		input.close();
	}
}
