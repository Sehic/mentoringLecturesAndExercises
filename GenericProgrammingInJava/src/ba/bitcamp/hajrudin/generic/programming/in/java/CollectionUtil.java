package ba.bitcamp.hajrudin.generic.programming.in.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionUtil {
	
	public static void printCollection(Collection<String> strings){
		Iterator<String> iter = strings.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Acd");
		list.add("aasd");
		list.add("asdas");
		printCollection(list);
	}
	
	
}
