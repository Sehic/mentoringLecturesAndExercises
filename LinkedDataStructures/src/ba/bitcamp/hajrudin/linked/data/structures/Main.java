package ba.bitcamp.hajrudin.linked.data.structures;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Trip t = new Trip(null);

		System.out.println("Enter trip");
		while (true) {
			String s = input.nextLine();
			if (s.equals("")) {
				break;
			} else {
				Place p = new Place(s);
				t.addPlace(p);
			}
		}

		System.out.println(t.toString());

		input.close();
	}

}
