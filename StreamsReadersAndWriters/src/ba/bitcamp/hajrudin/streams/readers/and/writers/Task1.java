package ba.bitcamp.hajrudin.streams.readers.and.writers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Task1 {

	private static void printByteArray(byte[] array) {

		for (byte b : array) {

			System.out.print((char) b);
		}
		System.out.println();
	}

	
	
	public static void main(String[] args) {

		InputStream is = System.in;
		OutputStream os = System.out;
		
		Reader r = new InputStreamReader(System.in);
		
		Writer w = new OutputStreamWriter(System.out);
		
		BufferedReader br = new BufferedReader(r);
		
		BufferedWriter bw = new BufferedWriter(w);
		
		

		byte[] buffer = new byte[3];

		try {
			int read = 0;
			do {
				
				read = is.read(buffer);
				os.write(buffer, 0, read);
				
			} while ((is.available()) > 0);
			
			String s = "Hello world";
			os.write(s.getBytes());
			
			
			
			
		
			Scanner in = new Scanner(System.in);
			//System.out.println(in.nextLine());

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Finished");
		try {
			is.close();
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// for (byte b : buffer) {
		//
		// System.out.println((char) b);
		// }

	}

}