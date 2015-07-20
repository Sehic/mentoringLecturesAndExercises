package ba.bitcamp.hajrudin.writing.generic.classes.and.methods.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task1 {
	
	public static <T> void printAll(Collection<T> c){
		System.out.println(c);
	}
	
	public static <T> int countOccurences(Collection<T> c, T obj){
		int count = 0;
		Iterator<T> it = c.iterator();
		while(it.hasNext()){
			if(it.next().equals(obj)){
				count++;
			}
		}
		return count;
	}
	
	public static <T> void printType(Collection<T> c){
		if(c instanceof Map){
			System.out.println("Map");
		} else if(c instanceof List){
			System.out.println("List");
		} else if(c instanceof Set){
			System.out.println("Set");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	}
}
