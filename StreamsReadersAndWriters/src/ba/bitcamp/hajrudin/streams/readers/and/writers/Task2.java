package ba.bitcamp.hajrudin.streams.readers.and.writers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Task2 {
	public static void main(String[] args) {
		InputStream is = System.in;
		
		PrintWriter pw = new PrintWriter(System.out);
		

		try {
			is = new FileInputStream("NekiFile.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			do {
				System.out.print((char) is.read());
			} while ((is.available()) > 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
