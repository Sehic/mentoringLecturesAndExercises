package ba.bitcamp.hajrudin.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String file = input.nextLine();
		File f = new File(file);
		if(f.exists() && f.isFile()){
			try {
				FileReader fr = new FileReader(f);
				char c;
				do{
					c = (char) fr.read();
					System.out.print(c);
				}while(c != 10);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("ERROR");
		}
	}
}
