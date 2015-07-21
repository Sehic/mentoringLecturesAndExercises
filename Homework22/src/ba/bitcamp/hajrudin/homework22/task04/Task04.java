package ba.bitcamp.hajrudin.homework22.task04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Key: ");
		int key = input.nextInt();
		System.out.println("Value: ");
		int value = input.nextInt();
		HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 1; i < key; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 1; j < value; j+=i) {
				list.add(j);
			}
			hmap.put(i, list);
		}

		System.out.println(hmap);
	}
}
