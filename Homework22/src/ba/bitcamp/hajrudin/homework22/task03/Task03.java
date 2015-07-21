package ba.bitcamp.hajrudin.homework22.task03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task03 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(4);
		nums.add(3);
		nums.add(5);
		nums.add(2);
		nums.add(9);
		nums.add(2);

		Iterator<Integer> it = nums.iterator();
		ArrayList<Integer> newList = new ArrayList<Integer>();
		int count = 0;
		while (it.hasNext()) {
			int a = 0;
			int b = 0;
			try {
				a = it.next();
				b = it.next();
			} catch (NoSuchElementException e) {}
			newList.add(a + b);
		}

		System.out.println(newList);
	}
}
