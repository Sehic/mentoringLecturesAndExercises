package ba.bitcamp.hajrudin.streams.readers.and.writers.exercise;

import java.io.PrintWriter;

public class Task2 {
	public static void main(String[] args) {
		char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','V','Z'};
		PrintWriter pw = new PrintWriter(System.out);
		
		
		pw.write(arr, 0, 10);
		pw.println();
		pw.write(arr, 10, 10);
		pw.println();
		pw.write(arr, 20, 2);
		pw.close();
	}
}
