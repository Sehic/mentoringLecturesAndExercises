package ba.bitcamp.hajrudin.rekapitulacija;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Enter search");
		Scanner input = new Scanner(System.in);
		String search = input.nextLine();

		Search s = new Search(search);
		try {
			s.startSearch();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		input.close();
	}
}
