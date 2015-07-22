package ba.bitcamp.hajrudin.streams.readers.and.writers.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream(new File(
					"employees.txt")));
			ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();
			System.out.println(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
