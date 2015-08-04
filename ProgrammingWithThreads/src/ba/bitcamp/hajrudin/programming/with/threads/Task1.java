package ba.bitcamp.hajrudin.programming.with.threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		String fileName = in.nextLine();
		File file = new File(fileName);
		String word = in.nextLine();
		boolean tmp = false;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while (reader.ready()) {
				String line = reader.readLine();
				if (line.contains(word)) {
					tmp = true;
					break;
				}
			}
			System.out.println(tmp);
			reader.close();
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
