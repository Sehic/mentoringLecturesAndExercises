package ba.bitcamp.hajrudin.generic.programming.in.java.exercise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		/**
		 * Planet p1 = new Planet("Zemlja", 653, 345, 3); Planet p2 = new
		 * Planet("Saturn", 653, 45, 3); Planet p3 = new Planet("Mars", 653,
		 * 6787, 3); Planet p4 = new Planet("Venera", 34, 345, 3); Planet p5 =
		 * new Planet("Jupiter", 98, 345, 3);
		 * 
		 * Planet[] planets = {p1,p2,p3,p4,p5};
		 * System.out.println(Arrays.toString(planets));
		 * 
		 * Arrays.sort(planets);
		 * 
		 * System.out.println(Arrays.toString(planets));
		 * 
		 * Planet.sortByMass(planets);
		 * 
		 * System.out.println(Arrays.toString(planets));
		 **/

		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < 100000; i++) {
			list.add((int) (Math.random() * 100));
		}

		System.out.println(list);

		Iterator<Integer> it = list.iterator();
		int num = 7;

		while (it.hasNext()) {
			int tmp = it.next();
			if (tmp % num == 0) {
				it.remove();
			}
		}
		
		System.out.println(list);
		
		
	}
}
