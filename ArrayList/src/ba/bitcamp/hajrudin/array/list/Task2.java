package ba.bitcamp.hajrudin.array.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("this","is","lots","of","fun","for","every","Java","programmer"));
		ArrayList<String> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == 4) {
				list2.add("****");
			}
			list2.add(list.get(i));
		}
		System.out.println(list.toString());
		System.out.println(list2.toString());
	}
}
