package ba.bitcamp.hajrudin.streams.readers.and.writers.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task1 {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0){
				pw.print(i + " STRING ");
			}else
				pw.print(i + " ");
		}
		pw.flush();
		try {
			pw = new PrintWriter(new File("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0){
				pw.print(i + " STRING ");
			}else
				pw.print(i + " ");
		}
		pw.close();
	}
}
